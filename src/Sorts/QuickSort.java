package Sorts;

public class QuickSort {

    static long trocas = 0;
    static long comparacoes = 0;
    
    public static Resultado sort(long[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            sort(vetor, esquerda, p);
            sort(vetor, p + 1, direita);
        }
        return new Resultado(vetor, trocas, comparacoes);
    }    
    
    private static int particao(long[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        long pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita;
        while(true){
            do{
                i++;
                comparacoes++;
            }while(vetor[i] < pivot);
            do{
                j--;
                comparacoes++;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            long aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            trocas++;
        }
    }
}
