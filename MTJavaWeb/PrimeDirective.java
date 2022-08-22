import java.util.ArrayList;
public class PrimeDirective{
	public boolean isPrime(int number) {
		if (number == 2 ) {
			return true;
		}else if(number < 1) {
			return false;
		}
		for(int i = 2;i < number;i++) {
			if (number % i == 0) {
//				System.out.println("不是素数");
				return false;	
			}else {
				continue;
			}
		}
		return true;	
	}
	public static void main(String[] args) {
		PrimeDirective Pd = new PrimeDirective();
		ArrayList<String> nums = new ArrayList<String>();
		
		
		int[] numbers = {1,2,5,77,107,89};
		for(int index = 0;index < numbers.length;index++) {
			int num = numbers[index];
			String str = Boolean.toString(Pd.isPrime(num));
			String strNumbers = Integer.toString(numbers[index]);
			if (str.equals("true")){
				nums.add(strNumbers);
			}	
		}
		System.out.println(nums);
	}
}