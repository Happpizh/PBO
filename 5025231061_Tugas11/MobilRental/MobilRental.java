import java.util.ArrayList;

public class MobilRental {

    public static void main(String[] args) {
        // Membuat daftar mobil
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        // Menambahkan mobil yang tersedia
        daftarMobil.add(new MobilAda("Toyota Alphard", "MPV"));
        daftarMobil.add(new MobilAda("Honda Jazz", "Hatchback"));
        daftarMobil.add(new MobilAda("Daihatsu Xenia", "MPV"));

        // Menambahkan mobil yang disewa
        daftarMobil.add(new MobilSewa("Honda civic", "MPV", "Tono"));
        daftarMobil.add(new MobilSewa("Nissan GTR", "Hatchbsck", "Agus"));

        // Menampilkan daftar mobil yang tersedia
        System.out.println("Daftar Mobil Tersedia:");
        for (Mobil mobil : daftarMobil) {
            if (mobil instanceof MobilAda) {
                mobil.tampilkanInfo();
            }
        }

        System.out.println("\nDaftar Mobil Disewa:");
        // Menampilkan daftar mobil yang disewa
        for (Mobil mobil : daftarMobil) {
            if (mobil instanceof MobilSewa) {
                mobil.tampilkanInfo();
            }
        }
    }
}
