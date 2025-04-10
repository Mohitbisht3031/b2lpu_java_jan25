package Day30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandeling {
    public static void main(String[] args) {
        File f = new File("./text.txt");
        // created a new file
        try{if(f.createNewFile()){
            System.out.println("file created");
        }else{
            System.out.println("file not created!");
        }}catch(IOException ex){
            System.err.println(ex);
        }

        // write in a file
        // try(FileWriter fw = new FileWriter("./text.txt");){
        //     // 2 ways in which fileWriter works 1 is to append and one is to overwrite to append we need to give true as a second argument in it
        //     fw.write("hey welcome to the class");
        //     System.out.println("wrote in the file");
        // }catch(IOException ex){
        //     System.err.println(ex);
        // }

        // using buffered writer
        try(BufferedWriter br = new BufferedWriter("./text.txt")){
            br.append("Hey welcome to the new session")
            br.newLine();
            br.append("trying to append in new line")
        }catch(IOException ex){
            System.out.println(ex);
        }

        // read from the file as well
        // using scanner
        try(Scanner sc = new Scanner(f)){
            while(sc.hasNextLine()){String l = sc.nextLine();
            System.out.println(l);}
        }catch(IOException ex){
            System.err.println(ex);
        } 
        // using filereader
        try(FileReader fr = new FileReader("./text.txt")){
            char arr[] = new char[1000];
            fr.read(arr);
            System.out.println(arr);
        }catch(IOException ex){
            System.err.println(ex);
        }

        if(f.delete()){
            System.out.println("file deleted");
        }else{System.out.println("file doesn't exists");}
    }
}
