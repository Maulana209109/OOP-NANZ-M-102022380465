public class Mobil extends Kendaraan {
    private int jmlPintu;

    public Mobil(String noidentifikasi, double kecepatanmax, int kapPenumpang, int jmlPintu) {
        super(noidentifikasi, kecepatanmax, kapPenumpang);
        this.jmlPintu = jmlPintu;
    }

    public String toString() {
        return super.toString() +
                "Jumlah Pintu: " + jmlPintu;
    }

}
