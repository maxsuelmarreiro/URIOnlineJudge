#include <stdio.h>
int main(){
	char t;
	int cont = 0; 
	
	while(scanf("%c", &t) != EOF){
		if(t == '"'){
			if(cont%2==0){
				printf("``");
			}else{
				printf("''");
			}
			cont++;
		}else{
			printf("%c", t);
		}
	}
	return 0;
}
