package fr.isep.aerien;
public class Reservation {

    private static int compteur = 1;
    private int numeroReservation;
    private Passager passager;
    private Vol vol;

    public Reservation(Passager passager, Vol vol) {
        this.numeroReservation = compteur++;
        this.passager = passager;
        this.vol = vol;
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public String obtenirReservations() {
        return "Reservation " + numeroReservation +
               " | Passager: " + passager.obtenirInfos() +
               " | " + vol.obtenirVol();
    }
}