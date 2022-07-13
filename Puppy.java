
public class Puppy{ 
	//创建名为Puppy的类
	int PuppyAge;   
	//定义一个age变量
	public Puppy(String name) { 
	// 方法使用规范？
		System.out.println("the dogs name is " + name);
	}
	
	public void setAge(int age) {

		PuppyAge = age;
		//给 PuppyAge赋值
//		System.out.println("the dogs age is " + PuppyAge);
	}
	
	public int getAge() {
	   
		System.out.println("the dogs age is " + PuppyAge);
	    
		return PuppyAge;

	}
	
	
	public static void main (String[] args) {
		Puppy myDog = new Puppy("tommy");
		//创建对象
		myDog.setAge(3);
		//调用方法
    	myDog.getAge();
	}
}













