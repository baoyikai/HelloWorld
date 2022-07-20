public class SelfTestSwitchCase{
	public static void main(String []args) {
		int level = 100;
		switch(level) {
		case 1:
			System.out.println(level + "级，菜鸟");
			break;
		case 2:
			System.out.println(level + "级，牛逼");
			break;
		case 3:
//			System.out.println(level + "级，大神");
//			break;
		case 4:
		case 5:
			System.out.println(level + "级，大神");
			break;
		default:
			System.out.println(level + "级，牛死了");
		}
	}
}