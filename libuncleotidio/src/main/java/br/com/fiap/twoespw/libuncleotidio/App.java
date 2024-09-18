package br.com.fiap.twoespw.libuncleotidio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String entrada = "ACTGACTGACTGACTG";

        NucleotidioCounter nc = new NucleotidioCounter();

        nc.count(entrada);
    }
}
