import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));   
        int a = Integer.parseInt(ler.readLine());
        int b = Integer.parseInt(ler.readLine());
        System.out.printf("SOMA = %d\n", a+b);
    }
}