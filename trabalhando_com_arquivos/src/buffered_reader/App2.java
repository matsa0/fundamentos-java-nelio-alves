package buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) {
        String path = "G:\\Java - Nelio Alves\\trabalhando_com_arquivos\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;
        /*
         * ***O BufferedReader*** é uma classe que fornece uma maneira mais eficiente de ler um arquivo de texto, especialmente 
         * quando você está lendo grandes quantidades de dados. Ele armazena os dados em um buffer (uma área de memória temporária) 
         * e lê os caracteres em blocos, em vez de ler um byte por vez. Isso reduz o número de operações de leitura física, 
         * tornando a leitura mais eficiente.
        */
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); //O BufferedReader deixa o acesso mais rápido?

            String line = br.readLine(); //Lê as linhas e retorna null quando acaba

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if(br != null) {
                  br.close();
                }
                if(fr != null) {
                    fr.close();
                }
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
