package fr.isep.aerien;

/**
 * Gère le lien entre un passager et son vol.
 */
public class Reservation {
    private String numeroReservation;
    private String dateReservation;
    private String statut;
    private Vol vol; // Association avec la classe Vol

    // Constructeur (Méthode "Create" du CRUD)
    public Reservation(String numeroReservation, String dateReservation, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.vol = vol;
        this.statut = "En attente"; // Statut par défaut [cite: 62]
    }

    // --- Méthodes demandées par le diagramme [cite: 64, 77] ---

    public void confirmerReservation() {
        this.statut = "Confirmée";
        System.out.println("La réservation " + numeroReservation + " est maintenant confirmée.");
    }

    public void annulerReservation() {
        this.statut = "Annulée";
        System.out.println("La réservation " + numeroReservation + " a été annulée.");
    }

    public void modifierReservation(String nouvelleDate) {
        this.dateReservation = nouvelleDate;
        System.out.println("Date de réservation mise à jour.");
    }

    // Getters et Setters pour le CRUD
    public String getNumeroReservation() { return numeroReservation; }
    public String getStatut() { return statut; }
    public Vol getVol() { return vol; }
}