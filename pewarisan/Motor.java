package pewarisan;

public class Motor extends Kendaraan {
    private int kapasitasMesin;
    private String jenisTransmisi;

    public Motor(final String merek, final String model, final int tahunProduksi) {
        super(merek, model, tahunProduksi);
    }

    public void infoMotor() {
        super.infoKendaraan();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
        System.out.println("Jenis Transmisi: " + jenisTransmisi);
    }
}
