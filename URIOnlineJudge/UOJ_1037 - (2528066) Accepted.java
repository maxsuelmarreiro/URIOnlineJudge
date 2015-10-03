import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        float a;
        a = Float.parseFloat(ler.readLine());
        if(a >= 0 && a <= 25){
            System.out.printf("Intervalo [0,25]\n");
        }else if(a > 25.0 && a <= 50){
            System.out.printf("Intervalo (25,50]\n");
        }else if(a > 50.0 && a <= 75){
            System.out.printf("Intervalo (50,75]\n");
        }else if(a > 75.0 && a <= 100){
            System.out.printf("Intervalo (75,100]\n");
        }else{
            System.out.printf("Fora de intervalo\n");
        }
    }
}
