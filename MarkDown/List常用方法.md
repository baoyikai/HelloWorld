# List常用方法

```java
import java.util.ArrayList;
```

```java
public class List{
  public static void main(String[] args){
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("aa");
    myList.add("bb");
    myList.add("cc");
    myList.add("dd");
    myList.add("ee");
    myList.add("ff");
    myList.add("gg");
    myList.add("hh");
  }
}
```



##  1截取LIst内指定部分

```java
myList.subList(2,4);
//cc,dd
```

## 2打印List

```java
System.out.println(myList);
//[aa,bb,cc,dd,ee,ff,gg,hh]
```

## 3List的大小

### 含元素个数

```java
myList.size();
// 8
```

## 4.1删除指定元素

```java
myList.remove("aa");
//[bb,cc,dd,eeff,gg,hh]
```

## 4.2删除指定索引的元素

```java
myList.remove(1);
//[aa,cc,dd,ee,ff,gg,hh]
```

## 5找到元素的索引（位置）

```java
myList.get("aa");
// 0
```

## 6根据索引（位置）找元素

```java
myList.indexOf(1);
// bb
```

## 7更改指定索引（位置）的元素

```java
myList.set(2,"oo");
//[aa,bb,oo,dd,ee,ff,gg,hh]
```





