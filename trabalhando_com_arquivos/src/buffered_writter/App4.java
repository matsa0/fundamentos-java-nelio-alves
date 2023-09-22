package buffered_writter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App4 {
    public static void main(String[] args) {
        String lines[] = new String[] {"Good afternoon", "Good evening", "and", "Good night", "Testin writting in files!"};
        String path = "G:\\Java - Nelio Alves\\trabalhando_com_arquivos\\out.txt"; //arquivo para criar
    
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) { //se adicionar o parâmetro true, invés de recriar o arquivo, a cada execução ele adiciona novamente
            for(String line : lines) {
                bw.write(line);
                bw.newLine(); //quebra de linha
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
