package in.blogspot.randomcompiler.playing.with.java;

interface A {
    // public visibility by default inside class
	void display();
}

public class ReducedVisibility implements A {

    // default visibility by default inside class
	@Override
	public void display() {
		System.out.println("Display Method is called");
	}
	
	public static void main(String[] args){
		A a = new ReducedVisibility(); 
		a.display();
	}
}
