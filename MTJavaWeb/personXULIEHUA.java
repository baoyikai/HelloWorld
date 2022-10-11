import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class personXULIEHUA implements Serializable {

    String name;
    int age;
    String address;

    public personXULIEHUA(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public String toString(){
        return " Person name is" + name + ", Person age is " + age + ", person address is" + address;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        personXULIEHUA people = new personXULIEHUA("baoyikai",21,"Japan");

        String path = "/Users/baoyikai/Documents/file for java/xuliehua.txt";

        //序列化
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream obs = new ObjectOutputStream(fos);
        obs.writeObject(people);
        obs.close();

         //反序列化
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        personXULIEHUA value = (personXULIEHUA)ois.readObject();
        System.out.println(value);




    }
}