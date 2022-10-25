// Nome: Sergio Alexandre A. de Almeida  - RA: 2346591

package Java.exercicios.lista4;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {

    public String entDados(String parametro) {

        System.out.println(parametro);
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String ret = "";

        try {
            ret = buff.readLine();
        } catch (IOException ioe) {
            System.out.println("\nERRO de sistema: RAM - TECLADO");
        }

        return ret;
    }
}
