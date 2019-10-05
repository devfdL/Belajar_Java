public class Mobil {
    String transmisi, merk;
    int roda;
    public Mobil(){
        this.transmisi="Manual";
        this.merk="Toyota";
        this.roda=4;
    }
    public Mobil(String t, String m, int r){
        this.transmisi= t;
        this.merk= m;
        this.roda= r;
    }
    public void setTransmisi(String t){
        this.transmisi= t;
    }
    public void setMerk(String m){
        this.merk = m;        
    }
    public void setRoda(int r){
        this.roda = r;        
    }
    public String getTransmisi(){
        return this.transmisi;
    }
    public String getMerk(){
        return this.merk;
    }
    public int getRoda(){
        return this.roda;
    }
}

