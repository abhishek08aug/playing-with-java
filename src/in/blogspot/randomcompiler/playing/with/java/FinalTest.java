package in.blogspot.randomcompiler.playing.with.java;

public class FinalTest {

    public final int i = 10;
    public final int j; 
    public final Integer k;
    public static final int l; 
    public static final Integer m;

    static {
           l = 40; //commenting this line results in compile time Error
           m = new Integer(50); //commenting this line results in compile time Error
    }
}
