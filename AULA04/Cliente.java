package AULA04;

/* importações */
import java.io.*;
import java.net.*;
import java.util.*;

public class Cliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        int porta = 12345;

        // Cria a socket
        Socket cliente = new Socket("127.0.0.1", porta);
        System.out.println("------ Cliente conetado ao servidor ------");

        // Comunicação com o servidor
        Scanner read = new Scanner(System.in);
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        while (read.hasNextLine()) {
            saida.println(read.nextLine());
        }

        // Fecha as ferramentas usadas
        saida.close();
        read.close();
        cliente.close();
    }

}