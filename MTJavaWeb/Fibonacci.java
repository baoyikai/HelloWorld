import java.util.ArrayList;
public class Fibonacci{
	
	ArrayList<Integer> x  = new ArrayList<Integer>();
	
	public Fibonacci(int stopIndex) {
		if (stopIndex <= 1) {
			this.fibonaccistep1(stopIndex);
		}else {
			this.fibonaccistep2(stopIndex);
		}
	}
	
	public ArrayList<Integer> printMT(){
		return x;
		
	}
	
	
	public void fibonaccistep1(int num) {
		if (num == 0) {
			x.add(0);
		}else if(num == 1) {
			x.add(1);
		}else {
			x.add(0);
			x.add(1);
		}
	}
	
	public void fibonaccistep2(int num) {
		if (num > 1) {
			this.fibonaccistep1(num);
			for (int i = 2;i <= num;i++) {
				x.set(i, x.get(i - 1) + x.get(i - 2));
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci(10);
		System.out.println(fibonacci.printMT());
		
		
	}
}