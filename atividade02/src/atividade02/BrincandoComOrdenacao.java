package atividade02;
import java.util.Arrays;

public class BrincandoComOrdenacao {
	
	 public static long calcularTempoMedio_bubbleSort(Ordenacao_IF x, int[] numeros) {
	    int numExecucoes = 50;
	    long tempoTotal = 0;
	   
	    for (int i = 0; i < numExecucoes; i++) {
	        int[] numerosClone = Arrays.copyOf(numeros, numeros.length);
	        
	       
	            tempoTotal += x.bubbleSort(numerosClone);
	      
	    }
	    
	    long tempoMedio = tempoTotal / numExecucoes;
	    return tempoMedio;
	}

	 
	
	 
	 
	 public static long calcularTempoMedio_countingSort(Ordenacao_IF x,int[] numeros) {
	        int numExecucoes = 50;
	        long tempoTotal = 0;
	       
           
	        for (int i = 0; i < numExecucoes; i++) {
	        	int[] numerosClone = Arrays.copyOf(numeros, numeros.length);
	            
	         
	        	  tempoTotal+=x.countingSort(numerosClone);
	          
	          
	        }

	        return tempoTotal / numExecucoes; 	   
	        }
	 public static long calcularTempoMedio_insertionSort(Ordenacao_IF x,int[] numeros) {
	        int numExecucoes = 50;
	        long tempoTotal = 0;
	       
        
	        for (int i = 0; i < numExecucoes; i++) {
	        	int[] numerosClone = Arrays.copyOf(numeros, numeros.length);
	            
	          
	        	  tempoTotal+=x.insertionSort(numerosClone);
	          
	          
	        }

	        return tempoTotal / numExecucoes; 	   
	        }
	 public static long calcularTempoMedio_mergeSort(Ordenacao_IF x,int[] numeros) {
	        int numExecucoes = 50;
	        long tempoTotal = 0;
	       
     
	        for (int i = 0; i < numExecucoes; i++) {
	        	int[] numerosClone = Arrays.copyOf(numeros, numeros.length);
	            
	        	  tempoTotal+=x.mergeSort(numerosClone);
	          
	          
	        }

	        return tempoTotal / numExecucoes; 	   
	        }
	 public static long calcularTempoMedio_quickSort(Ordenacao_IF x,int[] numeros) {
	        int numExecucoes = 50;
	        long tempoTotal = 0;
	       
  
	        for (int i = 0; i < numExecucoes; i++) {
	        	int[] numerosClone = Arrays.copyOf(numeros, numeros.length);
	            
	        	  tempoTotal+=x.quickSort(numerosClone);
	          
	          
	        }

	        return tempoTotal / numExecucoes; 	   
	        }
	 public static long calcularTempoMedio_quickSort_Java(Ordenacao_IF x,int[] numeros) {
	        int numExecucoes = 50;
	        long tempoTotal = 0;
	       

	        for (int i = 0; i < numExecucoes; i++) {
	        	int[] numerosClone = Arrays.copyOf(numeros, numeros.length);
	            
	        	  tempoTotal+=x.quickSort_Java(numerosClone);
	         
	          
	        }

	        return tempoTotal / numExecucoes; 	   
	        }
	 public static long calcularTempoMedio_random_quickSort(Ordenacao_IF x,int[] numeros) {
	        int numExecucoes = 50;
	        long tempoTotal = 0;
	       

	        for (int i = 0; i < numExecucoes; i++) {
	        	int[] numerosClone = Arrays.copyOf(numeros, numeros.length);
	            
	        	  tempoTotal+=x.random_quickSort(numerosClone);
	          
	          
	        }

	        return tempoTotal / numExecucoes; 	   
	        }
	 public static long calcularTempoMedio_selectionSort(Ordenacao_IF x,int[] numeros) {
	        int numExecucoes = 50;
	        long tempoTotal = 0;
	       

	        for (int i = 0; i < numExecucoes; i++) {
	        	int[] numerosClone = Arrays.copyOf(numeros, numeros.length);
	            
	          
	        	  tempoTotal+=x.selectionSort(numerosClone);
	          
	          
	        }

	        return tempoTotal / numExecucoes; 	   
	        }
	 
	 

