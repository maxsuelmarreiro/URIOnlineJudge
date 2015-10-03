import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        double a,b,c;
        String ax[];
        ax = ler.readLine().split(" ");
        a = Double.parseDouble(ax[0]);
        b = Double.parseDouble(ax[1]);
        c = Double.parseDouble(ax[2]);
        
        if((c < a+b) && (b < c+a) && (a < c+b)){
            System.out.printf("Perimetro = %.1f\n", a+b+c);
        }else{
            System.out.printf("Area = %.1f\n", ((a+b)*c)/2 );
        }
    }
}
