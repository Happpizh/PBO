public class MenuItem {
    // Atribut
    private String name; // Nama item menu
    private double price; // Harga item menu

    // Konstruktor
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Metode untuk mendapatkan nama item
    public String getName() {
        return name;
    }

    // Metode untuk mendapatkan harga item
    public double getPrice() {
        return price;
    }
}
