import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));   
        float a,b,media;
        a = Float.parseFloat(ler.readLine());
        b = Float.parseFloat(ler.readLine());
        System.out.printf("MEDIA = %.5f\n", (((a*3.5)+(b*7.5))/11));
    }
}
