public class LatihanControlFlow {
    public static void main (String [] args){
        
        int a= 0;
        
        while (true){
            a++;
                    
          if (a==50){
              break; // force out from loop
          }else if (a==25){
              continue; // force to start from beginning 
          } else if (a==15){
              return; // kick from program
          }
          System.out.println("Looping ke -" + a);
        }
       
        System.out.println("End");
    }
}
