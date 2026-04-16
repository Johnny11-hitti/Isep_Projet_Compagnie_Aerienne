package fr.isep.aerien;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAerienne {

    private static List<Vol> vols = new ArrayList<>();
    private static List<Avion> avions = new ArrayList<>();
    private static List<Reservation> reservations = new ArrayList<>();


    public static void ajouterVol(Vol v) {
        vols.add(v);
    }

    public static Vol chercherVol(int id) {
        for (Vol v : vols) {
            if (v.getNumeroVol() == id)
                return v;
        }
        return null;
    }

    public static void annulerVol(int id) {
        vols.removeIf(v -> v.getNumeroVol() == id);
    }


    public static void ajouterAvion(Avion a) {
        avions.add(a);
    }


    public static void ajouterReservation(Reservation r) {
        reservations.add(r);
    }

    public static void annulerReservation(int id) {
        reservations.removeIf(r -> r.getNumeroReservation() == id);
    }
}