import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        double pi, raio, area;   
        pi = 3.14159;
        raio = Double.parseDouble(ler.readLine());
        area = pi * (raio*raio);
        System.out.printf("A=%.4f\n", area);
    }
}
