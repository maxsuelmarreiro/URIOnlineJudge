import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int s,m,h=0;
        s = Integer.parseInt(ler.readLine());
        m = s/60;
        s = s%60;
        if (m>=60) {
            h=m/60;
            m=m%60;
        }
        System.out.printf("%d:%d:%d\n",h,m,s);
    }
}