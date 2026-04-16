package fr.isep.aerien;

public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;

    public Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String obtenirInfos() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom;
    }

    public int getId() {
        return id;
    }
}