import java.util.ArrayList;

public class FoodOrder {
    // Atribut
    private ArrayList<MenuItem> menuItems; // Daftar menu yang dipesan
    private double totalPrice; // Total harga pesanan
    private boolean isPaid; // Status pembayaran

    // Konstruktor
    public FoodOrder() {
        menuItems = new ArrayList<>();
        totalPrice = 0.0;
        isPaid = false;
    }

    // Metode untuk menambahkan item ke pesanan
    public void addItem(MenuItem item) {
        menuItems.add(item);
        totalPrice += item.getPrice();
        System.out.println(item.getName() + " ditambahkan dengan harga Rp" + item.getPrice());
    }

    // Metode untuk menghapus item dari pesanan
    public void removeItem(MenuItem item) {
        if (menuItems.contains(item)) {
            menuItems.remove(item);
            totalPrice -= item.getPrice();
            System.out.println(item.getName() + " dihapus dengan harga Rp" + item.getPrice());
        } else {
            System.out.println(item.getName() + " tidak ditemukan dalam pesanan.");
        }
    }

    // Metode untuk mendapatkan total harga pesanan
    public double getTotalPrice() {
        return totalPrice;
    }

    // Metode untuk menandai pesanan sebagai sudah dibayar
    public void markAsPaid() {
        isPaid = true;
        System.out.println("Pesanan telah dibayar.");
    }

    // Metode untuk mengecek apakah pesanan sudah dibayar
    public boolean isOrderPaid() {
        return isPaid;
    }

    // Metode untuk menampilkan detail pesanan
    public void showOrderDetails() {
        System.out.println("Pesanan:");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName() + ": Rp" + item.getPrice());
        }
        System.out.println("Total harga: Rp" + totalPrice);
        System.out.println("Status dibayar: " + (isPaid ? "Sudah dibayar" : "Belum dibayar"));
    }

    // Main method untuk testing
    public static void main(String[] args) {
        // Membuat beberapa item menu
        MenuItem nasiGoreng = new MenuItem("Nasi Goreng", 25000);
        MenuItem esTeh = new MenuItem("Es Teh", 5000);
        MenuItem ayamBakar = new MenuItem("Ayam Bakar", 30000);

        // Membuat pesanan
        FoodOrder order = new FoodOrder();

        // Menambahkan item ke pesanan
        order.addItem(nasiGoreng);
        order.addItem(esTeh);
        order.addItem(ayamBakar);

        // Menampilkan detail pesanan
        order.showOrderDetails();

        // Menghapus salah satu item dari pesanan
        order.removeItem(esTeh);

        // Menampilkan total harga setelah penghapusan
        System.out.println("Total harga setelah penghapusan: Rp" + order.getTotalPrice());

        // Menandai pesanan sebagai sudah dibayar
        order.markAsPaid();

        // Menampilkan status pembayaran
        System.out.println("Status pembayaran: " + (order.isOrderPaid() ? "Sudah dibayar" : "Belum dibayar"));
    }
}
