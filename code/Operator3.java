public class Operator3 {
    public static void main(String[] args) {
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // apakah A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println("nilaiA > nilaiB: " + hasil);
        // apakah A lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println("nilaiA < nilaiB: " + hasil);
        // apakah A lebih besar samadengan B?
        hasil = nilaiA >= nilaiB;
        System.out.println("nilaiA >= nilaiB: " + hasil);
        // apakah A lebih kecil samadengan B?
        hasil = nilaiA <= nilaiB;
        System.out.println("nilaiA <= nilaiB: " + hasil);
        // apakah nilai A sama dengan B?
        hasil = nilaiA == nilaiB;
        System.out.println("nilaiA == nilaiB: " + hasil);
        // apakah nilai A tidak samadengan B?
        hasil = nilaiA != nilaiB;
        System.out.println("nilaiA != nilaiB: " + hasil);

    }

}