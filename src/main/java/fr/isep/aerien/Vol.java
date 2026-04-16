package fr.isep.aerien;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String etat;

    public Vol(String num, String org, String dest, String depart) {
        this.numeroVol = num;
        this.origine = org;
        this.destination = dest;
        this.dateHeureDepart = depart;
        this.etat = "Planifié";
    }

    public void planifierVol() { /* Logique de planification */ }
    public void annulerVol() { this.etat = "Annulé"; }
}