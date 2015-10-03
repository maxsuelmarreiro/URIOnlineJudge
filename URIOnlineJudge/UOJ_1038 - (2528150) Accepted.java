import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int cod, qtd;
        float valor;
        String in[];
        in = ler.readLine().split(" ");
        cod = Integer.parseInt(in[0]);
        qtd = Integer.parseInt(in[1]);
        switch(cod){
            case 1:
                System.out.printf("Total: R$ %.2f\n", (float) (qtd*4.00)); 
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", (float) (qtd*4.50));
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", (float) (qtd*5.00));
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", (float) (qtd*2.00)); 
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", (float) (qtd*1.50)); 
                break;
        }
    }
}
