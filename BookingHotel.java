import java.util.Scanner;

public class BookingHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahHari, pilihan, jmlKamar, jmlTamu;
        double  total1, total2, twinBed = 400000, doubleBed = 200000;
        double saldo = 0;

        while (true) {
            System.out.println();
            System.out.println("Menu ");
            System.out.println("1. Saldo");
            System.out.println("2. Transaksi pembayaran");
            System.out.println("3. Selesai");
            System.out.println("Pilihlah nomor (1/2/3)");
            pilihan = input.nextInt();

            while (true)
            if(pilihan == 1) {
                System.out.println();
                System.out.println("saldo anda sekarang : " + saldo);
                System.out.println("Menu");
                System.out.println("1. Tambah saldo");
                System.out.println("2. Kembali");
                int pilihanSaldo = input.nextInt();
                if (pilihanSaldo == 1){
                     System.out.println();
                     System.out.print("Masukkan nominal saldo yang ditambahkan : ");
                     saldo += input.nextDouble();

                 }else if (pilihanSaldo == 2) {
                        break;
                 }else{
                        System.out.println("Undefined");
                 }
            } else if (pilihan == 2) {
                    System.out.println(); 
                     int pilkam;
                    System.out.println("Pilih salah satu ");
                    System.out.println("1. Twin bed");
                    System.out.println("2. Double bed ");
                    pilkam = input.nextInt();
                    if (pilkam == 1) {
                        System.out.println();
                        System.out.println("Harga kamar: " +twinBed);
                        
                    } else if (pilkam == 2) {
                        System.out.println("Harga kamar: " +doubleBed);
                    } else {
                        System.out.println("undefined");
                        break;
                    }

                    int pilTra1;
                    System.out.println("Pilih salah satu ");
                    System.out.println("1. lanjutkan");
                    System.out.println("2. kembali");
                    pilTra1 = input.nextInt();

                    if (pilTra1 == 1) {
                        System.out.println();
                        System.out.println("Jumlah kamar: ");
                        jmlKamar = input.nextInt();
                        System.out.println("Jumlah tamu: ");
                        jmlTamu = input.nextInt();
                        System.out.print("Berapa hari anda akan menginap ? ");
                        jumlahHari = input.nextInt();

                        total1 = twinBed * jumlahHari*jmlKamar;
                        total2 = doubleBed*jumlahHari*jmlKamar;
                        
                        System.out.println();
                        if (pilkam == 1) {
                            System.out.println("Total yang harus anda bayar sebesar : " + total1);
                        } else {
                            System.out.println("Total yang harus anda bayar sebesar :" +total2);

                        }
                        int pilTra;
                        System.out.println("Saldo anda sekarang : " + saldo);
                        System.out.println("Lanjutkan pembayaran ");
                        System.out.println("1. lanjutkan");
                        System.out.println("2. batalkan");
                        pilTra = input.nextInt();

                        if (pilTra == 1) {
                            double kembalian;
                            if (pilkam == 1) {
                                kembalian = saldo - total1;
                            } else {
                                kembalian = saldo - total2;

                            }

                            if (saldo >= total1) {
                                System.out.println();
                                System.out.println("Pembayaran berhasil !");
                                System.out.println("Sisa saldo anda : " + kembalian);
                                break;

                            } else if (saldo >= total2) {
                                    System.out.println("Pembayaran berhasil !");
                                    System.out.println("Sisa saldo anda : " + kembalian);
                                    break;
                            } else {
                            }
                        } else {
                            System.out.println("Transaksi di batalkan");
                        }

                    } else {
                        break;
                    }

                } else {
                    break;
                }
            }
        }
}
