import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int v, a100=0, a50=0, a20=0, a10=0, a5=0, a2=0, a1=0;
        v = Integer.parseInt(ler.readLine());
        System.out.printf("%d\n", v);
        while (v!=0){
            if(v>=100){
                a100++; v-=100;
            }else if(v>=50){
                a50++; v-=50;
            }else if (v>=20) {
                a20++; v-=20;
            }else if (v>=10){
                a10++; v-=10;
            }else if (v>=5) {
                a5++; v-=5;
            }else if (v>=2){
                a2++; v-=2;
            }else{
                a1++; v-=1;
            }
        }
        System.out.printf("%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n"
                + "", a100,a50,a20,a10,a5,a2,a1);
    }
}
