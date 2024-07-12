package queue.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {

    public static void main(String[] args) {
        exemplosFilaArrayDeque();
    }

    private static void exemplosFilaArrayDeque() {
        // Criando uma ArrayDeque de Strings
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adicionar elementos no início e no final da deque
        deque.addFirst("Primeiro");
        deque.offerFirst("Segundo");
        deque.addLast("Terceiro");
        deque.offerLast("Quarto");

        // Imprimir a deque
        System.out.println("Deque depois de adicionar elementos: " + deque);

        // Remover e retornar elementos do início e do final da deque
        String primeiroRemovido = deque.removeFirst();
        String ultimoRemovido = deque.removeLast();

        // Imprimir elementos removidos
        System.out.println("Elemento removido do início: " + primeiroRemovido);
        System.out.println("Elemento removido do final: " + ultimoRemovido);

        // Acessar elementos do início e do final da deque sem removê-los
        String primeiroSemRemover = deque.getFirst();
        String ultimoSemRemover = deque.getLast();

        // Imprimir elementos acessados
        System.out.println("Primeiro elemento (sem remover): " + primeiroSemRemover);
        System.out.println("Último elemento (sem remover): " + ultimoSemRemover);

        // Verificar o tamanho da deque e se está vazia
        System.out.println("Tamanho da deque: " + deque.size());
        System.out.println("A deque está vazia? " + deque.isEmpty());

        // Verificar se a deque contém um elemento específico
        boolean contemElemento = deque.contains("Primeiro");
        System.out.println("A deque contém 'Primeiro'? " + contemElemento);

        // Remover todos os elementos da deque
        deque.clear();
        System.out.println("Deque após limpar: " + deque);

        // Converter a deque para um array
        String[] arrayDeque = deque.toArray(new String[0]);
        System.out.println("Array convertido da deque: ");
        for (String elemento : arrayDeque) {
            System.out.println(elemento);
        }
    }
}
