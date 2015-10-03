import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        String in[];
        int v[] = {0,0,0,0,0,0,0};
        in = ler.readLine().split(" ");
        v[0] = Integer.parseInt(in[0]);
        v[1] = Integer.parseInt(in[1]);
        v[2] = Integer.parseInt(in[2]);
        v[3] = v[0];
        v[4] = v[1];
        v[5] = v[2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(v[i] < v[j]){
                    v[6] = v[i];
                    v[i] = v[j];
                    v[j] = v[6];
                }
            }
        }
        System.out.printf("%d\n%d\n%d\n", v[0], v[1], v[2]);
        System.out.printf("\n%d\n%d\n%d\n", v[3], v[4], v[5]);
    }
}
