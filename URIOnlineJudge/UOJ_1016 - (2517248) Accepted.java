import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int velo;
        velo = Integer.parseInt(ler.readLine());
        System.out.printf("%d minutos\n", velo*2);
    }
}
