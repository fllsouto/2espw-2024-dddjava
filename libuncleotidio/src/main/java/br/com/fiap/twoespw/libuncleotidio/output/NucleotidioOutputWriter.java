package br.com.fiap.twoespw.libuncleotidio.output;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class NucleotidioOutputWriter {
    
    public void writeWithFileOutputStream(String filename, String output) {
        System.out.println("Writing output on filename: " + filename);
        System.out.println("Content:\n");
        System.out.println(output);
        
        OutputStream os;
        try {
            os = new FileOutputStream(filename);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter writer = new BufferedWriter(osw);
            writer.write(output);
            writer.close();
        } catch (FileNotFoundException fnfe) {
            // TODO Auto-generated catch block
            System.out.println("Arquivo não encontrado " + fnfe);
        }  catch (IOException ioe) {
            System.out.println("Linha mal formatada " + ioe);
        }

    }

    public void writeWithPrintStream(String filename, String output) {
        System.out.println("Writing output on filename: " + filename);
        System.out.println("Content:\n");
        System.out.println(output);
        
        PrintStream out;
        try {
            out = new PrintStream(filename);
            out.println(output);
            out.close();
        } catch (FileNotFoundException fnfe) {
            // TODO Auto-generated catch block
            System.out.println("Arquivo não encontrado " + fnfe);
        }
    }
}
