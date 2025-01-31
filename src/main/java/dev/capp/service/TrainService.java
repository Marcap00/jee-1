package dev.capp.service;

import dev.capp.model.Train;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/trains") // Endpoint Path
public class TrainService {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("trainPU");
    private final EntityManager entityManager = emf.createEntityManager();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Train> findAll() {
        return entityManager.createQuery("SELECT t FROM Train t", Train.class).getResultList();
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public Train addTrain(Train train) {
        entityManager.getTransaction().begin();
        entityManager.persist(train);
        entityManager.getTransaction().commit();
        return train;
    }
}
