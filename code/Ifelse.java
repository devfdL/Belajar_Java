import java.util.Scanner;
public class Ifelse
{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        
        int angka;

        System.out.print("Pilih angka: ");
        angka = keyboard.nextInt();

        if(angka % 2 == 0){
            System.out.println(angka + " adalah bilangan Genap");
        }else{
            System.out.println(angka + " adalah bilangan Ganjil");
        }
    }
}