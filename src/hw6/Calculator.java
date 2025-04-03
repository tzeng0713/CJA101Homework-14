package hw6;

public class Calculator {
	private int x, y;
	
	public Calculator() {
		
	}
	
	public Calculator(int x, int y) throws CalException{
		if(x == 0 && y == 0) {
			throw new CalException();
		} else if(y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		} else {
			this.y = y;
			this.x = x;
		}
	}
	
	public double getX() {
		return x;
		
	}
	
	public double getY() {
		return y;
		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double powerXY() {
		return Math.pow(x, y);
	}
	
}
