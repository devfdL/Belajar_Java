public class contoh{
    public static void main(String[] args){
        // membuat variable
        // array selalu di mulai dari 0
        // contoh array 1d:
        // contoh1
        String[] nama = {"Bayu", "Bagas", "Budi", "Andi"};
                        //  0       1       2        3   ....

        //contoh2
        int[] angka = {1, 2, 3, 4, 5};
                    // 0  1  2  3  4  ....

        // cara mengambil variabel contoh1
        System.out.println("---------- Contoh 1 -------");
        System.out.println("nama pada urutan ke-2 pada array: " + nama[2]);

        System.out.println("Urutan pada Array");
        for(int i = 0; i < nama.length; i++){
            System.out.println("Indeks ke-"+ i + ": "+ nama[i]);
        }

        // cara mengambil variabel contoh2
        System.out.println("---------- Contoh 2 -------");
        System.out.println("angka pada urutan ke-4 pada array: "+angka[4]);

        System.out.println("Urutan pada Array");
        for(int i = 0; i < angka.length; i++){
            System.out.println("Indeks ke-"+ i + ": "+ angka[i]);
        }
    }
}