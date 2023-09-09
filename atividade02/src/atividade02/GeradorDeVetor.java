package atividade02;
import java.util.Random;

public class GeradorDeVetor {
	public static int[] geraVetorNumericoOrdenadoCrescente(int tamanho) {
		int vetor[]= new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			vetor[i]=i+1;
			
		}
		return vetor;
	}
	public static int[] geraVetorNumericoOrdenadoDecrescente(int tamanho) {
		int vetor[]= new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			vetor[i]=tamanho-i;
			
		}
		return vetor;
	}
	 public static int[] gerarVetorNumericoAleatorio(int tamanho) {
	        int[] vetor = new int[tamanho];
	        Random random = new Random();

	        for (int i = 0; i < tamanho; i++) {
	            vetor[i] = random.nextInt(tamanho)+1; 
	        }

	        return vetor;
	    }

}
