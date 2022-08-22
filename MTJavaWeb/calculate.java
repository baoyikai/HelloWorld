public class calculate{
	public static void main(String []args) {
		int x = 1;
		while(x <= 100) {
			if(x % 2 == 0) {
				System.out.println(x + "是整数");
				x++;
			} else {
				System.out.println(x + "是奇数");
				x++;
			}
		}
	}
}