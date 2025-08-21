public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {15, 8, 12, 7, 10};

        System.out.println("Vetor Sem Ordenação: ");
        imprimir(vetor);
        
        bubbleSort(vetor, 5);
        
        System.out.println("Vetor Ordenado");
        imprimir(vetor);
    }

    public static void bubbleSort(int[] vetor, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca(vetor, j, j + 1);
                }
            }
        }
    }

    public static void troca(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
  
    public static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
