package com.ism;

import java.util.ArrayList;
import java.util.Scanner;

import com.ism.entities.Medecin;
import com.ism.entities.Patient;
import com.ism.entities.RendezVous;

public class Main {
    public static void main(String[] args) {
           Scanner cs=new Scanner(System.in);
           int choix;
            do {
                System.out.println("1-Cree un patient");
                System.out.println("2-Cree un medecin");
                System.out.println("3-Planifier un rv");
                System.out.println("4-Affiche les rv du jour");
                System.out.println("5-Affiche les rv d'un medecin par jour");
                System.out.println("6-Annuler un rv");
                System.out.println("7-Quitter");
                System.out.println("Entrer votre choix ?");
                    choix=cs.nextInt();
                    Medecin medecinService;
                    Object rendezVousService;
                    switch (choix) {
                            case 1:
                            
                                System.out.println("Entrez le nom du patient : ");
                                String nomPatient = cs.next();
                                System.out.println("Entrez le prénom du patient : ");
                                String prenomPatient = cs.next();
                                Patient nouveauPatient = new Patient(1, nomPatient, prenomPatient); 
                                Patient patientService;
                                patientService.addPatient(nouveauPatient);
                                System.out.println("Patient créé avec succès !");
                                break;
                            case 2:
                                
                                System.out.println("Entrez le nom complet du médecin : ");
                                String nomCompletMedecin = cs.next();
                                System.out.println("Entrez la spécialité du médecin : ");
                                String specialiteMedecin = cs.next();
                                Medecin nouveauMedecin = new Medecin(1, nomCompletMedecin, specialiteMedecin); 
                                medecinService.addMedecin(nouveauMedecin);
                                System.out.println("Médecin créé avec succès !");
                                break;
                            case 3:
                                System.out.println("Entrez la date du rendez-vous : ");
                                double dateRendezVous = cs.nextDouble();
                                System.out.println("Entrez l'heure du rendez-vous : ");
                                int heureRendezVous = cs.nextInt();
                                break;
                            case 4:
                                double dateDuJour = /;
                                ArrayList<RendezVous> rendezVousDuJour = rendezVousService.getRendezVousDuJour(dateDuJour);
                                if (rendezVousDuJour.isEmpty()) {
                                    System.out.println("Aucun rendez-vous prévu pour aujourd'hui.");
                                } else {
                                    System.out.println("Rendez-vous prévus pour aujourd'hui :");
                                    for (RendezVous rendezVous : rendezVousDuJour) {
                                       rendezVous.toString();
                                    }
                                }
                                break;
                            case 5:
                              
                                System.out.println("Entrez le nom du médecin : ");
                                String nomMedecin = cs.next();
                                medecinService.getById(nomMedecin);
                                Medecin medecinSelectionne =;
                                ArrayList<RendezVous> rendezVousDuJourMedecin = medecinService.getRendezVousDuJourPourMedecin(dateDuJour, medecinSelectionne);
                                if (rendezVousDuJourMedecin.isEmpty()) {
                                    System.out.println("Aucun rendez-vous prévu pour ce médecin aujourd'hui.");
                                } else {
                                    System.out.println("Rendez-vous prévus pour ce médecin aujourd'hui :");
                                    for (RendezVous rendezVous : rendezVousDuJourMedecin) {
                                        rendezVous.toString();
                                    }
                                }
                                break;
                            case 6:
                                System.out.println("Entrez l'ID du rendez-vous à annuler : ");
                                int idRendezVousAAnnuler = cs.nextInt();
                                int resultatAnnulation = rendezVousService.annulerRendezVous(idRendezVousAAnnuler);
                                if (resultatAnnulation == 1) {
                                    System.out.println("Rendez-vous annulé avec succès !");
                                } else {
                                    System.out.println("Impossible d'annuler le rendez-vous. ID de rendez-vous introuvable.");
                                }
                                break;
                            case 7:
                                System.out.println("AU revoir : ");
                    }
            } while (choix !=7);
           cs.close();
    }
}