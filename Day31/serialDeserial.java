package Day31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
    String Name;
    int age;
    Person(String n,int a){
        name = n;
        age = a;
    }
    public String toString() {
        return "hey my name is "+name+", my age is "+a;
    };
}

public class serialDeserial {
    public static void main(String[] args) {
        Person obj = new Person("Mohit", 1);
        // this is how we write an object in a file
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))){
            oos.writeObject(obj);
            System.out.println("wrote the object");
        }catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){
            Person obj2 = (Person) ois.readObject();
            System.out.println(obj2.toString());
        }catch(Exception e){
            System.err.println(e);
        }

    }
}
