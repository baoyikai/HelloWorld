import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;


public class fibMemo {

	public double fibCount(int key) {
			
		if (key <= 1) {
			return key;
		}
		else {
			double[] FibonacciCount = new double[key + 1];
			FibonacciCount[0] = 0;
			FibonacciCount[1] = 1;
			for (int i = 2;i <= key;i++) {
				FibonacciCount[i] = FibonacciCount[i - 1] + FibonacciCount[i - 2];	
			}
			System.out.println(Arrays.toString(FibonacciCount));
			return FibonacciCount[key];
			
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

	  
  }

}