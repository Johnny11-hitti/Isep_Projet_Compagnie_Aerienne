package fr.isep.aerien;

public class Avion {

    private int id;
    private String modele;
    private boolean disponible = true;

    public Avion(int id, String modele) {
        this.id = id;
        this.modele = modele;
    }

    public boolean verifierDisponibilite() {
        return disponible;
    }

    public void affecterVol() {
        disponible = false;
    }

    public int getId() {
        return id;
    }
}