public class SelfAddMinus{
	public static void main(String[] args) {
		int a = 3;
		int b = ++a;
		int e = a++;
		int c = 3;
		int d = --c;
		int f = c--;
		System.out.println("自增运算后的值是" + b + "\n a++ = " + e);
		System.out.println("自增运算后的值是" + c + "\n c-- = " + f);
	}
}