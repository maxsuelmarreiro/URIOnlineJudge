
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        String a[] = {"","",""};
        
        a[0] = ler.readLine();
        a[1] = ler.readLine();
        a[2] = ler.readLine();
        
        if ("vertebrado".equals(a[0])) {
            if ("ave".equals(a[1])) {
                if ("carnivoro".equals(a[2])) {
                    System.out.printf("aguia\n");
                } else if ("onivoro".equals(a[2])) {
                    System.out.printf("pomba\n");
                }
            } else if ("mamifero".equals(a[1])) {
                if ("herbivoro".equals(a[2])) {
                    System.out.printf("vaca\n");
                } else if ("onivoro".equals(a[2])) {
                    System.out.printf("homem\n");
                }
            }
        } else if ("invertebrado".equals(a[0])) {
            if ("inseto".equals(a[1])) {
                if ("hematofago".equals(a[2])) {
                    System.out.printf("pulga\n");
                } else if ("herbivoro".equals(a[2])) {
                    System.out.printf("lagarta\n");
                }
            } else if ("anelideo".equals(a[1])) {
                if ("hematofago".equals(a[2])) {
                    System.out.printf("sanguessuga\n");
                } else if ("onivoro".equals(a[2])) {
                    System.out.printf("minhoca\n");
                }
            }
        }
    }
}
