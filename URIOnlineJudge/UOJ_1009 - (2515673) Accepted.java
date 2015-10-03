import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));   
        int func,h,c;
        float fixo,ven;
        ler.readLine();
        
        fixo = Float.parseFloat(ler.readLine());
        ven = Float.parseFloat(ler.readLine());
        
        System.out.printf("TOTAL = R$ %.2f\n", fixo+(ven*0.15));
    }
}
