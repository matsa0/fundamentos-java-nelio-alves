package try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App3 {
    public static void main(String[] args) {
        String path = "G:\\Java - Nelio Alves\\trabalhando_com_arquivos\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}

