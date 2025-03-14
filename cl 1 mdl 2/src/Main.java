
public class Main {
    public static void main(String[] args) {
        // Membuat objek Hewan
        Hewan hewan1 = new Hewan("Ayam", "Unggas", "pok-pok-pok!");
        Hewan hewan2 = new Hewan("Bebak", "Unggas", "wek-wek-wek!!");

        // Memanggil metode tampilkanInfo() untuk kedua objek
        System.out.println("Informasi Hewan 1:");
        hewan1.tampilkanInfo();

        System.out.println("Informasi Hewan 2:");
        hewan2.tampilkanInfo();
    }
}

