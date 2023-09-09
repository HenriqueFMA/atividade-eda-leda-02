package atividade02;


import java.util.Random;
import java.util.Arrays;

public class Ordenacao implements Ordenacao_IF {

	@Override
	public boolean checaVetorOrdenado(int[] numeros) {
		
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i]<numeros[i-1]) {
				return false;
				
			}
		}
		
		return true;
	}

	@Override
	public long bubbleSort(int[] numeros) {
		
		long antes = System.nanoTime();
		 int auxiliar;
		 for(int i=0;i<numeros.length;i++) {
			 for (int j = i; j < numeros.length; j++) {
				 if(numeros[i]>numeros[j]) {
					 auxiliar=numeros[i];
					 numeros[i]=numeros[j];
					 numeros[j]=auxiliar;
				 }
			 }
			 
		 }
		 
		
		long depois = System.nanoTime();
		long tempoF=depois-antes;
		
		return tempoF ;
	}
	
	@Override
	public long selectionSort(int[] numeros) {
		long antes = System.nanoTime();
		
		int n=numeros.length;
		for(int i=0;i<n-1;i++) {
			int menor_indice=i;
			for(int j=i+1;j<n;j++) {
				if (numeros[j]<numeros[menor_indice]) {
					menor_indice=j;
				}
			}
			int temp=numeros[menor_indice];
			numeros[menor_indice]=numeros[i];
			numeros[i]=temp;
			
		}

		long depois = System.nanoTime();
		long tempoF=depois-antes;
		
		return tempoF ;
	}

	@Override
	public long insertionSort(int[] numeros) {
		long antes = System.nanoTime();
		
			int j;
			int key;
			int i;

			for (j = 1; j < numeros.length; j++){
				key = numeros[j];
				for (i = j - 1; (i >= 0) && (numeros[i] > key); i--){
					numeros[i + 1] = numeros[i];
	       }
					numeros[i + 1] = key;
	    }

		long depois = System.nanoTime();
		long tempoF=depois-antes;
		
		return tempoF ;
	}

	@Override
	public long mergeSort(int[] numeros) {
		long antes = System.nanoTime();
	    if (numeros == null || numeros.length <= 1) {
	    	long depois = System.nanoTime();
			long tempoF=depois-antes;
			
			return tempoF ;
        }
		
	    int n = numeros.length;
        int meio = n / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[n - meio];

       
        System.arraycopy(numeros, 0, esquerda, 0, meio);
        System.arraycopy(numeros, meio, direita, 0, n - meio);

       
        mergeSort(esquerda);
        mergeSort(direita);

       
        merge(numeros, esquerda, direita);
        
        long depois = System.nanoTime();
		long tempoF=depois-antes;
		
		return tempoF ;
		
	    
	}
	 private static void merge(int[] numeros, int[] esquerda, int[] direita) {
	        int i = 0, j = 0, k = 0;

	        while (i < esquerda.length && j < direita.length) {
	            if (esquerda[i] <= direita[j]) {
	                numeros[k++] = esquerda[i++];
	            } else {
	                numeros[k++] = esquerda[j++];
	            }
	        }

	        while (i < esquerda.length) {
	            numeros[k++] = esquerda[i++];
	        }

	        while (j < direita.length) {
	            numeros[k++] = direita[j++];
	        }
	    }


	@Override
	public long quickSort(int[] numeros) {
		long antes = System.nanoTime();
		
		quickSort(numeros, 0, numeros.length - 1);
		
		long depois = System.nanoTime();
		long tempoF=depois-antes;
		
		return tempoF ;
	}
	private static void quickSort(int[] numeros, int esquerda, int direita) {
        if (esquerda < direita ) {
            int pivotIndex = divisao(numeros, esquerda, direita );
            quickSort(numeros,esquerda , pivotIndex - 1);
            quickSort(numeros, pivotIndex + 1, direita);
        }
    }

    private static int divisao(int[] numeros, int esquerda, int direita) {
        int pivot = numeros[direita];
        int i = esquerda - 1;

        for (int j = esquerda; j < direita; j++) {
            if (numeros[j] <= pivot) {
                i++;
                troca(numeros, i, j);
            }
        }

        troca(numeros, i + 1, direita);
        return i + 1;
    }

    private static void troca(int[] numeros, int i, int j) {
        int temp = numeros[i];
        numeros[i] = numeros[j];
        numeros[j] = temp;
    }
	

	@Override
	public long random_quickSort(int[] numeros) {
		long antes = System.nanoTime();
		
		randomQuickSort(numeros, 0, numeros.length - 1);
		
		
		
		long depois = System.nanoTime();
		long tempoF=depois-antes;
		
		return tempoF ;
	}
	 private static void randomQuickSort(int[] numeros, int esquerda, int direita) {
	        if (esquerda < direita) {
	            int pivoIndice = randomizedPartition(numeros, esquerda, direita);
	            randomQuickSort(numeros, esquerda, pivoIndice- 1);
	            randomQuickSort(numeros,pivoIndice + 1, direita);
	        }
	    }

	    private static int randomizedPartition(int[] numeros, int esquerda, int direita) {
	        int indiceAleatorio = getRandomIndex(esquerda, direita);
	        troca(numeros, indiceAleatorio, direita);
	        return partition(numeros, esquerda, direita);
	    }

	    private static int partition(int[] numeros, int esquerda, int direita) {
	        int pivot = numeros[direita];
	        int i = esquerda - 1;

	        for (int j = esquerda; j < direita; j++) {
	            if (numeros[j] <= pivot) {
	                i++;
	                troca(numeros, i, j);
	            }
	        }

	        troca(numeros, i + 1, direita);
	        return i + 1;
	    }

	    private static int getRandomIndex(int esquerda, int direita) {
	        Random random = new Random();
	        return random.nextInt(direita - esquerda + 1) + esquerda;
	    }

	

	@Override
	public long quickSort_Java(int[] numeros) {
		long antes = System.nanoTime();
		
		Arrays.sort(numeros);
		
		long depois = System.nanoTime();
		long tempoF=depois-antes;
		
		return tempoF ;
	}

	@Override
	public long countingSort(int[] numeros) {
		long antes = System.nanoTime();
		if (numeros == null || numeros.length <= 1) {
			long depois = System.nanoTime();
			long tempoF=depois-antes;
			
			return tempoF;
        }
		 
		
		

        int max = findMax(numeros);
        int min = findMin(numeros);

        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[numeros.length];

        
        for (int i = 0; i < numeros.length; i++) {
            count[numeros[i] - min]++;
        }

      
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

      
        for (int i = numeros.length - 1; i >= 0; i--) {
            output[count[numeros[i] - min] - 1] = numeros[i];
            count[numeros[i] - min]--;
        }

       
        System.arraycopy(output, 0, numeros, 0, numeros.length);
        long depois = System.nanoTime();
		long tempoF=depois-antes;
		
		return tempoF ;
		
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

	

}
