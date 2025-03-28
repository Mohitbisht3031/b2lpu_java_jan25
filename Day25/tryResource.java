package Day25;

import java.io.BufferedReader;

public class tryResource {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader("./txt.txt")){
            /*perform the opretation onnthe file without thinking or handeling the file to close */
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
