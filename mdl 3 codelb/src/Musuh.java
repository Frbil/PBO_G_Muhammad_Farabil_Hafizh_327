// Kelas Musuh turunan dari KarakterGame
public class Musuh extends KarakterGame {

    // mengatur nama dan kesehatan awal musuh
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Serangan khas mush
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");

        // Mengurangi kesehatan target
        target.setKesehatan(target.getKesehatan() - 15);

        // Menampilkan sisa kesehatan target
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}
