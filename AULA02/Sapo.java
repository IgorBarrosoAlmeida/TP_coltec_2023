package AULA02;

public class Sapo extends Thread {
    // Atributos
    private String nome;
    private double distanciaPercorrida = 0.0;
    private double distanciaPulo = 1.0;
    private double distanciaTotal = 100.0;

    // Getters
    public String getNome() {
        return nome;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public double getDistanciaPulo() {
        return distanciaPulo;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDistanciaPulo(double distanciaPulo) {
        this.distanciaPulo = distanciaPulo;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    // Métodos
    public void run() {
        while (this.distanciaPercorrida < distanciaTotal) {
            System.out.println(this.nome + " correu " + this.getDistanciaPercorrida() + "cm");
            this.distanciaPercorrida += this.distanciaPulo;
        }
        System.out.println("------ " + this.nome + " Chegou ------");
    }
}
