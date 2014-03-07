import java.util.Scanner;

public class F4 extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = Math.tan(x);
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		F4 f = new F4();
		
		System.out.println("Enter X for f(x) = tan(x)");
		double x = input.nextDouble();
		System.out.println("f(x) = " + f.f(x));
	}

}
