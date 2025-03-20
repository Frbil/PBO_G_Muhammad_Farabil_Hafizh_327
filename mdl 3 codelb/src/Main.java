public class Main {
    public static void main(String[] args) {

        // karakter pahlawan dan musuh
        Pahlawan brimstone = new Pahlawan("Brimstone", 2000);
        Musuh viper = new Musuh("Viper", 2000);

        // informasi awal sebelum pertarungan dimulai
        System.out.println("Status awal:");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());
        System.out.println(); // output lebih rapi

        // Brimstone menyerang Viper
        brimstone.serang(viper);

        // Viper membalas serangan ke Brimstone
        viper.serang(brimstone);
    }
}
