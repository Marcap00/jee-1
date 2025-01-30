package dev.capp.service;

import dev.capp.model.Train;
import dev.capp.repository.TrainRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/trains") // Endpoint Path
public class TrainService {
    private TrainRepository repository;

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("trainPU");
    private EntityManager em = emf.createEntityManager();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Train> getTrains() {
        return em.createQuery("SELECT t FROM Train t", Train.class).getResultList();
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public Train addTrain(Train train) {
        em.getTransaction().begin();
        em.persist(train);
        em.getTransaction().commit();
        return train;
    }

}
