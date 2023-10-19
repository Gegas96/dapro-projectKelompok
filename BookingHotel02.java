import java.util.Scanner;

public class BookingHotel02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double saldo = 0;
        double hargaKamarStandar = 200000;
        double hargaKamarDeluxe = 400000;
        double hargaSuite = 800000;
        int pilihanKamar;

        System.out.println();
        System.out.println("Selamat datang di layanan booking kamar!");

        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Saldo");
            System.out.println("2. Transaksi pembayaran");
            System.out.println("3. Selesai");
            System.out.print("Pilih nomor (1/2/3): ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println();
                System.out.println("Saldo anda sekarang: " + saldo);
                
                System.out.println("1. Tambah saldo");
                System.out.println("2. Kembali");
                System.out.print("Pilih nomor (1/2): ");
                int pilihanSaldo = input.nextInt();
                input.nextLine();

                if (pilihanSaldo == 1) {
                    System.out.print("Masukkan nominal saldo yang ditambahkan: ");
                    double tambahanSaldo = input.nextDouble();
                    input.nextLine();
                    saldo += tambahanSaldo;
                    System.out.println("Saldo Anda sekarang: " + saldo);
                } else if (pilihanSaldo == 2) {

                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (pilihan == 2) {
                System.out.println();
                System.out.println("Daftar Kamar:");
                System.out.println("1. Kamar Standar Rp. " + hargaKamarStandar + "/malam");
                System.out.println("2. Kamar Deluxe Rp. " + hargaKamarDeluxe + "/malam");
                System.out.println("3. Suite Rp. " + hargaSuite + "/malam");

                System.out.print("Pilih jenis kamar (1/2/3): ");
                pilihanKamar = input.nextInt();
                input.nextLine();

                double hargaKamar = 0;

                if (pilihanKamar == 1) {
                    hargaKamar = hargaKamarStandar;
                } else if (pilihanKamar == 2) {
                    hargaKamar = hargaKamarDeluxe;
                } else if (pilihanKamar == 3) {
                    hargaKamar = hargaSuite;
                } else {
                    System.out.println("Pilihan tidak valid.");
                    continue;
                }
                System.out.println();
                System.out.print("Jumlah kamar: ");
                int jumlahKamar = input.nextInt();
                input.nextLine();
                System.out.print("Jumlah tamu: ");
                int jumlahTamu = input.nextInt();
                input.nextLine();
                System.out.print("Berapa hari anda akan menginap: ");
                int jumlahHari = input.nextInt();
                input.nextLine();

                double totalPembayaran = hargaKamar * jumlahHari * jumlahKamar;

                System.out.println("Total yang harus anda bayar sebesar: " + totalPembayaran);

                if (saldo >= totalPembayaran) {
                    saldo -= totalPembayaran;
                    System.out.println();
                    System.out.println("Pembayaran berhasil!");
                    System.out.println("Sisa saldo anda: " + saldo);
                } else {
                    System.out.println("Saldo tidak mencukupi untuk pembayaran ini.");
                }
            } else if (pilihan == 3) {
                System.out.println();
                System.out.println("Terima kasih! Sampai jumpa.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}
