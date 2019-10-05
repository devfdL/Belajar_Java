public class Kendaraan {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        
        System.out.println("Transmisi mobil: "+mobil1.getTransmisi());
        System.out.println("Merk mobil: "+mobil1.getMerk());
        System.out.println("Roda mobil: "+mobil1.getRoda());
    }
}