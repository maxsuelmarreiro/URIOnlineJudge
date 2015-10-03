#include <stdio.h>
int main(){
	long long int NsH, NsO, n1, n2; 

	while(scanf("%lld %lld", &NsH, &NsO) != EOF){
		if(NsH <= NsO){
			n1 = NsH; n2 = NsO;
		}else{
			n2 = NsH; n1 = NsO;		
		}
		printf("%lld\n", n2-n1);
	}
	return 0;
}
