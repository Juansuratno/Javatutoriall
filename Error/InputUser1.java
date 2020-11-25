import java.util.scanner;
/**
 *
 * @author Microsoft
 */
public class InputDataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        String nama;
        String alamat;
        String prodi;
        String fakultas;
        
        int usia, berat, tinggi;
        
    scanner keyboard = new scanner (System.in);
    
    System.out.println("=Data Mahasiswa Unsrat=");
    
    System.out.print("Nama Mahasiswa : ");
    nama = keyboard.nextline();
    
    System.out.print("Alamat :");
    alamat = keyboard.nextline();
    
    System.out.print("Fakultas :");
    fakultas = keyboard.nextline();
    
    System.out.print("Program Studi :");
    prodi = keyboard.nextline();
    
    System.out.print("Usia :");
    usia = keyboard.nextInt();
    
  
    
    System.out.println("=========");
    System.out.println("Nama Mahasiswa : ");
    System.out.println("Alamat :");
    System.out.println("Fakultas :" );
    System.out.println("Program Studi :");
    System.out.println("Usia :" +usia+ "tahun" );
    
    
    
    
    
    
        
    }
    
}
