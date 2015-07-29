import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int a100=0, a50=0, a20=0, a10=0, a5=0, a2=0, m1=0,m50=0,m25=0,m10=0,m05=0,m01=0;
        double v;
        v = Double.parseDouble(ler.readLine());
        while (v!=0.00){
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
            }else if(v>=1){
                m1++; v-=1;
            }else if(v<1){
                if (v>=0.50) {
                    m50++; v-=0.50;
                }else if(v>=0.25){
                    m25++; v-=0.25;
                }else if(v>=0.10){
                    m10++; v-=0.10;
                }else if(v>=0.05){
                    m05++; v-=0.05;
                }else if(v>=0.01){
                    m01++; v-=0.01;
                }else{
                    break;
                }
            }
        }
        System.out.printf("NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\nMOEDAS:\n%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10\n%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n",a100,a50,a20,a10,a5,a2,m1,m50,m25,m10,m05,m01);
    }
}