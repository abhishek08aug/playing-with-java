package in.blogspot.randomcompiler.playing.with.java;

public class DefaultValues {
    // Memeber variables are not checked for initialization at compile time
	Object o;
	void show() {
		System.out.println("show() called");
		o.toString();
    }
	
	public static void main(String[] args) {
	    // Local variables are checked for initialization at compile time
		DefaultValues d = new DefaultValues(); 
        d.show();
    }
}
