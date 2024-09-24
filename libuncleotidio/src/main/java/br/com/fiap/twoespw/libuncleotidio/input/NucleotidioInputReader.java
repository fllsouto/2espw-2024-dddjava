package br.com.fiap.twoespw.libuncleotidio.input;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class NucleotidioInputReader {
    
    public List<String> readWithFileInputStream(String filename) {
        List<String> lines = new ArrayList<String>();

        try {
            InputStream is = new FileInputStream(filename);
            InputStreamReader isr =  new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();

            while (line != null) {
                line = reader.readLine();
                lines.add(line);
            }
            reader.close();

            return lines;
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("Arquivo não encontrado " + fnfe);
            return lines;
        } catch (IOException ioe) {
            System.out.println("Linha mal formatada " + ioe);
            return lines;
        }
    }

    public List<String> readWithScanner(String filename) {
        List<String> lines = new ArrayList<String>();

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }

            scanner.close();
            return lines;
        } catch (FileNotFoundException fnfe) {
            System.out.println("Arquivo não encontrado " + fnfe);
            return lines;
        }
    }

    public String readFromKeyboard() {
        InputStream systemIn = System.in;
        Scanner scanner = new Scanner(systemIn);
        System.out.println("Please Insert a valid Nucleotidio Sequence: ");
        String line = scanner.nextLine();
        scanner.close();
        return line;
    }
}
