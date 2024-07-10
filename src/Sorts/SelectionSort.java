package Sorts;

public class SelectionSort {
	 public static Resultado sort(long[] vetor){
		 long trocas = 0;
	        long comparacoes = 0;
	        long aux;
	        int posicao_menor;
	        
	        for (int i = 0; i < vetor.length; i++) {
	            posicao_menor = i;
	            for (int j = i + 1; j < vetor.length; j++) {
	                comparacoes++; // Contador de comparações
	                if (vetor[j] < vetor[posicao_menor]) {
	                    posicao_menor = j;
	                }
	            }
	            if (posicao_menor != i) {
	                aux = vetor[posicao_menor];
	                vetor[posicao_menor] = vetor[i];
	                vetor[i] = aux;
	                trocas++; // Contador de trocas
	            }
	        }
	        
	        return new Resultado(vetor, trocas, comparacoes);
	    }
}
