package Sorts;

public class InsertionSort {
    public static Resultado sort(long[] vetor) {
        long trocas = 0;
        long comparacoes = 0;
        long aux;
        int j;
        for(int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux) {
                comparacoes++; // Contador de comparações
                vetor[j + 1] = vetor[j];
                j--;
                trocas++; // Contador de trocas
            }
            comparacoes++; // Adiciona a comparação que falhou no while
            vetor[j + 1] = aux;
            if (j != i - 1) { // Incrementa trocas apenas se houve movimentação
                trocas++; // Contador de trocas
            }
        }
        return new Resultado(vetor, trocas, comparacoes);
    }
}
