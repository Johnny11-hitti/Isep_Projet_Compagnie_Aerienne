package fr.isep.aerien;
import java.util.ArrayList;
import java.util.List;


public class Vol {

    private int numeroVol;
    private Aeroport depart;
    private Aeroport arrivee;
    private Avion avion;
    private Pilote pilote;
    private List<PersonnelCabine> equipeCabine = new ArrayList<>();

    public Vol(int numeroVol, Aeroport depart, Aeroport arrivee) {
        this.numeroVol = numeroVol;
        this.depart = depart;
        this.arrivee = arrivee;

        depart.ajouterVolDepart(this);
        arrivee.ajouterVolArrivee(this);
    }

    public void affecterVol(Avion avion, Pilote pilote, List<PersonnelCabine> equipe) {
        if (avion.verifierDisponibilite()) {
            this.avion = avion;
            this.pilote = pilote;
            this.equipeCabine = equipe;
            avion.affecterVol();
        }
    }

    public String obtenirVol() {
        return "Vol " + numeroVol +
               " de " + depart.obtenirInfos() +
               " vers " + arrivee.obtenirInfos();
    }

    public int getNumeroVol() {
        return numeroVol;
    }
}