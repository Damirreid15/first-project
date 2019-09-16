
public class Driver {

	public static void main(String[] args) {
		RecursiveMathLib recursionLibrary= new RecursiveMathLib();
		IterationMathLib iterationLibrary= new IterationMathLib();
		System.out.println("-----Recursion-----");
		runTestCode(recursionLibrary);
		System.out.println("-----Iteration-----");
		runTestCode(iterationLibrary);
	}
public static void runTestCode(MathLib library) {
System.out.println("GCD of 4,2="
		+library.gcd(4, 2));

System.out.println("ackerman of 2,2="+ library.ackerman(2,2));
System.out.println("fibonaci series of 7="+ library.fibonaci(7));
System.out.println("hanoi"+ library.hanoi(4));
}
}
