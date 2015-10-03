import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int ini, fin;
        String a[];
        a = ler.readLine().split(" ");
        ini = Integer.parseInt(a[0]);
        fin = Integer.parseInt(a[1]);
        if (ini == fin) {
            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        } else if (ini > fin) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", (24 - ini) + fin);
        } else if (ini < fin) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", fin-ini);
        }
    }
}
