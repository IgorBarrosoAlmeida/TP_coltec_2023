package AULA04;

/* importações */
import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {
    public static void main(String[] args) throws IOException {
        int porta = 12345;

        // Cria a servidor com a porta 12345
        ServerSocket servidor = new ServerSocket(porta);
        System.out.println("------ Porta 12345 aberta ------");

        // Estabelece a conexão com o cliente
        Socket cliente = servidor.accept();
        System.out.println(" Conexão estabelecida com o cliente: " + cliente.getInetAddress().getHostAddress());

        Scanner scan = new Scanner(cliente.getInputStream());
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

        // Fecha as ferramentas usadas
        scan.close();
        servidor.close();
        cliente.close();
    }
}