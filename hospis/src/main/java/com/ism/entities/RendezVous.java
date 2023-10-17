package com.ism.entities;

import java.util.ArrayList;

public class RendezVous extends AbstractEntity {
    private double date;
    private int heure;
   


  

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    //Attributs Navigationnels
    //@ManyToOne
    Patient patient;
    //@ManyToMany
    ArrayList<Medecin> medecin = new ArrayList<>();
    
    public void add(Medecin medecin){
         medecin.add(medecin);
     }
  
    public ArrayList<Medecin> getMedecin() {
        return medecin;
    }

  
    
}
