import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jmlKamar, jmlTamu, jmlHari, tipeKamar;
        double saldo = 0, twinBed = 400000, doubleBed = 200000, total1, total2;

        System.out.println("Jumlah saldo anda: " +saldo);
        System.out.println("Tambahkan saldo: ");
        saldo += input.nextDouble();
        System.out.println("Saldo anda sekarang: " +saldo);
        System.out.println();
        
        int pilkam;
        System.out.println("Pilih salah satu ");
        System.out.println("1. Twin bed");
        System.out.println("2. Double bed ");
        pilkam = input.nextInt();

        if (pilkam == 1) {
            System.out.println();
            System.out.println("Harga kamar: " +twinBed);
        } else {
            System.out.println("Harga kamar: " +doubleBed);

        }
            System.out.println("Masukkan jumlah kamar: ");
            jmlKamar = input.nextInt();
            System.out.println("Jumlah tamu: ");
            jmlTamu = input.nextInt();
            System.out.println("Berapa hari anda akan menginap: ");
            jmlHari = input.nextInt();

            total1 = twinBed*jmlHari*jmlKamar;
            total2 = doubleBed*jmlHari*jmlKamar;
            
            if (pilkam == 1) {
                System.out.println("Jumlah yang harus anda bayarkan: " +total1);
            } else {
                System.out.println("Jumlah yang harus anda bayarkan: " +total2);

            }

            System.out.println("Saldo anda sekarang : " + saldo);

            int pilTra;
            System.out.println("Lanjutkan pembayaran ");
            System.out.println("1. lanjutkan");
            System.out.println("2. batalkan");
            pilTra = input.nextInt();

            if (pilTra == 1) {
                double kembalian = saldo - total1;
                if (pilkam == 1) {
                    kembalian = saldo - total1;
                } else {
                    kembalian = saldo - total2;

                }

                if (saldo >= total1) {
                    System.out.println("Pembayaran berhasil !");
                    System.out.println("Sisa saldo anda : " +kembalian);
                } else if (saldo >= total2) {
                        System.out.println("Pembayaran berhasil !");
                        System.out.println("Sisa saldo anda : " + kembalian);
                } else {
                    System.out.println("Transaksi dibatalkan saldo anda tidak mencukupi! ");
            }
        }
    }
}
