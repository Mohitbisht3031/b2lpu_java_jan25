package Day31;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class diary {
    private static void create(String name){
        String file = name+".txt";
        File f = new File(file);
        try{
            if(f.createNewFile()){
                System.out.println("file with name "+name+" created!");
            }else{
                System.out.println("failed to create the file or it is already existing");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    private static void update(String name){
        String f = name+".txt";
        try(FileWriter fw = new FileWriter(name,true)){
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                fw.append(s);
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello what you are looking for");
        System.out.println("1. Create");
        System.out.println("2. update");
        System.out.println("3. Read");
        System.out.println("4. Delete");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        sc.nextLine();
        if(v == 1){
            System.out.println("Please enter a Name :");
            String name = sc.nextLine();
            create(name);
        }else if(v == 2){
            System.out.println("Give the name of the file you want to update");
            String name = sc.nextLine();
            update(name);
        }else if(v == 3){
            System.out.println("Give the name of the file you want to read");
            String name = sc.nextLine();
            read(name);
        }else if(v == 4){
            System.out.println("Give the name of the file you want to delete");
            String name = sc.nextLine();
            delete(name);
        }else{
            System.out.println("Invalid use case");
        }

        sc.close();
    }   
}
