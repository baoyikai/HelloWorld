import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIsIlandPlayList = new ArrayList<String>();
    desertIsIlandPlayList.add("稻香");
    desertIsIlandPlayList.add("同桌的你");
    desertIsIlandPlayList.add("小幸运");
    desertIsIlandPlayList.add("十分十二寸");
    desertIsIlandPlayList.add("仙儿");
    desertIsIlandPlayList.add("敢爱敢恨");
    
    //打印曲库
    System.out.println(desertIsIlandPlayList.toString());

    //check the size of playlist
    System.out.println(desertIsIlandPlayList.size());

    //remove the list
    desertIsIlandPlayList.remove("仙儿");
    System.out.println(desertIsIlandPlayList.size());
    System.out.println(desertIsIlandPlayList.toString());
    
    //change
    //get number
    int indexOfa = desertIsIlandPlayList.indexOf("同桌的你");
    int indexOfb = desertIsIlandPlayList.indexOf("敢爱敢恨");
    System.out.println("同桌的你是" + indexOfa + "," + "敢爱敢恨是" + indexOfb);
    //get name
    String nameOfa = desertIsIlandPlayList.get(indexOfa);
    String nameOfb = desertIsIlandPlayList.get(indexOfb);	
    
    desertIsIlandPlayList.set(indexOfa,nameOfb);
    desertIsIlandPlayList.set(indexOfb,nameOfa);
    System.out.println(desertIsIlandPlayList.toString());

    
  }
  
}