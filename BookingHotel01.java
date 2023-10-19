import java.util.Scanner;

public class BookingHotel01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double saldo = 0;
        String[] daftarKamar = {"Kamar Standar Rp. ", "Kamar Deluxe Rp. ", "Suite Rp. "};
        double[] hargaKamar = {200000, 400000, 800000};
        int pilihanKamar; 

       System.out.println();
       System.out.println("Selamat datang di layanan booking kamar!");

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Saldo");
            System.out.println("2. Transaksi pembayaran");
            System.out.println("3. Selesai");
            System.out.print("Pilih nomor (1/2/3): ");
            pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 1) {
                System.out.println("Saldo anda sekarang: " + saldo);
                System.out.println("Menu");
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
                System.out.println("Daftar Kamar:");
                for (int i = 0; i < daftarKamar.length; i++) {
                    System.out.println((i + 1) + ". " + daftarKamar[i] + hargaKamar[i] + "/malam");
                }

                System.out.print("Pilih jenis kamar (1/2/3): ");
                pilihanKamar = input.nextInt();
                input.nextLine();

                if (pilihanKamar >= 1 && pilihanKamar <= daftarKamar.length) {
                    System.out.print("Jumlah kamar: ");
                    int jumlahKamar = input.nextInt();
                    input.nextLine();
                    System.out.print("Jumlah tamu: ");
                    int jumlahTamu = input.nextInt();
                    input.nextLine();
                    System.out.print("Berapa hari anda akan menginap: ");
                    int jumlahHari = input.nextInt();
                    input.nextLine();

                    double totalPembayaran = hargaKamar[pilihanKamar - 1] * jumlahHari * jumlahKamar;

                    System.out.println("Total yang harus anda bayar sebesar: " + totalPembayaran);

                    if (saldo >= totalPembayaran) {
                        saldo -= totalPembayaran;
                        System.out.println("Pembayaran berhasil!");
                        System.out.println("Sisa saldo anda: " + saldo);
                    } else {
                        System.out.println("Saldo tidak mencukupi untuk pembayaran ini.");
                    }
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih! Sampai jumpa.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}