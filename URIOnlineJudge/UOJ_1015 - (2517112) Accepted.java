import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        float x1, y1, x2, y2;
        String ax1[],ax2[];
        ax1 = ler.readLine().split(" ");
        ax2 = ler.readLine().split(" ");
        x1 = Float.parseFloat(ax1[0]);
        y1 = Float.parseFloat(ax1[1]);
        x2 = Float.parseFloat(ax2[0]);
        y2 = Float.parseFloat(ax2[1]);
        System.out.printf("%.4f\n", Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
    }
}
