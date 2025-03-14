public class Hewan {
    // Atribut
    String nama;
    String jenis;
    String suara;

    // Konstruktor
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Method untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewan: " + jenis);
        System.out.println("Suara Hewan: " + suara);
        System.out.println("---------------------------");
    }
}
