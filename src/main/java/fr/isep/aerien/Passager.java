package fr.isep.aerien;
import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations; // Liste demandée par le sujet

    public Passager(String id, String nom, String adresse, String contact, String passeport) {
        super(id, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    // Gestion des réservations (CRUD)
    public void reserverVol(Reservation reservation) {
        this.reservations.add(reservation);
        System.out.println("Réservation ajoutée pour le passager " + getNom());
    }

    public List<Reservation> obtenirReservations() {
        return reservations;
    }

    public void annulerReservation(String numReservation) {
        reservations.removeIf(r -> r.getNumeroReservation().equals(numReservation));
        System.out.println("Réservation " + numReservation + " supprimée.");
    }
}