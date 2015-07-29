import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        String ax[] = ler.readLine().split(" ");
        double a, b, c, pi;
        pi = 3.14159;
        a = Double.parseDouble(ax[0]);
        b = Double.parseDouble(ax[1]);
        c = Double.parseDouble(ax[2]);
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", (a*c)/2,pi*c*c,((a+b)*c)/2,b*b, a*b);
    }
}