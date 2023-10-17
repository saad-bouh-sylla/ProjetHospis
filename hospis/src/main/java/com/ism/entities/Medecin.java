package com.ism.entities;

import java.util.ArrayList;

public class Medecin extends AbstractEntity {
    private int id;
    private String nomComplet;
    private String specialite;
    public Medecin(int id, String nomComplet, String specialite) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.specialite = specialite;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    @Override
    public String toString() {
        return "Medecin [id=" + id + ", nomComplet=" + nomComplet + ", specialite=" + specialite + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nomComplet == null) ? 0 : nomComplet.hashCode());
        result = prime * result + ((specialite == null) ? 0 : specialite.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Medecin other = (Medecin) obj;
        if (id != other.id)
            return false;
        if (nomComplet == null) {
            if (other.nomComplet != null)
                return false;
        } else if (!nomComplet.equals(other.nomComplet))
            return false;
        if (specialite == null) {
            if (other.specialite != null)
                return false;
        } else if (!specialite.equals(other.specialite))
            return false;
        return true;
    }

    public int addMedecin(Medecin medecin) {
        return tableMedecin.insert(medecin);
    }
    public void add(Medecin medecin) {
    }
    public void getById(String nomMedecin) {
    }
    public ArrayList<RendezVous> getRendezVousDuJourPourMedecin(double dateDuJour, Medecin medecinSelectionne) {
        return null;
    }
   
  
}
