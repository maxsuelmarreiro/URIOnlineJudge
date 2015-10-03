import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));   
        float a,b,c,media;
        a = Float.parseFloat(ler.readLine());
        b = Float.parseFloat(ler.readLine());
        c = Float.parseFloat(ler.readLine());
        System.out.printf("MEDIA = %.1f\n", (((a*2)+(b*3)+(c*5))/10));
    }
}
