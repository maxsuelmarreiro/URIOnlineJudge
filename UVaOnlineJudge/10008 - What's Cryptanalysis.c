#include <stdio.h>
int main(){
	char c;
	int num=0, contn=0, i;
	struct letras { 
   		char letra; 
   		int qtd; 
	};  
	struct letras ltr[26];
	ltr[0].letra = 'A';
	ltr[1].letra = 'B';
	ltr[2].letra = 'C';
	ltr[3].letra = 'D';
	ltr[4].letra = 'E';
	ltr[5].letra = 'F';	
	ltr[6].letra = 'G';	
	ltr[7].letra = 'H';	
	ltr[8].letra = 'I';	
	ltr[9].letra = 'J';	
	ltr[10].letra = 'K';	
	ltr[11].letra = 'L';	
	ltr[12].letra = 'M';	
	ltr[13].letra = 'N';	
	ltr[14].letra = 'O';	
	ltr[15].letra = 'P';	
	ltr[16].letra = 'Q';	
	ltr[17].letra = 'R';	
	ltr[18].letra = 'S';
	ltr[19].letra = 'T';	
	ltr[20].letra = 'U';	
	ltr[21].letra = 'V';	
	ltr[22].letra = 'W';	
	ltr[23].letra = 'X';	
	ltr[24].letra = 'Y';	
	ltr[25].letra = 'Z';	
	for(i=0; i<26; i++){
		ltr[i].qtd = 0;	
	}
	
	while(scanf("%d", &num) != EOF){
		
		while(contn != num+1){
			scanf("%c", &c);
			c = toupper(c);
			if(isalpha(c)){
				ltr[c-'A'].qtd = ltr[c-'A'].qtd + 1;
			}
			if(c == '\n'){
				contn++;
			}
		}
		
		for(i=0; i<26; i++){
			if(ltr[i].qtd != 0){
				printf("%c %d \n", ltr[i].letra, ltr[i].qtd);
			}
		}
		
		
		struct letras aux;
		
		for(int i=0; i<26; i++){
    		for(int j=i;j<26; j++){
				if(ltr[i].qtd > 0){
	    			aux.letra = temp[i].nome;
	    			temp[i].nome = temp[j].nome
    				temp[j].nome = aux.nome;
				}
			}
		}
		contn=0;
	}
}
