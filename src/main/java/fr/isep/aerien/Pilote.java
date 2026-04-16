package fr.isep.aerien;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public Pilote(String id, String nom, String adresse, String contact, String numEmp, String date, String licence, int heures) {
        super(id, nom, adresse, contact, numEmp, date);
        this.licence = licence;
        this.heuresDeVol = heures;
    }

    @Override
    public String obtenirRole() { return "Pilote"; }
    
    public void affecterVol() { /* Logique d'affectation */ }
}