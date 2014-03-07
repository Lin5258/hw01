import java.util.Scanner;

public class F2 extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = Math.sin(x);
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		F2 f = new F2();
		
		System.out.println("Enter X for f(x) = sin(X)");
		double x = input.nextDouble();
		System.out.println("f(x) = " + f.f(x));
	}

}
