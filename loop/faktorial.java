import java.util.Scanner;
public class faktorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int f=1;
        System.out.print("masukan Bilangan Faktorial = ");
        int n=in.nextInt();
        System.out.println("============================== ");
        for(int i=1; i<=n; i++)
        f*=i;
        System.out.println(n+" ! = "+f);
    }
}