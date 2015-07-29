import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int dias;
        dias = Integer.parseInt(ler.readLine());
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",dias/365,(dias-((dias/365)*365))/30,dias-(365*(dias/365)+30*((dias-((dias/365)*365))/30)));
    }
}