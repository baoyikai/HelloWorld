# String类常用方法

```java
public class str{
  public static void main(String[] args){
    String myStr = "abcdefghijklmnopqrstuvwxyz";
  }
}
```

## 1指定索引位置的字符

```java
myStr.charAt(5);
// "f"
```



## 2更具指定内容查找位置

```java
myStr.indexOf("c");
// 2
```



## 3提取索引位置的字符

```java
myStr.subString(2,5);
//[c,d,e]  索引5不取
```



## 4比较Str和another Str的大小   return一个int

```java
String Str2 = "sdlfkjsdjflksdjf"
Str.compareTo(str2);
```



## 5连接两个字符串

```java
str.concat（Str2）;
// Str + Str2
```



## 6大小写转换

```java
Str.toLowerCase();
Str.toUpperCase();
```



