public class HeapSort {
    
    // Método que ordena um vetor de inteiros usando o Heap Sort
    public static void sort(int[] vetor) {
        int tamanho = vetor.length;
        int i = tamanho / 2, pai, filho, t;

        // Loop principal que continua até que o vetor esteja ordenado
        while (true) {
            // Se 'i' é maior que 0, significa que ainda temos elementos para processar
            if (i > 0) {
                i--; // Decrementa 'i' para processar o próximo elemento
                t = vetor[i]; // Armazena o valor do elemento atual em 't'
            } else {
                // Se 'i' é 0, significa que precisamos mover o maior elemento para o final do vetor
                tamanho--; // Reduz o tamanho do vetor
                // Se o tamanho é menor ou igual a 0, terminamos a ordenação
                if (tamanho <= 0) {
                    return; // Sai do método
                }
                // Armazena o último elemento do vetor em 't' e o substitui pelo primeiro elemento
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            // Inicializa 'pai' e 'filho' para a reestruturação do heap
            pai = i;
            filho = (i * 2) + 1; // Calcula o índice do filho esquerdo

            // Loop para reestruturar o heap
            while (filho < tamanho) {
                // Verifica se o filho direito existe e é maior que o filho esquerdo
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {
                    filho++; // Move para o filho direito
                }
                // Se o filho maior é maior que 't', movemos o pai para baixo
                if (vetor[filho] > t) {
                    vetor[pai] = vetor[filho]; // Move o filho para a posição do pai
                    pai = filho; // Atualiza o pai para o filho
                    filho = pai * 2 + 1; // Calcula o novo índice do filho
                } else {
                    break; // Se não, sai do loop
                }
            }
            // Coloca o valor original de 't' na posição correta
            vetor[pai] = t;
        }
    }

public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 4, 2, 7, 1, 6};
 
        System.out.println("Vetor antes da ordenação:");
        exibirVetor(vetor);
 
        sort(vetor);
 
        System.out.println("Vetor depois da ordenação:");
        exibirVetor(vetor);
    }
}
