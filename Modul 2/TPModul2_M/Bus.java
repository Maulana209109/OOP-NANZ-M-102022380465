
public class Bus extends Kendaraan {
    private int jmlkursi;

    public Bus(String noidentifikasi, double kecepatanmax, int kapPenumpang, int jmlkursi) {
        super(noidentifikasi, kecepatanmax, kapPenumpang);
        this.jmlkursi = jmlkursi;
    }

    public String toString() {
        return super.toString() +
                "Jumlah Kursi: " + jmlkursi;
    }

}
