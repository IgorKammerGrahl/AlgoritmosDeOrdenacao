package Sorts;

public class MergeSort {
	static long trocas = 0;
    static long comparacoes = 0;

    public static Resultado sort(long[] vetor) {
        mergeSort(vetor, 0, vetor.length - 1);
        return new Resultado(vetor, trocas, comparacoes);
    }

    private static void mergeSort(long[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;

            mergeSort(vetor, esquerda, meio);
            mergeSort(vetor, meio + 1, direita);

            merge(vetor, esquerda, meio, direita);
        }
    }

    private static void merge(long[] vetor, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        long[] esquerdaArr = new long[n1];
        long[] direitaArr = new long[n2];

        for (int i = 0; i < n1; ++i)
            esquerdaArr[i] = vetor[esquerda + i];
        for (int j = 0; j < n2; ++j)
            direitaArr[j] = vetor[meio + 1 + j];

        int i = 0, j = 0;
        int k = esquerda;

        while (i < n1 && j < n2) {
            comparacoes++;
            if (esquerdaArr[i] <= direitaArr[j]) {
                vetor[k] = esquerdaArr[i];
                i++;
            } else {
                vetor[k] = direitaArr[j];
                j++;
            }
            k++;
            trocas++;
        }

        while (i < n1) {
            vetor[k] = esquerdaArr[i];
            i++;
            k++;
            trocas++;
        }

        while (j < n2) {
            vetor[k] = direitaArr[j];
            j++;
            k++;
            trocas++;
        }
    }

}
