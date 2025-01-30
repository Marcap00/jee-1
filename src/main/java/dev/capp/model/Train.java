package dev.capp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainCompany;
    private String trainCode;

    public Train() {}

    public Train(String trainCode, String trainCompany) {
        this.trainCode = trainCode;
        this.trainCompany = trainCompany;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    public String getTrainCompany() {
        return trainCompany;
    }

    public void setTrainCompany(String trainCompany) {
        this.trainCompany = trainCompany;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainCompany='" + trainCompany + '\'' +
                ", trainCode='" + trainCode + '\'' +
                '}';
    }
}
