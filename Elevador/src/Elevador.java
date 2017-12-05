
	public class Elevador {
		
	
			int andares=10, capacidade=5, andaratual=0, capatual = 0;
			
	       //inicializa
			int inicializa(){
				andares = 10;
				 capacidade=5;
			return andaratual;}
			
			
		   //entrando
			int entrar(){
				if (capatual<5){
				capatual++;
				}
				return andaratual;}
			
			
			//saindo
			int Sair(){
			if (capatual > 0){
				capatual --;}
			return andaratual;
			}
			//sobe
			int subir () {
			if (andaratual < 10){
			andaratual ++;
			}
			return andaratual;
			}
            //Desce
			int Descer() {
			if (andaratual >0) {
				andaratual --;
	          
	            
	            }
			return andaratual;
	        }
	        
			Elevador(){
	}
	}
	