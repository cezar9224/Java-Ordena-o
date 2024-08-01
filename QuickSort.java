
public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = { 12, 4, 15, 28, 20, 6, 7, 10, 2, 1, 13 };
        quickSort(vetor, 0, vetor.length - 1);
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int posPivot = partition(vetor, esquerda, direita);
            quickSort(vetor, esquerda, posPivot);
            quickSort(vetor, posPivot + 1, direita);
        }
    }

    public static int partition(int[] vetor, int esquerda, int direita) {
        int pivot = vetor[esquerda];
        while (true) {
            while (vetor[esquerda] < pivot) {
                esquerda++;
            }
            while (vetor[direita] > pivot) {
                direita--;
            }
            if (esquerda >= direita) {
                return direita;
            }
            int temp = vetor[esquerda];
            vetor[esquerda] = vetor[direita];
            vetor[direita] = temp;
            
            //Testanado atualizações no GitHub
        }
    }
}
