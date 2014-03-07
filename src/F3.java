import java.util.Scanner;

public class F3 extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = Math.cos(x);
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		F3 f = new F3();
		
		System.out.println("Enter X for f(x) = cos(x)");
		double x = input.nextDouble();
		System.out.println("f(x) = " + f.f(x));
	}

}
