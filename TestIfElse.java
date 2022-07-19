public class TestIfElse {
	public static void main(String[] args) {
		for(int x = 1;x <= 30;x++) {
			if(x <=10) {
				System.out.println(x + "if");
				
			} else if(x > 10 & x <=20) {
				System.out.println(x + "ifelse");
				
			} else{
				System.out.println(x + "else");
				break;
				
			}
		}

	}
}