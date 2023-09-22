package usando_scanner;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("G:\\Java - Nelio Alves\\trabalhando_com_arquivos\\in.txt");
        Scanner sc = null;

        try { 
            //precisa ser dentro de um bloco try, pois ao declarar o Scanner, ele pode tentar abrir o arquivo e gerar uma exceção
            sc = new Scanner(file);
            while(sc.hasNextLine()) { //se ainda possui uma linha para ler no arquivo
                System.out.println(sc.nextLine());
            }
        } 
        catch(IOException e) {
            System.out.println("ERROR! Impossible access the file: " + e.getMessage());
        }
        finally {
            if(sc != null) {
                sc.close(); //boa prática
            }
        }
    }
}
