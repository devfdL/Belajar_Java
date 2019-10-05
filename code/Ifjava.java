import java.util.Scanner;
public class Ifjava{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int usia;

        System.out.print("Umur anda: ");
        usia = keyboard.nextInt();

        if(usia > 18){
            System.out.print("Umur anda lebih Dari 18\n");
        }
    }
}