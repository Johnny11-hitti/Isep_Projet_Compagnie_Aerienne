package fr.isep.aerien;

public class Pilote extends Employe {

    public Pilote(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }
}