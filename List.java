import java.util.ArrayList;

class List {

  public static void main(String[] args) {
    ArrayList<String> todayToDos = new ArrayList<String>();
    //列表
    todayToDos.add("drink");
    todayToDos.add("walking");
    todayToDos.add("sleep");
    System.out.println(todayToDos.toString());
   
    //size（）方法
    System.out.println("today I have " + todayToDos.size() + "things to do.");
    
    //remove()方法
    todayToDos.remove("drink");
//    System.out.println(todayToDos.toString());
    System.out.println("删除drink后的列表：" + todayToDos.toString());
    
    //get（）方法
    System.out.println(todayToDos.get(1) + "根据索引1找到元素");
    
    //set（）方法
    todayToDos.set(1, "joggingt");
    System.out.println(todayToDos.toString());
    
    //indexOf()方法
    todayToDos.indexOf("walking");
    System.out.println("walking对应的索引是" +  todayToDos.indexOf("walking"));
    
    
    
    
    
    
    
    



  }
  
}