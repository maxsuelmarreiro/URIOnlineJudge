import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        double pi;
        int raio;
        pi = 3.14159;
        raio = Integer.parseInt(ler.readLine());
        System.out.printf("VOLUME = %.3f\n", (double) 4/3*pi*(raio*raio)*raio);
    }
}
