package fr.isep.aerien;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(String id, String nom, String adresse, String contact, 
                           String numEmp, String date, String qualification) {
        super(id, nom, adresse, contact, numEmp, date);
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel de Cabine (Qualification: " + qualification + ")";
    }

    public void affecterVol() {
        System.out.println("Membre d'équipage affecté au vol.");
    }
}