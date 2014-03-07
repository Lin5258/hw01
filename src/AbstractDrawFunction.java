//import java.awt.Graphics;


public abstract class AbstractDrawFunction {
	
	
	protected AbstractDrawFunction() {
		drawFunction();
	}
	
	abstract double f(double x);
	
	public void drawFunction(){
		//for(int x = -100; x <= 100; x++) {
			//p.addPoint(x + 200, 200 - (int)f(x));
		//}
	}	
}
