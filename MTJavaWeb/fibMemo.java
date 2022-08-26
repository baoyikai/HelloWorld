import java.util.HashMap;
import java.util.ArrayList;


public class fibMemo {
	
	static HashMap<Integer,Double> FibonacciCount = new HashMap<>();
	
	
	public double fibCount(int key) {
		FibonacciCount.put(0, 0.0);
		FibonacciCount.put(1,1.0);
		
		if(key == 0) {
			return 0;
		}else if(key == 1) {
			return 1;
		}else {
			for (int i = 2;i <= key;i++) {
				FibonacciCount.put(i, FibonacciCount.get(i -1) + FibonacciCount.get(i - 2));
				
				
			}
			return FibonacciCount.get(key);
		}
		
	}

  public static void main(String[] args) {
	  
	  
	  fibMemo fib = new fibMemo();
	  System.out.println(fib.fibCount(0));
	  System.out.println(fib.fibCount(1));
	  System.out.println(fib.fibCount(2));
	  System.out.println(fib.fibCount(3));
	  System.out.println(fib.fibCount(4));
	  System.out.println(fib.fibCount(5));
	  System.out.println(fib.fibCount(50));
	  System.out.println(FibonacciCount);
	  
	  
  }

}