package practise;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
    //create an instance for the InputStreamReader
    static InputStreamReader a = new InputStreamReader(System.in);
     static BufferedReader object = new BufferedReader(a);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        String name = object.readLine();
        System.out.println("Hello, " + name + "!");


    }
}

