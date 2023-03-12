package AULA03;

public class Produtor extends Thread {
    // Atributos
    private PilhaSincronizada pilha;

    // Construtor
    public Produtor(PilhaSincronizada pilha) {
        this.pilha = pilha;
    }

    // Métodos
    public void run() {
        int colorIdx;
        for (int i = 0; i < 40; i++) {

            colorIdx = (int) (Math.random() * 1000);
            pilha.push(colorIdx);

            System.out.println("Criado : " + colorIdx);

            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }

        }
    }

}