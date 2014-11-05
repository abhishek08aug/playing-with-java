package in.blogspot.randomcompiler.playing.with.java;

public class DefaultValues {
	Object o;
	void show() {
		System.out.println("show() called");
		o.toString();
    }
	
	public static void main(String[] args) {
		DefaultValues d = new DefaultValues(); 
        d.show();
    }
}
