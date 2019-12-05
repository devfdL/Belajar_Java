import java.util.Scanner;

public class kuis{
    public static void main(String[] args){
        int pilihan,p,l,a,t,r,s;
        double luas, phi;
        phi = 3.15;

        Scanner input = new Scanner(System.in);

        System.out.println("Luas bangun datar");
        System.out.println("==================");
        System.out.println("1.Persegi");
        System.out.println("2.lingkaran");
        System.out.println("3.persegi panjang");
        System.out.println("4.segitiga");
        System.out.println("5.jajargenjang");
        System.out.println("==================");

        System.out.println("pilihan:");
        pilihan = input.nextInt(); 
        
        if(pilihan==1){
            System.out.println("Persegi");
            System.out.println("masukan panjang sisi:");
            s = input.nextInt();
            luas = s*s;
            System.out.println("Luas Persegi = " + luas);
        }
        else if(pilihan==2){
            System.out.println("Lingkaran");
            System.out.println("masukan jari-jari:");
            r = input.nextInt();
            luas = phi*r*r;
            System.out.println("Luas lingkaran = " + luas);
        } 
        else if(pilihan==3){
            System.out.println("Persegi Panjang");
            System.out.println("masukan panjang:");
            p = input.nextInt();
            System.out.println("masukan lebar:");
            l = input.nextInt();
            luas = p*l;
            System.out.println("Luas persegi panjang = " + luas);
        } 
        else if(pilihan==4){
            System.out.println("Segi Tiga");
            System.out.println("masukan alas:");
            a = input.nextInt();
            System.out.println("masukan tinggi:");
            t = input.nextInt();
            luas = a*t/2;
            System.out.println("Luas segitiga = " + luas);
        } 
        else if(pilihan==5){
            System.out.println("Jajargenjang");
            System.out.println("masukan alas:");
            a = input.nextInt();
            System.out.println("masukan tinggi:");
            t = input.nextInt();
            luas = a*t;
            System.out.println("Luas jajargenjang = " + luas);
        } 
    }
}