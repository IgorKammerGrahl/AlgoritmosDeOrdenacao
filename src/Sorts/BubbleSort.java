package Sorts;

public class BubbleSort {
	 public static Resultado sort(long[] vetor){
	        long trocas = 0;
	        long comparacoes = 0;
	        long aux;
	        boolean trocou;
	        for(int i = 0; i < vetor.length - 1; i++){ 
	        	trocou = false;
	            for(int j = 0; j < vetor.length - 1 - i; j++){
	            	comparacoes++; // Contador de comparações 
	                if (vetor[j] > vetor[j + 1]){
	                    aux = vetor[j];
	                    vetor[j] = vetor[j + 1];
	                    vetor[j + 1] = aux;
	                    trocou = true;
	                    trocas++; // Contador de trocas
	                }
	            }
	            if (!trocou) break;
	        }
	        return new Resultado(vetor, trocas, comparacoes);
	    }
}
