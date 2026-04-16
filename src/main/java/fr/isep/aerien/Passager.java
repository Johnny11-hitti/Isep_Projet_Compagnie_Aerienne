package fr.isep.aerien;
import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {

    private List<Reservation> reservations = new ArrayList<>();

    public Passager(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public void reserverVol(Vol vol) {
        Reservation r = new Reservation(this, vol);
        reservations.add(r);
        CompagnieAerienne.ajouterReservation(r);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}