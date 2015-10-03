import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));   
        int a,b,c,d;
        a = Integer.parseInt(ler.readLine());
        b = Integer.parseInt(ler.readLine());
        c = Integer.parseInt(ler.readLine());
        d = Integer.parseInt(ler.readLine());
        System.out.printf("DIFERENCA = %d\n",(a*b-c*d));
    }
}
