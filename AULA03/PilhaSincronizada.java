package AULA03;

public class PilhaSincronizada {
    // Atributos
    private int[] buffer = null;
    private int index = 0;
    private int TAMANHO_MAX = 50;

    // Métodos Sincronizados
    public synchronized int pop() {
        while (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        this.notify();

        /* Muda o tamanho da pilha */
        int retorno = this.buffer[index];
        int[] aux = new int[this.buffer.length - 1];

        for (int i = 0; i < aux.length; i++) {
            aux[i] = this.buffer[i];
        }
        this.buffer = aux;

        index--;
        return retorno;
    }

    public synchronized void push(int num) {
        while (index == TAMANHO_MAX) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        this.notify();

        /* Muda tamanho da pilha ou cria ela */
        if (this.buffer == null) {
            this.buffer = new int[1];
        } else {
            int[] aux = new int[this.buffer.length + 1];

            /* Copia os elementos para o novo array */
            for (int i = 0; i < this.buffer.length; i++) {
                aux[i] = this.buffer[i];
            }

            this.buffer = aux;
        }

        this.buffer[index] = num;
        this.index++;
    }
}