	public static void main(String[] args) {
		Ordenacao x=new Ordenacao();
		
		int[] vetor5k_Aleatorio=  GeradorDeVetor.gerarVetorNumericoAleatorio(5000);
		int[] vetor5k_Crescente= GeradorDeVetor.geraVetorNumericoOrdenadoCrescente(5000);
		int[] vetor5k_Decrescente= GeradorDeVetor.geraVetorNumericoOrdenadoDecrescente(5000);
		
		int[] vetor10k_Aleatorio=  GeradorDeVetor.gerarVetorNumericoAleatorio(10000);
		int[] vetor10k_Crescente= GeradorDeVetor.geraVetorNumericoOrdenadoCrescente(10000);
		int[] vetor10k_Decrescente= GeradorDeVetor.geraVetorNumericoOrdenadoDecrescente(10000);
		
		int[] vetor15k_Aleatorio=  GeradorDeVetor.gerarVetorNumericoAleatorio(15000);
		int[] vetor15k_Crescente= GeradorDeVetor.geraVetorNumericoOrdenadoCrescente(15000);
		int[] vetor15k_Decrescente= GeradorDeVetor.geraVetorNumericoOrdenadoDecrescente(15000);
		
		
		
		long tempoBubbleSort5k_Aleatorio = calcularTempoMedio_bubbleSort(x, vetor5k_Aleatorio);
	    long tempoBubbleSort5k_Crescente = calcularTempoMedio_bubbleSort(x, vetor5k_Crescente);
	    long tempoBubbleSort5k_Decrescente = calcularTempoMedio_bubbleSort(x, vetor5k_Decrescente);

	    long tempoSelectionSort5k_Aleatorio = calcularTempoMedio_selectionSort(x, vetor5k_Aleatorio);
	    long tempoSelectionSort5k_Crescente = calcularTempoMedio_selectionSort(x, vetor5k_Crescente);
	    long tempoSelectionSort5k_Decrescente = calcularTempoMedio_selectionSort(x, vetor5k_Decrescente);

	    long tempoInsertionSort5k_Aleatorio = calcularTempoMedio_insertionSort(x, vetor5k_Aleatorio);
	    long tempoInsertionSort5k_Crescente = calcularTempoMedio_insertionSort(x, vetor5k_Crescente);
	    long tempoInsertionSort5k_Decrescente = calcularTempoMedio_insertionSort(x, vetor5k_Decrescente);

	    long tempoMergeSort5k_Aleatorio = calcularTempoMedio_mergeSort(x, vetor5k_Aleatorio);
	    long tempoMergeSort5k_Crescente = calcularTempoMedio_mergeSort(x, vetor5k_Crescente);
	    long tempoMergeSort5k_Decrescente = calcularTempoMedio_mergeSort(x, vetor5k_Decrescente);

	    long tempoRandomQuickSort5k_Aleatorio = calcularTempoMedio_random_quickSort(x, vetor5k_Aleatorio);
	    long tempoRandomQuickSort5k_Crescente = calcularTempoMedio_random_quickSort(x, vetor5k_Crescente);
	    long tempoRandomQuickSort5k_Decrescente = calcularTempoMedio_random_quickSort(x, vetor5k_Decrescente);

	    long tempoQuickSortJava5k_Aleatorio = calcularTempoMedio_quickSort_Java(x, vetor5k_Aleatorio);
	    long tempoQuickSortJava5k_Crescente = calcularTempoMedio_quickSort_Java(x, vetor5k_Crescente);
	    long tempoQuickSortJava5k_Decrescente = calcularTempoMedio_quickSort_Java(x, vetor5k_Decrescente);

	    long tempoCountingSort5k_Aleatorio = calcularTempoMedio_countingSort(x, vetor5k_Aleatorio);
	    long tempoCountingSort5k_Crescente = calcularTempoMedio_countingSort(x, vetor5k_Crescente);
	    long tempoCountingSort5k_Decrescente = calcularTempoMedio_countingSort(x, vetor5k_Decrescente);
		 
	    long tempoBubbleSort10k_Aleatorio = calcularTempoMedio_bubbleSort(x, vetor10k_Aleatorio);
	    long tempoBubbleSort10k_Crescente = calcularTempoMedio_bubbleSort(x, vetor10k_Crescente);
	    long tempoBubbleSort10k_Decrescente = calcularTempoMedio_bubbleSort(x, vetor10k_Decrescente);

	    long tempoSelectionSort10k_Aleatorio = calcularTempoMedio_selectionSort(x, vetor10k_Aleatorio);
	    long tempoSelectionSort10k_Crescente = calcularTempoMedio_selectionSort(x, vetor10k_Crescente);
	    long tempoSelectionSort10k_Decrescente = calcularTempoMedio_selectionSort(x, vetor10k_Decrescente);

	    long tempoInsertionSort10k_Aleatorio = calcularTempoMedio_insertionSort(x, vetor10k_Aleatorio);
	    long tempoInsertionSort10k_Crescente = calcularTempoMedio_insertionSort(x, vetor10k_Crescente);
	    long tempoInsertionSort10k_Decrescente = calcularTempoMedio_insertionSort(x, vetor10k_Decrescente);

	    long tempoMergeSort10k_Aleatorio = calcularTempoMedio_mergeSort(x, vetor10k_Aleatorio);
	    long tempoMergeSort10k_Crescente = calcularTempoMedio_mergeSort(x, vetor10k_Crescente);
	    long tempoMergeSort10k_Decrescente = calcularTempoMedio_mergeSort(x, vetor10k_Decrescente);

	    long tempoRandomQuickSort10k_Aleatorio = calcularTempoMedio_random_quickSort(x, vetor10k_Aleatorio);
	    long tempoRandomQuickSort10k_Crescente = calcularTempoMedio_random_quickSort(x, vetor10k_Crescente);
	    long tempoRandomQuickSort10k_Decrescente = calcularTempoMedio_random_quickSort(x, vetor10k_Decrescente);

	    long tempoQuickSortJava10k_Aleatorio = calcularTempoMedio_quickSort_Java(x, vetor10k_Aleatorio);
	    long tempoQuickSortJava10k_Crescente = calcularTempoMedio_quickSort_Java(x, vetor10k_Crescente);
	    long tempoQuickSortJava10k_Decrescente = calcularTempoMedio_quickSort_Java(x, vetor10k_Decrescente);

	    long tempoCountingSort10k_Aleatorio = calcularTempoMedio_countingSort(x, vetor10k_Aleatorio);
	    long tempoCountingSort10k_Crescente = calcularTempoMedio_countingSort(x, vetor10k_Crescente);
	    long tempoCountingSort10k_Decrescente = calcularTempoMedio_countingSort(x, vetor10k_Decrescente);        
		
	    
	    long tempoBubbleSort15k_Aleatorio = calcularTempoMedio_bubbleSort(x, vetor15k_Aleatorio);
	    long tempoBubbleSort15k_Crescente = calcularTempoMedio_bubbleSort(x, vetor15k_Crescente);
	    long tempoBubbleSort15k_Decrescente = calcularTempoMedio_bubbleSort(x, vetor15k_Decrescente);

	    long tempoSelectionSort15k_Aleatorio = calcularTempoMedio_selectionSort(x, vetor15k_Aleatorio);
	    long tempoSelectionSort15k_Crescente = calcularTempoMedio_selectionSort(x, vetor15k_Crescente);
	    long tempoSelectionSort15k_Decrescente = calcularTempoMedio_selectionSort(x, vetor15k_Decrescente);

	    long tempoInsertionSort15k_Aleatorio = calcularTempoMedio_insertionSort(x, vetor15k_Aleatorio);
	    long tempoInsertionSort15k_Crescente = calcularTempoMedio_insertionSort(x, vetor15k_Crescente);
	    long tempoInsertionSort15k_Decrescente = calcularTempoMedio_insertionSort(x, vetor15k_Decrescente);

	    long tempoMergeSort15k_Aleatorio = calcularTempoMedio_mergeSort(x, vetor15k_Aleatorio);
	    long tempoMergeSort15k_Crescente = calcularTempoMedio_mergeSort(x, vetor15k_Crescente);
	    long tempoMergeSort15k_Decrescente = calcularTempoMedio_mergeSort(x, vetor15k_Decrescente);

	    long tempoRandomQuickSort15k_Aleatorio = calcularTempoMedio_random_quickSort(x, vetor15k_Aleatorio);
	    long tempoRandomQuickSort15k_Crescente = calcularTempoMedio_random_quickSort(x, vetor15k_Crescente);
	    long tempoRandomQuickSort15k_Decrescente = calcularTempoMedio_random_quickSort(x, vetor15k_Decrescente);

	    long tempoQuickSortJava15k_Aleatorio = calcularTempoMedio_quickSort_Java(x, vetor15k_Aleatorio);
	    long tempoQuickSortJava15k_Crescente = calcularTempoMedio_quickSort_Java(x, vetor15k_Crescente);
	    long tempoQuickSortJava15k_Decrescente = calcularTempoMedio_quickSort_Java(x, vetor15k_Decrescente);

	    long tempoCountingSort15k_Aleatorio = calcularTempoMedio_countingSort(x, vetor15k_Aleatorio);
	    long tempoCountingSort15k_Crescente = calcularTempoMedio_countingSort(x, vetor15k_Crescente);
	    long tempoCountingSort15k_Decrescente = calcularTempoMedio_countingSort(x, vetor15k_Decrescente);
        
		


	 

        
        System.out.println("Tamanho | Configuração     | BubbleSort | SelectionSort | InsertionSort | MergeSort | RandomQuickSort | QuickSortJava | CountingSort");
        System.out.println("--------|-------------------|------------|---------------|---------------|-----------|-----------------|--------------|--------------");
        System.out.printf("%7d | Aleatório         | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor5k_Aleatorio.length, tempoBubbleSort5k_Aleatorio, tempoSelectionSort5k_Aleatorio, tempoInsertionSort5k_Aleatorio, tempoMergeSort5k_Aleatorio, tempoRandomQuickSort5k_Aleatorio, tempoQuickSortJava5k_Aleatorio, tempoCountingSort5k_Aleatorio);
        System.out.printf("%7d | Crescente         | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor5k_Crescente.length, tempoBubbleSort5k_Crescente, tempoSelectionSort5k_Crescente, tempoInsertionSort5k_Crescente, tempoMergeSort5k_Crescente, tempoRandomQuickSort5k_Crescente, tempoQuickSortJava5k_Crescente, tempoCountingSort5k_Crescente);
        System.out.printf("%7d | Decrescente       | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor5k_Decrescente.length, tempoBubbleSort5k_Decrescente, tempoSelectionSort5k_Decrescente, tempoInsertionSort5k_Decrescente, tempoMergeSort5k_Decrescente, tempoRandomQuickSort5k_Decrescente, tempoQuickSortJava5k_Decrescente, tempoCountingSort5k_Decrescente);

		
	    System.out.println("Tamanho | Configuração     | BubbleSort | SelectionSort | InsertionSort | MergeSort | RandomQuickSort | QuickSortJava | CountingSort");
	    System.out.println("--------|-------------------|------------|---------------|---------------|-----------|-----------------|--------------|--------------");
	    System.out.printf("%7d | Aleatório         | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor10k_Aleatorio.length, tempoBubbleSort10k_Aleatorio, tempoSelectionSort10k_Aleatorio, tempoInsertionSort10k_Aleatorio, tempoMergeSort10k_Aleatorio, tempoRandomQuickSort10k_Aleatorio, tempoQuickSortJava10k_Aleatorio, tempoCountingSort10k_Aleatorio);
	    System.out.printf("%7d | Crescente         | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor10k_Crescente.length, tempoBubbleSort10k_Crescente, tempoSelectionSort10k_Crescente, tempoInsertionSort10k_Crescente, tempoMergeSort10k_Crescente, tempoRandomQuickSort10k_Crescente, tempoQuickSortJava10k_Crescente, tempoCountingSort10k_Crescente);
	    System.out.printf("%7d | Decrescente       | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor10k_Decrescente.length, tempoBubbleSort10k_Decrescente, tempoSelectionSort10k_Decrescente, tempoInsertionSort10k_Decrescente, tempoMergeSort10k_Decrescente, tempoRandomQuickSort10k_Decrescente, tempoQuickSortJava10k_Decrescente, tempoCountingSort10k_Decrescente);

	    System.out.println("Tamanho | Configuração     | BubbleSort | SelectionSort | InsertionSort | MergeSort | RandomQuickSort | QuickSortJava | CountingSort");
	    System.out.println("--------|-------------------|------------|---------------|---------------|-----------|-----------------|--------------|--------------");
	    System.out.printf("%7d | Aleatório         | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor15k_Aleatorio.length, tempoBubbleSort15k_Aleatorio, tempoSelectionSort15k_Aleatorio, tempoInsertionSort15k_Aleatorio, tempoMergeSort15k_Aleatorio, tempoRandomQuickSort15k_Aleatorio, tempoQuickSortJava15k_Aleatorio, tempoCountingSort15k_Aleatorio);
	    System.out.printf("%7d | Crescente         | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor15k_Crescente.length, tempoBubbleSort15k_Crescente, tempoSelectionSort15k_Crescente, tempoInsertionSort15k_Crescente, tempoMergeSort15k_Crescente, tempoRandomQuickSort15k_Crescente, tempoQuickSortJava15k_Crescente, tempoCountingSort15k_Crescente);
	    System.out.printf("%7d | Decrescente       | %,11d | %,13d | %,13d | %,9d | %,15d | %,12d | %,12d%n", vetor15k_Decrescente.length, tempoBubbleSort15k_Decrescente, tempoSelectionSort15k_Decrescente, tempoInsertionSort15k_Decrescente, tempoMergeSort15k_Decrescente, tempoRandomQuickSort15k_Decrescente, tempoQuickSortJava15k_Decrescente, tempoCountingSort15k_Decrescente);

		
		
	}

}
