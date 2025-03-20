// Kelas Pahlawan turunan dari KarakterGame
public class Pahlawan extends KarakterGame {

    // Konstruktor mengatur nama dan kesehatan awal pahlawan
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    //Serangan khusus pahlawan
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan Orbital Strike!");

        // Mengurangi kesehatan musuh
        target.setKesehatan(target.getKesehatan() - 20);

        // Menampilkan kesehatan musuh
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}
