package br.com.fiap.twoespw.libuncleotidio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(":: Lib Uncle Otidio ::");
        String entrada = "ACGTACGT";

        String[] entradaSplitada = entrada.split("");
        
        for(int i = 0; i <= entradaSplitada.length; i++) {
            System.out.println("[i] = [" + i + "]");
            String caracter = entradaSplitada[i];
            System.out.println("caracter: " + caracter);
        }
    }
}
