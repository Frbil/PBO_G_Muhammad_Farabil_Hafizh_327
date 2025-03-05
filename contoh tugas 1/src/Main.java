import java.util.Scanner;

public class Main {
    // Membuat objek Scanner untuk input dari pengguna
    private static Scanner penginput = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) { // Looping agar program terus berjalan
            System.out.println("Pilih Login:\n1. Admin\n2. Mahasiswa\nMasukkan Pilihan:");
            int pilihan = penginput.nextInt(); // Membaca input pilihan
            penginput.nextLine(); // Membersihkan newline di buffer

            // Menentukan proses berdasarkan pilihan pengguna
            switch (pilihan) {
                case 1:
                    admin(); // Memanggil metode login admin
                    break;
                case 2:
                    mahasiswa(); // Memanggil metode login mahasiswa
                    break;
                default:
                    System.out.println("Pilihan tidak valid."); // Jika input tidak sesuai
                    break;
            }
        }
    }

    // Metode untuk login sebagai admin
    public static void admin() {
        System.out.println("Masukkan username: ");  //mengambil output
        String usernameAdmin = penginput.nextLine(); // Input username admin
        System.out.println("Masukkan Password: ");
        String passwordAdmin = penginput.nextLine(); // Input password admin

        // Mengecek apakah username dan password sesuai
        if (usernameAdmin.equals("admin123") && passwordAdmin.equals("password123")) {
            System.out.println("Login Admin Berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    // Metode untuk login sebagai mahasiswa
    public static void mahasiswa() {
        System.out.println("Masukkan username: "); //mengambil output
        String usernamemahasiswa = penginput.nextLine(); // Input username mahasiswa
        System.out.println("Masukkan NIM: ");
        String passwordmahasiswa = penginput.nextLine(); // Input NIM mahasiswa

        // Mengecek apakah username dan NIM sesuai
        if (usernamemahasiswa.equals("farabil") && passwordmahasiswa.equals("202410370110327")) {
            System.out.println("Login Mahasiswa Berhasil!");
            System.out.println("Nama : " + usernamemahasiswa);
            System.out.println("NIM : " + passwordmahasiswa);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}
