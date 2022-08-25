import java.util.HashMap;
public class HashMaps{
	public static void main(String[] args) {
		HashMap<Integer,Integer> scores = new HashMap<>();
		//添加
		scores.put(111,100);
		scores.put(222, 99);
		scores.put(333, 98);
		scores.put(444, 97);
		scores.put(555, 96);
		System.out.println(scores + "\n–––––––––––––––––––––––––––––––––––––––––");
		
		//删除
		scores.remove(444);
		System.out.println(scores + "\n–––––––––––––––––––––––––––––––––––––––––");
		//清空
//		scores.clear();
//		System.out.println(scores);
		
		//键值对数量
		int size = scores.size();
		System.out.println(size);
		
		//查找
		int a = scores.get(222);
		System.out.println(a);
		
		//遍历
		for(int i : scores.keySet()) {
			System.out.println(i + "gets" + scores.get(i) + "scores");
			
		}
		
		//keySet() 所有key的视图
		System.out.println(scores.keySet());
		
		//values（）返回所有值的视图
		System.out.println(scores.values());
		
		//检查key是否存在
		boolean contains = scores.containsKey(777);
		System.out.println(contains);
		
		//替换
		scores.replace(111,101);
		System.out.println(scores + "\n–––––––––––––––––––––––––––––––––––––––––");
		
		
		
			
		
		
	}
}