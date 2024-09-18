package br.com.fiap.twoespw.libuncleotidio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //String entrada = "ACTGACTGACTGACTG";

        NucleotidioCounter nc = new NucleotidioCounter();
        //nc.count(entrada);

        try {
            InputStream is = new FileInputStream("entradas/entrada1.txt");
            InputStreamReader isr =  new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            String linha = reader.readLine();
            while (linha != null) {
                nc.count(linha);
                linha = reader.readLine();

            }
            reader.close();
            
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Arquivo não encontrado " + e);
        } catch (IOException ioe) {
            System.out.println("Linha mal formatada " + ioe);
        }


    }
}
