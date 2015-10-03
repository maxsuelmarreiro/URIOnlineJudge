import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        double a,b,c,R1,R2;
        String v[];
        v = ler.readLine().split(" ");
        a = Double.parseDouble(v[0]);
        b = Double.parseDouble(v[1]);
        c = Double.parseDouble(v[2]);

        double delta = (b*b)-(4*a*c);
        R1 = (-b + Math.sqrt(delta)) / (2 * a);  
        R2 = (-b - Math.sqrt(delta)) / (2 * a);  
        if(Double.isInfinite(R1) || Double.isInfinite(R2) || Double.isNaN(R1) || Double.isNaN(R2)){
            System.out.printf("Impossivel calcular\n", R1, R2);
        }else{
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", R1, R2);
        }

    }
}
