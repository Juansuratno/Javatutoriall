public class JenisVariabel {
    public static void main (String[] args){
        int a = 10;
        
        System.out.println("==integer==");
        System.out.println("Integer = " + a);
        System.out.println("Integer = " + Integer.MAX_VALUE);
        System.out.println("Integer = " + Integer.MIN_VALUE);
        System.out.println("Integer = " + Integer.BYTES + " byte");
        System.out.println("Integer = " + Integer.SIZE + " Bit");
       
        
        
        byte b = 10;
        
        System.out.println("==BYTE==");
        System.out.println("Byte = " + b);
        System.out.println("Byte = " + Byte.MAX_VALUE );
        System.out.println("Byte = " + Byte.MIN_VALUE);
        System.out.println("Byte = " + Byte.BYTES + " byte");
        System.out.println("Byte = " + Byte.SIZE + " bit");
        
        short c = 10;
        
        System.out.println("==Short==");
        System.out.println("Short = " + c);
        System.out.println("Short = " + Short.MAX_VALUE);
        System.out.println("Short = " + Short.MIN_VALUE);
        System.out.println("Short = " + Short.BYTES +" Byte ");
        System.out.println("Short = " + Short.SIZE + " Bit ");
        
        long d = 10l; 
        
        System.out.println("==Long==");
        System.out.println("Long = " + d);
        System.out.println("Long = " + Long.MAX_VALUE);
        System.out.println("Long = " + Long.MIN_VALUE);
        System.out.println("Long = " + Long.BYTES + " Byte");
        System.out.println("Long = " + Long.SIZE + " Bit");
        
        double e = 10.5; //desimal
        
        System.out.println("==Double==");
        System.out.println("double = " + e);
        System.out.println("double = " + Double.MAX_VALUE);
        System.out.println("double = " + Double.MIN_VALUE);
        System.out.println("double = " + Double.BYTES + " Byte");
        System.out.println("double= " + Double.SIZE + " Bit");
        
        float f = 10.5f ; //desimal
        
        System.out.println("==float==");
        System.out.println("float = " + f);
        System.out.println("float = " + Float.MAX_VALUE);
        System.out.println("float = " + Float.MIN_VALUE);
        System.out.println("float = " + Float.BYTES + "Byte");
        System.out.println("float = " + Float.SIZE + "Bit");
        
        char g = 'C';  //koma berdasar ASCII 
        
        System.out.println("==char==");
        System.out.println("char = " + g);
        System.out.println("char = " + Character.MAX_VALUE);
        System.out.println("char = " + Character.MIN_VALUE);
        System.out.println("char = " + Character.BYTES + "Byte");
        System.out.println("char = " + Character.SIZE + "Bit");
        
        boolean benar = true; 
        
        System.out.println("==Boolean==");
        System.out.println("Boolean = " + benar);
        System.out.println("Boolean = " + Boolean.TRUE);
        System.out.println("Boolean = " + Boolean.FALSE);
        
        
        
        System.out.println("INCREMENT DECREMENT");
        // iNCREMENT DECREMENT
        int bil = 10;
        bil++;
        System.out.println("Nilai DECREMENT = " + bil);
        int bil2 = 10;
        bil2--;
        System.out.println("Nilai INCREMENT = " + bil2);
        
        System.out.println("Nilai prefix = " + ++a);
        
        int h = 10;
        System.out.println("Nilai postfix = " + h++);
        System.out.println("hasil postfix = " + h);
        
        boolean i = true;
        System.out.println("Bolean = " + i);
        System.out.println("Negasi Boleean = " + !i);
        
        
        
        System.out.println("=ASSIGNMENT=");
        
        int j = 10;
        j += 40;
        
       System.out.println("Nilai = " + j);
       
       j -= 40;
       System.out.println("Nilai = " + j);
        
    }
}
