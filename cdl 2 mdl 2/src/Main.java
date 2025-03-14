public class Main {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("54321", "Farabil", 1000000);
        RekeningBank rekening2 = new RekeningBank("09876", "Hafizh", 400000);


        System.out.println("Informasi rekening 1:");
        rekening1.tampilkanInfo();

        System.out.println("Informasi rekening 2:");
        rekening2.tampilkanInfo();


        rekening1.setorUang(10000);


        rekening2.tarikUang(14000);


        rekening1.tarikUang(40000);
    }
}
