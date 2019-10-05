public class Arrayjava{
    public static void main(String[] args){
        // membuat variable
        String[] nama = {"Bayu", "Bagas", "Budi", "Andi"};
                        //  0       1       2        3   ....

        //cara mengambil variabel
        System.out.println(nama[2]);

        System.out.println("Urutan pada Array");
        for(int i = 0; i < nama.length; i++){
            System.out.println("Indeks ke-"+ i + ": "+ nama[i]);
        }
    }
}