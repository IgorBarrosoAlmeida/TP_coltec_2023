package AULA02;

import java.util.Scanner;

public class CorridaDeSapos {
    // Atributos
    private int numSapos;

    // Getters

    public int getNumSapos() {
        return numSapos;
    }

    // Setters
    public void setNumSapos(int numSapos) {
        this.numSapos = numSapos;
    }

    // Métodos
    public void correr(Sapo[] sapos) {
        for (int i = 0; i < this.numSapos; i++) {
            sapos[i].start();
        }
    }

    public void criaCorrida(int numSapos, double distanciaCorrida) {
        this.setNumSapos(numSapos);

        Sapo[] sapos = new Sapo[this.numSapos];
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < this.numSapos; i++) {
            sapos[i] = new Sapo();
            sapos[i].setDistanciaTotal(distanciaCorrida);

            System.out.println("Sapo " + (i + 1));
            System.out.print("Nome: ");
            sapos[i].setNome(read.next());
            System.out.print("Distancia pulo: ");
            sapos[i].setDistanciaPulo((double) (read.nextDouble()));
        }

        correr(sapos);
    }

    public CorridaDeSapos(int numSapos, double distanciaCorrida) {
        this.criaCorrida(numSapos, distanciaCorrida);
    }
}
