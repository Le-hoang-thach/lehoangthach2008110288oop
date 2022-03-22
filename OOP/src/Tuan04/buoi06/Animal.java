package Tuan04.buoi06;

public abstract class  Animal {
	private String picture;
	private String food;
	private int hunger;
	
	protected void makeNoise() {
		System.out.println("Keu.......");
	}
	protected void eat() {
		System.out.println("An ....");
	}
	protected void sleep() {
		System.out.println("Sleeping .........");
	}
	protected void roam() {
		System.out.println("di lang thang......");
	}
	
}
