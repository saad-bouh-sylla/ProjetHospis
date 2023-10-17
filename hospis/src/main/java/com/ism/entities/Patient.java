package com.ism.entities;

public class Patient extends AbstractEntity {
    
    public Patient(int id, String nomComplet) {
        super();
    }

    public Patient(int i, String nomPatient, String prenomPatient) {
    }

    public int addPatient(Patient patient) {
        return tablePatient.insert(patient);
    }

}
