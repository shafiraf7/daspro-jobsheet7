import java.util.Scanner;

public class kafeDoWhile26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRitu = 2000, totalharga;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' / 'keluar')");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("Transakasi dibatalkan");
            break;
            }
            System.out.println("jumlah kopi");
            kopi = sc.nextInt();
            System.out.println("jumlah teh");
            teh = sc.nextInt();
            System.out.println("jumlah roti");
            roti = sc.nextInt();

            totalharga=(kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRitu);
            System.out.println("Total yang harus di bayar : Rp" +totalharga);
            sc.nextLine();
            
        } while (true);
        System.out.println("Semusa transakassi selesai");
        sc.close();
        
    }
    
}
