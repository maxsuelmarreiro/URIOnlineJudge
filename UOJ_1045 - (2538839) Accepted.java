import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        String in[];
        double v[] = {0,0,0,0};
        in = ler.readLine().split(" ");
        v[0] = Double.parseDouble(in[0]);
        v[1] = Double.parseDouble(in[1]);
        v[2] = Double.parseDouble(in[2]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(v[i] > v[j]){
                    v[3] = v[i];
                    v[i] = v[j];
                    v[j] = v[3];
                }
            }
        }
        if (v[0] >= v[1]+v[2]) {
            System.out.printf("NAO FORMA TRIANGULO\n");
        }else{
            if (v[0]*v[0] == v[1]*v[1] + v[2]*v[2]) {
                System.out.printf("TRIANGULO RETANGULO\n");
            }
            if (v[0]*v[0] > v[1]*v[1] + v[2]*v[2]) {
                System.out.printf("TRIANGULO OBTUSANGULO\n");
            }
            if (v[0]*v[0] < v[1]*v[1] + v[2]*v[2]) {
                System.out.printf("TRIANGULO ACUTANGULO\n");
            }
            if (v[0] == v[1] && v[0] == v[2]) {
                System.out.printf("TRIANGULO EQUILATERO\n");
            }else if(v[0] == v[1] || v[0] == v[2] || v[1] == v[2]){
                System.out.printf("TRIANGULO ISOSCELES\n");
            }
        }
    }
}