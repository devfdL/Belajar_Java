// di modul ilab ini buat latihan
public class array2{
    public static void main(String[] args){
        int[] x = {70, 80, 60};

        double rata = 0.0;
        for(int i=0;i<x.length;i++){ // dimodul kurang tanda '{'
            rata += x[i];
        } // taro tanda '}' disini

        rata/=x.length;
        System.out.println("nilai rata-rata: " + rata);
    }
}