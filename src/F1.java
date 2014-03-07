import java.util.Scanner;

public class F1 extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = x * x;
		return y;
	}
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		F1 f = new F1();
		
		System.out.println("Enter X for f(x) = X^2");
		double x = input.nextDouble();
		System.out.println("f(x) = " + f.f(x));
		
	}

}
