package fr.isep.aerien;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    // Méthode demandée par le diagramme
    public void affecterVol() {
        System.out.println("Le vol a été affecté à l'aéroport : " + nom);
    }

    // Getters pour le CRUD
    public String getNom() { return nom; }
    public String getVille() { return ville; }
}