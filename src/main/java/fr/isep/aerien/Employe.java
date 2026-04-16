package fr.isep.aerien;

public abstract class Employe extends Personne {

    public Employe(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public abstract String obtenirRole();
}