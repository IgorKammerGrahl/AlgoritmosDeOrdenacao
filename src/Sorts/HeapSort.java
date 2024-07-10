package Sorts;

public class HeapSort {
	  
    static long trocas = 0;
    static long comparacoes = 0;
    
    public static Resultado sort(long[] vetor){
        int n = vetor.length;
        
        for(int i = n / 2 - 1; i >= 0; i--){
            aplicarHeap(vetor, n, i);
        }
        
        for(int j = n-1; j > 0; j--){
            long aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;
            trocas++;
            
            aplicarHeap(vetor, j, 0);
        }
        return new Resultado(vetor, trocas, comparacoes);
    }
    
    private static void aplicarHeap(long[] vetor, int n, int i){
        int raiz = i;
        int esquerda = 2*i + 1;
        int direita = 2*i + 2;
        
        comparacoes++;
        if (esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        
        comparacoes++;
        if (direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }
        
        if (raiz != i){
            long aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            trocas++;
            
            aplicarHeap(vetor, n, raiz);
        }
    }
}
