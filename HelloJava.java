import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HelloJava {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Java!");

        System.out.print("Введите приветствие: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine();

        System.out.println();
        System.out.println(text);
    }
}
