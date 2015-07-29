import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        String ax[];
        ax = ler.readLine().split(" ");
        int a, b, c, ab;
        a = Integer.parseInt(ax[0]);
        b = Integer.parseInt(ax[1]);
        c = Integer.parseInt(ax[2]);
        ab = (a + b + Math.abs(a - b)) / 2;
        System.out.printf("%d eh o maior\n", (ab + c + Math.abs(ab - c)) / 2);
    }
}
