public class selftestswitchcase11{
	public static void main(String []args) {
		char level = 'F';
		switch(level){
			case 'A':
				System.out.println(level + "优秀");
				break;
			case 'B':
				System.out.println(level + "良好");
				break;
			case 'C':
				System.out.println(level + "及格");
				break;
			default:
				System.out.println(level + "不及格");
		}
	}
}