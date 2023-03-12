package AULA03;

public class Trabalhador extends Thread {
    // Atributos
    private String produto;
    private int tempo;
    private Boolean flag;

    // Construtor
    public Trabalhador(String produto, int tempo) {
        this.tempo = tempo;
        this.produto = produto;
        this.flag = false;
    }

    // Métodos
    public void run() {
        int i = 1;
        while (this.flag == false) {
            System.out.println(i + " " + this.produto);

            try {
                sleep((long) (Math.random() * this.tempo));

            } catch (InterruptedException e) {
            }

            i++;
        }
        System.out.println("Terminei " + this.produto);
        this.flag = false;
    }

    public void parar(int tempo) {
        /* Define em quanto tempo vai parar de trabalhar */
        try {
            sleep((long) (Math.random() * this.tempo));

        } catch (InterruptedException e) {
        }
        this.flag = true;
    }
}
