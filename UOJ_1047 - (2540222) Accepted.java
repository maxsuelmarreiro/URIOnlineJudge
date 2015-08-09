
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int Hini, Hfin, Mini, Mfin, totalInicial, totalFinal, M;
        String a[];
        a = ler.readLine().split(" ");
        Hini = Integer.parseInt(a[0]);
        Mini = Integer.parseInt(a[1]);
        Hfin = Integer.parseInt(a[2]);
        Mfin = Integer.parseInt(a[3]);

        if (Hini == Hfin) {
            M = 24 * 60 + Mfin - Mini;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", M / 60, M % 60);
        } else if (Hini > Hfin) {
            totalInicial = (Hini) * 60 + Mini;
            totalFinal = Hfin * 60 + Mfin;
            M = totalInicial - totalFinal;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 23 - (M / 60), 60 - (M % 60));
        } else {
            totalInicial = (Hini) * 60 + Mini;
            totalFinal = Hfin * 60 + Mfin;
            M = (totalInicial - totalFinal) * -1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", M / 60, M % 60);
        }
    }
}
