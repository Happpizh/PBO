public class Main {
    public static void main(String[] args) {
        Ticket economyTicket = new EconomyTicket("Budi", 1000000);
        Ticket businessTicket = new BusinessTicket("Vincent", 1000000);
        Ticket firstClassTicket = new FirstClassTicket("Roni", 1000000);

        // Menampilkan informasi tiket
        System.out.println("=== Sistem Reservasi Tiket Pesawat ===\n");
        economyTicket.displayInfo();
        System.out.println();
        businessTicket.displayInfo();
        System.out.println();
        firstClassTicket.displayInfo();
    }
}
