package fr.isep.aerien;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    public Avion(String imm, String mod, int cap) {
        this.immatriculation = imm;
        this.modele = mod;
        this.capacite = cap;
    }

    public boolean verifierDisponibilite() {
        return true; 
    }
}