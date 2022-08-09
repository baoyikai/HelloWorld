public class Droid{
	
	int batteryLevel;
	String name;
	
	public Droid(String droidName) {
		name = droidName;
		batteryLevel = 100;
		
	}
	
	public void performTask(String task) {
		System.out.println(name + "is performing task: " + task);
		batteryLevel = batteryLevel - 10;
		
	}
	
	//输出电量
	public void energyReport() {
		System.out.println(batteryLevel);
	}
	
	public String toString() {
		return "Hello, I’m the droid:" + name;
	}
	
	public static void main(String[] args) {
//		
//		Droid codey = new Droid("codey");
//		System.out.println(codey.name + '\n' +codey.batteryLevel);
//		System.out.println(codey);
//		codey.performTask("dancing");
//		System.out.println(codey.batteryLevel);
//		
		
		Droid dapao = new Droid("dapao");
		System.out.println(dapao);
		dapao.performTask("eating");
		dapao.energyReport();
		
		
		
	}
}