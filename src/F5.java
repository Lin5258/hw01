import java.util.Scanner;

public class F5 extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = Math.cos(x) + 5 * Math.sin(x);
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		F5 f = new F5();
		
		System.out.println("Enter X for f(x) = cos(x) + 5sin(x)");
		double x = input.nextDouble();
		System.out.println("f(x) = " + f.f(x));
	}

}
