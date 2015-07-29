import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));   
        int func,h,c;
        float sa;
        func = Integer.parseInt(ler.readLine());
        h = Integer.parseInt(ler.readLine());
        sa = Float.parseFloat(ler.readLine());
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",func, h*sa);
    }
}