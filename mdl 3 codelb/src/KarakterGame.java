// Kelas dasar
public class KarakterGame {
    private final String nama; // Nama karakter
    private int kesehatan; //  kesehatan karakter

    // mengatur nama dan kesehatan awal karakter
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Mengembalikan nama karakter
    public String getNama() {
        return nama;
    }

    // Mengembalikan jumlah kesehatan karakter
    public int getKesehatan() {
        return kesehatan;
    }

    // Mengatur nilai kesehatan karakter
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Metode serang
    public void serang(KarakterGame target) {

    }
}
