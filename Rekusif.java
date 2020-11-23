import java.util.*;


public class Rekusif {
    public static void main (String []args){
      
     scanner scan = new scanner (System.in);
     
     System.out.print("Masukkan Angka = " );
     int angka = scan.nextInt();
     System.out.print("Angka = "+ angka);
          
     printAngka(angka);
    }
    private static void  printAngka (int parameter){
        System.out.print("Nilai = " + parameter);
        
        if (parameter == 0){
            return;
        }
        parameter++;
        
        printAngka(parameter);
    }
}
