package Sorts;

public class Resultado {
	  
	private long[] vetor;
	private long trocas;
	private long comparacoes;
	    
	public Resultado(long[] vetor, long trocas, long comparacoes){
	
		this.vetor = vetor;
	
		this.trocas = trocas;
		
		this.comparacoes = comparacoes;
	}

	  
	public long[] getVetor() {
	        
		return vetor;
	}

	    
	public long getTrocas() {
	        
		return trocas;   
	}
	    
	public long getComparacoes() {
		
		return comparacoes;
	}
	    
}
