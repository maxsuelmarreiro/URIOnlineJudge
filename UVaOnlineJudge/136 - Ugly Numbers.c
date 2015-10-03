#include <stdio.h>
int main(){
	int un=0, i=0, cont=1, unn=1;
	
	while(un != 10){
		i = cont;
		while(i%2 == 0){
			i = i/2;
		}
		while(i%3 == 0){
			i = i/3;
		}	
		while(i%5 == 0){
			i = i/5;
		}
		if(i==1){
			un++;
			unn = cont;
		}
		cont++;
	}
	

	printf("The 1500'th ugly number is %d.\n", unn); 
	return 0;
}
