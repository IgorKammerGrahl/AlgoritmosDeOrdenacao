package Sorts;

public class Main {

	public static void main(String[] args) {
		long[] vetorAleatorio = new long[100000];
		long[] vetorOrdenado = new long[100000];
		long[] vetorInvertido = new long[100000];
        
        for(int i=0; i < vetorAleatorio.length; i++){
        	vetorAleatorio[i] = (int) Math.floor(Math.random() * vetorAleatorio.length);
        }
        
        for (int i = 0; i < vetorOrdenado.length; i++) {
            vetorOrdenado[i] = i;
        }
        
        for (int i = 0; i < vetorInvertido.length; i++) {
            vetorInvertido[i] = vetorInvertido.length - 1 - i;
        }
        
        long inicio, fim;
        Resultado resultado;
        
        
        System.out.println("\n\nBubble Sort");
        
        System.out.println("Vetor Aleátorio: ");
        inicio = System.currentTimeMillis();
        resultado = BubbleSort.sort(vetorAleatorio.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
       
        System.out.println("Vetor Ordenado: ");
        inicio = System.currentTimeMillis();
        resultado = BubbleSort.sort(vetorOrdenado.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Invertido: ");
        inicio = System.currentTimeMillis();
        resultado = BubbleSort.sort(vetorInvertido.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        
        System.out.println("\n\nInsertion Sort");
        
        System.out.println("Vetor Aleátorio: ");
        inicio = System.currentTimeMillis();
        resultado = InsertionSort.sort(vetorAleatorio.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Ordenado: ");
        inicio = System.currentTimeMillis();
        resultado = InsertionSort.sort(vetorOrdenado.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Invertido: ");
        inicio = System.currentTimeMillis();
        resultado = InsertionSort.sort(vetorInvertido.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("\n\nSelection Sort");
        
        System.out.println("Vetor Aleátorio: ");
        inicio = System.currentTimeMillis();
        resultado = SelectionSort.sort(vetorAleatorio.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Ordenado: ");
        inicio = System.currentTimeMillis();
        resultado = SelectionSort.sort(vetorOrdenado.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Invertido: ");
        inicio = System.currentTimeMillis();
        resultado = SelectionSort.sort(vetorInvertido.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("\n\nHeap Sort");
        
        System.out.println("Vetor Aleátorio: ");
        inicio = System.currentTimeMillis();
        resultado = HeapSort.sort(vetorAleatorio.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Ordenado: ");
        inicio = System.currentTimeMillis();
        resultado = HeapSort.sort(vetorOrdenado.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Invertido: ");
        inicio = System.currentTimeMillis();
        resultado = HeapSort.sort(vetorInvertido.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("\n\nQuick Sort");
        
        System.out.println("Vetor Aleátorio: ");
        inicio = System.currentTimeMillis();
        resultado = QuickSort.sort(vetorAleatorio.clone(), 0, vetorAleatorio.length);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Ordenado: ");
        inicio = System.currentTimeMillis();
        resultado = QuickSort.sort(vetorOrdenado.clone(), 0, vetorOrdenado.length);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Invertida: ");
        inicio = System.currentTimeMillis();
        resultado = QuickSort.sort(vetorInvertido.clone(), 0, vetorInvertido.length);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("\n\nMerge Sort");
        
        System.out.println("Vetor Aleátorio: ");
        inicio = System.currentTimeMillis();
        resultado = MergeSort.sort(vetorAleatorio.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Ordenado: ");
        inicio = System.currentTimeMillis();
        resultado = MergeSort.sort(vetorOrdenado.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
        System.out.println("Vetor Invertido: ");
        inicio = System.currentTimeMillis();
        resultado = MergeSort.sort(vetorInvertido.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("Trocas: " + resultado.getTrocas());
        System.out.println("Comparações: " + resultado.getComparacoes());
        
    }

	
}


