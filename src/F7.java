import java.util.Scanner;


public class F7 extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = Math.log10(x) + x * x;
		return y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		F7 f = new F7();
		
		System.out.println("Enter X for f(x) = log(x) + x^2");
		double x = input.nextDouble();
		System.out.println("f(x) = " + f.f(x));
	}

}
