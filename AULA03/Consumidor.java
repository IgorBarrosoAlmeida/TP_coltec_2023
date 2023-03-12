package AULA03;

public class Consumidor extends Thread {
    // Atributos
    private PilhaSincronizada pilha;

    // Construtor
    public Consumidor(PilhaSincronizada pilha) {
        this.pilha = pilha;
    }

    // Métodos
    public void run() {
        int colorIdx;

        for (int i = 0; i < 20; i++) {
            colorIdx = pilha.pop();

            System.out.println("Usado : " + colorIdx);

            try {
                sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
            }

        }
    }
}