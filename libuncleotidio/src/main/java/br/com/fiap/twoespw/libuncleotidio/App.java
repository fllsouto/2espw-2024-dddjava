package br.com.fiap.twoespw.libuncleotidio;

import java.util.List;
import java.util.Random;

import br.com.fiap.twoespw.libuncleotidio.input.NucleotidioInputReader;
import br.com.fiap.twoespw.libuncleotidio.output.NucleotidioOutputWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Random randomGenerator = new Random();
        int variavelRandomica =  Math.abs(randomGenerator.nextInt());

        // Desafio: Colocar a DATA e HORA da execução em vez de um inteiro randômico

        //String entrada = "ACTGACTGACTGACTG";
        String inputFilename = "entradas/entrada1.txt";
        String outputFilename = "saidas/saida-" + variavelRandomica + ".txt";
        NucleotidioCounter nc = new NucleotidioCounter();
        NucleotidioInputReader nir = new NucleotidioInputReader();
        NucleotidioOutputWriter now = new NucleotidioOutputWriter();

        //List<String> lines = nir.readWithFileInputStream(filename);
        List<String> lines = nir.readWithScanner(inputFilename);

        // Enhanced For: https://www.programiz.com/java-programming/enhanced-for-loop
        // for (String line : lines) {
        //     nc.count(line);
        // }
        String line = nir.readFromKeyboard();
        String output = nc.count(line);

        //now.writeWithFileOutputStream(outputFilename, output);
        now.writeWithPrintStream(outputFilename, output);
    }
}
