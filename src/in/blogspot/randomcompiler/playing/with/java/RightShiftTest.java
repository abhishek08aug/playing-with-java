package in.blogspot.randomcompiler.playing.with.java;

public class RightShiftTest {
    public static void main(String args[])  {        
        int b = 16;
        System.out.println("Bit pattern for int " + b + " is " +Integer.toBinaryString(b));
        
        // As expected it is 0 
        System.out.println("After right-shifting " + b + " for 31 times the value is " + (b>>31) + " and bit pattern is " +Integer.toBinaryString(b>>31));
        
        // But why is it not 0 but 16
        System.out.println("After right-shifting " + b + " for 32 times the value is " + (b>>32) + " and bit pattern is " +Integer.toBinaryString(b>>32));
     }    
}
