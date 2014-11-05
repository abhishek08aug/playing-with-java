package in.blogspot.randomcompiler.playing.with.java;

interface A {
	void display();
}

public class ReducedVisibility implements A {

	@Override
	void display() {
		System.out.println("Display Method is called");
	}
	
	public static void main(String[] args){
		A a = new ReducedVisibility(); 
		a.display();
	}
}
