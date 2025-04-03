package hw6;

public class CalException extends Exception{
	
	public CalException(String msg) {
		super(msg);
	}
	
	
	public CalException() {
		super("0的0次方沒有意義！");
	}
	
}


