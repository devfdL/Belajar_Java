import java.util.Scanner;
public class pilihprogram {
    public static void main(String[] args) {
        int pilihan;
        Scanner masukan = new Scanner(System.in);
        do{
            System.out.println("Pilihlah Menu Berikut Ini :");
            System.out.println("1.Cetak");
            System.out.println("2.Lihat");
            System.out.println("3.Keluar");
            System.out.print("Pilihan User : ");
            pilihan = masukan.nextInt(); 
        
            if(pilihan==1){
                System.out.println("Cetak Laporan. Siapkan Printer");
            }
            else if(pilihan==2){
                System.out.println("Tampilkan Laporan");
            } 
        }
        while(pilihan!=3);
    }
}