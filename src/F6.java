import java.util.Scanner;

public class F6 extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = 5 * Math.cos(x) + Math.sin(x);
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		F6 f = new F6();
		
		System.out.println("Enter X for f(x) = 5cos(x) + sin(x)");
		double x = input.nextDouble();
		System.out.println("f(x) = " + f.f(x));
	}

}
