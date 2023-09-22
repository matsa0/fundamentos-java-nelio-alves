package manipulando_arquivos_e_pastas;

import java.io.File;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter a folder path: ");
            String path = sc.nextLine();
    
            File fPath = new File(path);
    
            System.out.println("< Folders >");
            File[] folders = fPath.listFiles(File::isDirectory);
            for(File folder : folders) {
                System.out.println(folder);
            }
    
            System.out.println("\n< Files >");
            File[] files = fPath.listFiles(File::isFile);
            for(File file : files) {
                System.out.println(file);
            }
        }
        catch(NullPointerException e) {
            System.out.println("Error! Invalid path: " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error! : " +e.getMessage());
        }
        finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}
