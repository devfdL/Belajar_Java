public class piramida {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) { // perulangan untuk tinggi dari piramida
            for (int j = i; j <= 5; j++) { // perulangan untuk pembuatan spasi
                System.out.print(" ");
            }
            for (int k = 0; k <= (i * 2) - 2; k++) { // perulangan mencetak bintang untuk membentuk piramida
                System.out.print("*");
            }
            System.out.println(); // untuk pindah baris
        }
    }
}