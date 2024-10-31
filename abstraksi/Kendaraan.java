package abstraksi;

public class Kendaraan {
    String warna;

    public Kendaraan(final String warna) {
        this.warna = warna;
    }

    //abstract void bergerak();

    void info() {
        System.out.println("Warna Kendaraan: " + warna);
    }
}
