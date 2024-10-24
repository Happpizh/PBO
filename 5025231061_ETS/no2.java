public class Book {
    // Atribut kelas
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategori;

    // Konstruktor untuk menginisialisasi atribut
    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategori = kategori;
    }

    // Metode untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Penerbit: " + namaPenerbit);
        System.out.println("Kategori: " + kategori);
    }

    // Main method untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek Book
        Book buku1 = new Book("Belajar Java", "Jane Doe", 2020, "Penerbit B", "Pemrograman");
        
        // Memanggil metode printDetails untuk mencetak detail buku
        buku1.printDetails();
    }
}
