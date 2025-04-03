package hw5;

public class Hw5_5 {

	public static void main(String[] args) {
		genAuthCode();
	}
	public static void genAuthCode() {
		int a;
		char b;
		for(int i = 0; i < 8; i++) {
			a = (int)(Math.random() * 3);
			
			if(a == 0) {
				b = (char)((int)(Math.random() * 26) + 'a');
				
			}else if(a == 1){
				b = (char)((int)(Math.random() * 26) + 'A');
				
			}else{
				b = (char)((int)(Math.random() * 10) + '0');
			}
			System.out.print(b);
		}
	}
}
