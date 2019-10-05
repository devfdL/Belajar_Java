import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
    
    public static void main(String[] args){
        
        File file = new File("../ContohFile.txt");
        

        try(BufferedWriter f = new BufferedWriter(new FileWriter(file))){
            

            f.write("Nama: Muhammad Fadhil");
            f.newLine();
            f.write("Umur: 19 tahun");
            f.newLine();
            f.write("Alamat: Depok, Sawangan");
            
        }catch(FileNotFoundException ex){
            System.out.println("File "+file.getName()+" Tidak Ditemukan"); 
        }catch(IOException ex){
            System.out.println("File "+file.getName()+" Tidak Dapat DIbaca");
        }
    }
}