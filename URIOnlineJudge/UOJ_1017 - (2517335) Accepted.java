import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int tempo, vel;
        tempo = Integer.parseInt(ler.readLine());
        vel = Integer.parseInt(ler.readLine());
        System.out.printf("%.3f\n", (float)tempo*vel/12);
    }
}
