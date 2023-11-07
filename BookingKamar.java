import java.util.Scanner;

public class BookingKamar {
    Scanner input = new Scanner(System.in);
    double saldo = 0.0;
    String[] daftarKamar = {"Kamar Standar", "Kamar Deluxe", "Suite"};
    double[] hargaKamar = {200000, 400000, 800000};
    int[] ketersediaanKamar = {5, 3, 2};
    String[] kamarTerbooking = new String[10];
    int jumlahKamarTerbooking = 0;

    public static void main(String[] args) {
        BookingKamar bookingKamar = new BookingKamar();
        bookingKamar.run();
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Selamat Datang di Tidurin.Aja");
            System.out.println("Menu:");
            System.out.println("1. Tambah Saldo");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. List Kamar Terbooking");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int menuChoice = input.nextInt();

            switch (menuChoice) {
                case 1:
                    tambahSaldo();
                    break;
                case 2:
                    pesanKamar();
                    break;
                case 3:
                    tampilkanKamarTerbooking();
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Terima kasih, dan sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (isRunning) {
                System.out.println("Tekan enter untuk kembali ke menu.");
                input.nextLine();
                input.nextLine();
            }
        }
        input.close();
    }

    public void tambahSaldo() {
        System.out.print("Masukkan jumlah saldo yang ingin Anda tambahkan: Rp. ");
        double tambahanSaldo = input.nextDouble();
        saldo += tambahanSaldo;
        System.out.println("Saldo Anda sekarang: Rp. " + saldo);
    }

    public void pesanKamar() {
        System.out.println("Daftar Kamar:");
        for (int i = 0; i < daftarKamar.length; i++) {
            System.out.println((i + 1) + ". " + daftarKamar[i] + " - Harga: Rp. " + hargaKamar[i] + "/malam - Tersedia: " + ketersediaanKamar[i]);
        }

        System.out.print("Pilih nomor kamar yang ingin Anda pesan: ");
        int nomorKamar = input.nextInt();
        nomorKamar--;

        if (nomorKamar >= 0 && nomorKamar < daftarKamar.length) {
            if (ketersediaanKamar[nomorKamar] > 0) {
                System.out.print("Masukkan jumlah kamar yang ingin Anda pesan: ");
                int jumlahKamar = input.nextInt();

                System.out.print("Masukkan jumlah hari menginap: ");
                int jumlahHari = input.nextInt();

                double totalBiaya = hargaKamar[nomorKamar] * jumlahKamar * jumlahHari;

                if (saldo >= totalBiaya) {
                    saldo -= totalBiaya;
                    ketersediaanKamar[nomorKamar] -= jumlahKamar;
                    kamarTerbooking[jumlahKamarTerbooking] = daftarKamar[nomorKamar] + " - " + jumlahKamar + " kamar - " + jumlahHari + " hari";
                    jumlahKamarTerbooking++;
                    System.out.println("Pemesanan berhasil!");
                    System.out.println("Total biaya: Rp. " + totalBiaya);
                    System.out.println("Saldo tersisa: Rp. " + saldo);
                    System.out.println("Sisa kamar " + daftarKamar[nomorKamar] + ": " + ketersediaanKamar[nomorKamar]);

                } else {
                    System.out.println("Saldo tidak mencukupi untuk pemesanan ini.");
                }
            } else {
                System.out.println("Kamar tidak tersedia.");
            }
        } else {
            System.out.println("Nomor kamar tidak valid.");
        }
    }

    public void tampilkanKamarTerbooking() {
        System.out.println("Kamar yang Sudah Terbooking:");
        if (jumlahKamarTerbooking == 0) {
            System.out.println("Belum ada kamar yang terbooking.");
        } else {
            for (int i = 0; i < jumlahKamarTerbooking; i++) {
                System.out.println(kamarTerbooking[i]);
            }
        }
    }
}

//Kelompok 9 1F SIB
