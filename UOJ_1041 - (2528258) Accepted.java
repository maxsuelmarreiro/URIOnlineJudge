import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        float x,y;
        String in[];
        in = ler.readLine().split(" ");
        x = Float.parseFloat(in[0]);
        y = Float.parseFloat(in[1]);
        if (x == 0 && y == 0) {
            System.out.printf("Origem\n");
        }else if(x == 0 && y != 0){
            System.out.printf("Eixo Y\n");
        }else if(x != 0 && y == 0){
            System.out.printf("Eixo X\n");
        }else if(x > 0 && y > 0){
            System.out.printf("Q1\n");
        }else if(x > 0 && y < 0){
            System.out.printf("Q4\n");
        }else if(x < 0 && y > 0){
            System.out.printf("Q2\n");
        }else if(x < 0 && y < 0){
            System.out.printf("Q3\n");
        }
    }
}