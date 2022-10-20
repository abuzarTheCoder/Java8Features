package functionalDemo;

@FunctionalInterface
public interface OurFunctionalInterface {

	void m1();    //abstract method
	
	
	default void m2() {
		System.out.println("Default Method-1");
	}

	default void m3() {
		System.out.println("Default Method-2");
	}

	static void m4() {
		System.out.println("Default Method-2");
	}
	
}
