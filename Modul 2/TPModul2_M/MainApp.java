
public class MainApp {
    public static void main(String[] args) {
       
        Mobil mobil = new Mobil("XYZ321", 120.0, 4, 3);
        Bus bus = new Bus("ABC571", 80.0, 30, 28);

        System.out.println("info Mobil:");
        System.out.println(mobil.toString());
        System.out.println("Waktu untuk jarak tempuh mobil berkecepatan 200 km: " + mobil.hitungWaktu(200) + " jam");

        System.out.println("info Bus:");
        System.out.println(bus.toString());
        System.out.println("Waktu untuk jarak tempuh Bus berkecepatan 200 km: " + bus.hitungWaktu(200) + " jam");
    }

}
