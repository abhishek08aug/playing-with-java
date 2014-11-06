//Looks like it is a jvm bug: http://stackoverflow.com/questions/3170412/why-is-132-1

package in.blogspot.randomcompiler.playing.with.java;

public class RightShift {
    public static void main(String args[])  {
        int x = -4;
        System.out.println(x>>1);   
        int y = 4;
        System.out.println(y>>1);   
        int z = -17;
        System.out.println(z>>1); 
        int l = -19;
        System.out.println(l>>1);        
        
        int a = -1;
        System.out.println(a>>1);  
        int b = -1;
        System.out.println(b>>>1);  
        
        int m = 2;
        System.out.println(m>>1);
        System.out.println(Integer.toBinaryString(m>>1));
        System.out.println(m>>2);
        System.out.println(Integer.toBinaryString(m>>2));
        
        int n = 16;
        System.out.println(n>>1);
        System.out.println(Integer.toBinaryString(n>>1));
        System.out.println(n>>2);
        System.out.println(Integer.toBinaryString(n>>2));
        System.out.println(n>>3);
        System.out.println(Integer.toBinaryString(n>>3));
        System.out.println(n>>4);
        System.out.println(Integer.toBinaryString(n>>4));
        System.out.println(n>>5);
        System.out.println(Integer.toBinaryString(n>>5));
        System.out.println(n>>6);
        System.out.println(Integer.toBinaryString(n>>6));
        System.out.println(n>>31);
        System.out.println(Integer.toBinaryString(n>>31));
        System.out.println(n>>32);
        System.out.println(Integer.toBinaryString(n>>32));
     }    
}
