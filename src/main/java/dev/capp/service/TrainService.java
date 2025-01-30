package dev.capp.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/trains")
public class TrainService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getTrains() {
        return List.of("Frecciarossa", "Intercity", "Regionale");
    }
}
