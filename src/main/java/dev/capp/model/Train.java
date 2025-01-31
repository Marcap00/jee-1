package dev.capp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
/*@Table(name = "trains")*/
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@Column(name = "train_company", nullable = false, length = 100)*/
    private String trainCompany;

    /*@Column(name = "train_code", nullable = false, length = 50)*/
    private String trainCode;

    public Train() {}

    public Train(String trainCode, String trainCompany) {
        this.trainCode = trainCode;
        this.trainCompany = trainCompany;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    /*@Override
    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) return true;
        if (objectToCompare == null || getClass() != objectToCompare.getClass()) return false;
        Train train = (Train) objectToCompare;
        return Objects.equals(id, train.id) && Objects.equals(trainCode, train.trainCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trainCode);
    }*/
}
