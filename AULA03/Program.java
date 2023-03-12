package AULA03;

public class Program {
    public static void implementaProdutorConsumidor() {
        Trabalhador t1 = new Trabalhador("Pizza", 100);
        Trabalhador t2 = new Trabalhador("Hamburguer", 75);
        t1.start();
        t2.start();

        t1.parar(10000000);
        t2.parar(10000);
    }

    public static void implementaTrabalhador() {
        PilhaSincronizada pilha = new PilhaSincronizada();
        Produtor p1 = new Produtor(pilha);
        Produtor p2 = new Produtor(pilha);
        Consumidor c1 = new Consumidor(pilha);
        Consumidor c2 = new Consumidor(pilha);

        p1.start();
        c1.start();
        c2.start();
    }

    public static void main(String[] args) {
        // implementaProdutorConsumidor();
        implementaTrabalhador();
    }
}
