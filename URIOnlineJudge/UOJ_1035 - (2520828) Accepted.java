import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,d;
        String v[] = ler.readLine().split(" ");
        a = Integer.parseInt(v[0]);
        b = Integer.parseInt(v[1]);
        c = Integer.parseInt(v[2]);
        d = Integer.parseInt(v[3]);
        if(b>c && d>a && c+d>a+b && c>=0 && d>=0 && (a%2==0)){
            System.out.print("Valores aceitos\n");
        }else{
            System.out.print("Valores nao aceitos\n");
        }
    }
}
