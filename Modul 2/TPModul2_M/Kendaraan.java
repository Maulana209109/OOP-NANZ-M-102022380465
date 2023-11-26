import java.text.DecimalFormat;

public class Kendaraan {
    private String noindentifikasi;
    private double kecepatanmax;
    private int kapPenumpag;

    public Kendaraan(String noindentifikasi, double kecepatanmax, int kapPenumpag) {
        this.noindentifikasi = noindentifikasi;
        this.kecepatanmax = kecepatanmax;
        this.kapPenumpag = kapPenumpag;
    }

    public String toString() {
        return "Nomor Identifikasi: " + noindentifikasi +
                "\nKecepatan Maksimum: " + kecepatanmax + " km/jam" +
                "\nKapasitas Penumpang: " + kapPenumpag +  " org";
    }

   public String hitungWaktu(double jarak) {
        double waktu = jarak / kecepatanmax;
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(waktu);
    }

}
