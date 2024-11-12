public class MobilSewa extends Mobil {
    String penyewa;

    public MobilSewa(String nama, String tipe, String penyewa) {
        super(nama, tipe);
        this.penyewa = penyewa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Penyewa: " + penyewa);
    }
}
