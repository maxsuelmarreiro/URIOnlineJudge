import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        String aux[], aux2[];
        int b1,b2;
        float valor1,valor2;
        aux = ler.readLine().split(" ");
        aux2 = ler.readLine().split(" ");
        b1 = Integer.parseInt(aux[1]);
        valor1 = Float.parseFloat(aux[2]);
        b2 = Integer.parseInt(aux2[1]);
        valor2 = Float.parseFloat(aux2[2]);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", b1*valor1 + b2*valor2);
    }
}