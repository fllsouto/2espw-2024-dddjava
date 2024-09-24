package br.com.fiap.twoespw.libuncleotidio;

public class NucleotidioCounter {
    
    public String count(String entrada) {
        System.out.println("\n\n----------------------------");
        System.out.println("\n\n\n:: Lib Uncle Otidio ::");
        
        int frequenciaA = 0;
        int frequenciaC = 0;
        int frequenciaT = 0;
        int frequenciaG = 0;
        
        String[] entradaSplitada = entrada.split("");
        
        for(int i = 0; i <= entradaSplitada.length - 1; i++) {
            // System.out.println("[i] = [" + i + "]");
            String caracter = entradaSplitada[i];
            // System.out.println("caracter: " + caracter);
            
            if (caracter.equals("A")) {
                frequenciaA = frequenciaA + 1; 
            }            
            
            if (caracter.equals("C")) {
                frequenciaC = frequenciaC + 1; 
            }            

            if (caracter.equals("T")) {
                frequenciaT = frequenciaT + 1; 
            }            
            
            if (caracter.equals("G")) {
                frequenciaG = frequenciaG + 1; 
            }
        }
        
        System.out.println("Sequência :: " + entrada);
        System.out.println("Tamanho da Sequência :: " + entrada.length());
        System.out.println("Total de A :: " + frequenciaA);
        System.out.println("Total de C :: " + frequenciaC);
        System.out.println("Total de T :: " + frequenciaT);
        System.out.println("Total de G :: " + frequenciaG);
        System.out.println("\n\n----------------------------");


        String output = "";
        output = output.concat("Sequence " + entrada + "\n");
        output = output.concat("Sequence Size: " + entrada.length() + "\n");
        output = output.concat("A: " + frequenciaA + "\n");
        output = output.concat("C: " + frequenciaC + "\n");
        output = output.concat("T: " + frequenciaT + "\n");
        output = output.concat("G: " + frequenciaG + "\n");

        return output;
    }
}
