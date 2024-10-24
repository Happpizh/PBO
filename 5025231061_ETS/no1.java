// Kelas Induk (Super Class)
class Hewan {
    String nama;
    int umur;

    void bersuara() {
        System.out.println("Hewan ini bersuara");
    }
}

// Kelas Turunan (Sub Class)
class Kucing extends Hewan {
    // Override metode bersuara
    @Override
    void bersuara() {
        System.out.println("Kucing ini mengeong");
    }
}

class Anjing extends Hewan {
    // Override metode bersuara
    @Override
    void bersuara() {
        System.out.println("Anjing ini menggonggong");
    }
}

// Contoh penggunaan:
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Mimi";
        kucing.umur = 2;
        kucing.bersuara(); // Output: Kucing ini mengeong

        Anjing anjing = new Anjing();
        anjing.nama = "Bobby";
        anjing.umur = 3;
        anjing.bersuara(); // Output: Anjing ini menggonggong
    }
}
