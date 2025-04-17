package Day33;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Contact implements Serializable{
    String name;
    Stirng No;
    Contact(String name,String No){
        this.name = name;
        this.No = No;
    }
    public String toString() {
        return "the Name is "+this.name+" the contact detail is "+this.No;
    };
}

public diary{

    private static void create(String name){
        String fn = name+".txt";
        File f =new File(fn);
        try{
            if(f.createNewFile()){
                System.out.println("File created");
            }else System.out.println("file not created");
        }catch(Exception ex){
            System.err.println(ex);
        }
    }

    private static update(String name){
        String fn = name+".txt";
        Contact c = new Contact("Mohit", "99999999999")
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fn))){
            oos.writeObject(c);
            System.out.println("updated the contact in teh diary");
        }catch(Exception ex){
            System.err.println(ex);
        }
    }

    private static void read(String name,String personName){
        String fn = name+".txt";
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fn))){
            
           try{
            while (true) {
                Contact c = (Contact) oid.readObject();
                if(c.name.equalsIgnoreCase(PersonName)){
                    System.out.println(c.toString());
                    break;
                }
            }
            }catch(EOFException ex){
                System.err.println(ex);
            }
        }Catch(Exception ex){
            System.err.println(ex);
        }
    }

    public static void delete(String name){
        String fn = name+".txt";
        File f = new File(fn);
        if(f.delete()){
            System.out.println("file deleted");
        }else{
            System.out.println("File not deleted");
        }
    }

    public static void main(String[] args){
        System.out.println("Welcome to the contact diary");
        System.out.println("1. Create a Contact Diary");
        System.out.println("2. Update a contact diary");
        System.out.println("3. Read contact from diary");
        System.out.println("4. Deleta a diary");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        sc.nextLine();
        String name  = sc.nextLine();
        if(ch == 1){
            create(name);
        }else if(ch == 2){
            Update(name);
        }else if(ch == 3){
            String pn = sc.nextLine();
            read(name,pn);
        }else if(ch == 4){
            delete(name);
        }else{
            System.out.println("You have given a wrong input");
        }

    }
}