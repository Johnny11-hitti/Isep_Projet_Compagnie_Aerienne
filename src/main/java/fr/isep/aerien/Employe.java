package fr.isep.aerien;

public class Employe extends Personne {
    private String numeroEmploye;
    private String dateEmbauche;

    public Employe(String id, String nom, String adresse, String contact, String numEmp, String date) {
        super(id, nom, adresse, contact); // Appelle le constructeur de Personne
        this.numeroEmploye = numEmp;
        this.dateEmbauche = date;
    }

    public String obtenirRole() {
        return "Employé Général";
    }
    
    // Getters et Setters pour CRUD
}