# This关键字用法

## **1**区分 **成员变量** 和 **局部变量**

### 当**成员变量**和**局部变量**重名时，this标明的是**成员变量**

```java
this.
```

```java
class Student {
  //声明三个初始变量
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno; 
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class TestThis2 {
    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
```



## **2**方法内调用当前类其他方法

```java
this.(方法名)
```

```java
public class Dog {
    // 定义一个jump()方法
    public void jump() {
        System.out.println("正在执行jump方法");
    }

  public void run() {
      // 使用this引用调用run()方法的对象
      this.jump();
      System.out.println("正在执行run方法");
  }
}
```

## 3构造方法之间相互调用

```java
this(参数)
```

```java
public class Student {
    String name;
    // 无参构造方法
    public Student() {
        this("张三");
    }
    // 有参构造方法
    public Student(String name) {
        this.name = name;
    }
    // 输出name和age
    public void print() {
        System.out.println("姓名：" + name);
    }
    public static void main(String[] args) {
        Student stu = new Student();
        stu.print();
    }
}
```

