import java.util.Scanner;
public class EKSPEDISI {
    public static void main(String[] args) {
        //Scanner
        Scanner input =new Scanner (System.in); 
        String DeskripsiBarang, alamat, JenisPengiriman=null;
        Double NomorPelacakan, beratBrg, biayapengiriman=0.0, totalBiaya, Jarak, totalll;
        //Input
        System.out.println("Deskripsi Barang : ");
        DeskripsiBarang=input.nextLine();
        System.out.println("Berat Barang (Kg): ");
        beratBrg=input.nextDouble();
        System.out.println("Alamat Pengirim dan Penerima : ");
        alamat=input.nextLine();
        input.nextLine();
        System.out.println("Masukkan Jarak pengiriman (Km) : ");
        Jarak=input.nextDouble();
        input.nextLine();
        int i = 0;
        //Perulangan
        while (i<1) {
             System.out.println("Jenis Pengiriman [Hemat/Reguler/Express] : ");
            JenisPengiriman=input.nextLine();
            if (JenisPengiriman.equalsIgnoreCase("Hemat")) {
                biayapengiriman=0.5;
                i++;
                break;
            } else if (JenisPengiriman.equalsIgnoreCase("Reguler")) {
                biayapengiriman=1.0;
                i++;
                break;
            } else if (JenisPengiriman.equalsIgnoreCase("Express")) {
                biayapengiriman=1.5;
                i++;
                break;
            } else {
                System.out.println("Jenis Pengiriman yang Anda Masukkan Salah");
            }
        }
        System.out.println("Nomor Pelacakan (resi) : ");
        NomorPelacakan=input.nextDouble();
        System.out.println();
        //Operator Aritmatika
        totalBiaya=Jarak*200;
        totalll=totalBiaya*biayapengiriman;
        //Kondisi
        if (beratBrg<8) {
            totalll*=0.75;
            System.out.println("SELAMAT ! Anda mendapatkan Diskon sebesar 15% dikarenakan berat barang kurang dari 8kg");
        } else {
        }
        //Output
        System.out.println("========== RINCIAN PENGIRIMAN ==========");
        System.out.println("Alamat pengirim dan penerima : " + alamat);
        System.out.println("Jenis/Nama Barang            : " + DeskripsiBarang);
        System.out.println("Berat Barang                 : " + beratBrg);
        System.out.println("Jarak Pengiriman             : " + Jarak + " Km");
        System.out.println("Jenis Pengiriman             : " + JenisPengiriman);
        System.out.println("Nomor Resi Pengiriman        : " + NomorPelacakan.intValue());
        System.out.println("Biaya Pengiriman             : Rp." + totalll.intValue());       
    }
}