public class RekeningBank {
    // Atribut
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Konstruktor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println("---------------------------");
    }

    // Method 2
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor uang: " + jumlah);
        tampilkanInfo();
    }

    // Method 3
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik uang: " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi untuk tarik uang sebesar: " + jumlah);
        }
        tampilkanInfo();
    }
}

