package fr.isep.aerien;
import java.util.ArrayList;
import java.util.List;

public class Aeroport {

    private int id;
    private String nom;
    private String ville;

    private List<Vol> volsDepart = new ArrayList<>();
    private List<Vol> volsArrivee = new ArrayList<>();

    public Aeroport(int id, String nom, String ville) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }

    public void ajouterVolDepart(Vol vol) {
        volsDepart.add(vol);
    }

    public void ajouterVolArrivee(Vol vol) {
        volsArrivee.add(vol);
    }

    public String obtenirInfos() {
        return "Aéroport: " + nom + " | Ville: " + ville;
    }

    public int getId() {
        return id;
    }
}