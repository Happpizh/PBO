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


public class ParkingTicketMachine {
    // Atribut
    private int balance; // Saldo yang dimasukkan oleh pengguna
    private int ticketPrice; // Harga tiket per jam
    private int ticketTime; // Waktu parkir yang dibeli dalam jam

    // Konstruktor
    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;
        this.ticketTime = 0;
    }

    // Metode untuk menambahkan uang ke saldo
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Uang dimasukkan: Rp" + amount);
        } else {
            System.out.println("Nominal uang tidak valid.");
        }
    }

    // Metode untuk mengeluarkan tiket jika saldo mencukupi
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice; // Menghitung berapa jam parkir yang bisa dibeli
            balance = balance % ticketPrice; // Sisakan sisa uang jika ada
            System.out.println("Tiket dikeluarkan untuk " + ticketTime + " jam.");
        } else {
            System.out.println("Saldo tidak mencukupi untuk membeli tiket.");
        }
    }

    // Metode untuk mengembalikan jumlah waktu parkir yang dibeli
    public int getTimePurchased() {
        return ticketTime;
    }

    // Metode untuk mendapatkan saldo saat ini
    public int getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args) {
        ParkingTicketMachine machine = new ParkingTicketMachine(5000); // Harga tiket Rp5000 per jam
        
        machine.insertMoney(10000); // Masukkan uang Rp10.000
        machine.issueTicket(); // Keluarkan tiket berdasarkan saldo
        
        int timePurchased = machine.getTimePurchased(); // Ambil waktu parkir yang dibeli
        System.out.println("Waktu parkir yang dibeli: " + timePurchased + " jam.");
    }
}
