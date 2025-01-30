package dev.capp.repository;

import dev.capp.model.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainRepository {

    public List<Train> findAll() {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("FR123", "Frecciarossa"));
        trains.add(new Train("IC456", "Intercity"));
        trains.add(new Train("RG789", "Regionale"));
        return trains;
    }
}
