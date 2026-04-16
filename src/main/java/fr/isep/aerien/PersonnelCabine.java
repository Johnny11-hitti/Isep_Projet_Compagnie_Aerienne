package fr.isep.aerien;

public class PersonnelCabine extends Employe {

    public PersonnelCabine(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    @Override
    public String obtenirRole() {
        return "Personnel Cabine";
    }
}