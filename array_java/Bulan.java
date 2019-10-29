public class Bulan{
    public static void main(String[] args){
        // langkah 1: deklarasi variable
        int monthDays[];
        // langkah 2: penciptaan array pada bilangan int dengan 12 element
        monthDays = new int[12];
        monthDays[0] = 31; // januari
        monthDays[1] = 29; // februari
        monthDays[2] = 31; // maret
        monthDays[3] = 30; // april
        monthDays[4] = 31; //mei
        monthDays[5] = 30; // juni
        monthDays[6] = 31; // juli
        monthDays[7] = 30; // agustus
        monthDays[8] = 31; // september
        monthDays[9] = 30; // oktober
        monthDays[10] = 31; // november
        monthDays[11] = 30;  //desember

        System.out.println("Agustus mempunyai "+monthDays[7]+" hari");
        System.out.println("Februari mempunyai "+monthDays[1]+" hari");
    }
}