package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List <Product> list = new ArrayList<>();

        System.out.println("Enter a .csv file path: ");
        String path = sc.nextLine();

        File csvFile = new File(path);

        String sourceFolderStr = csvFile.getParent(); //pega o caminho arquivo sem o nome dele
        boolean success = new File(sourceFolderStr + "\\out").mkdir(); //cria a pasta out
        String outputFile = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String item = br.readLine();

            while(item != null) {
                String fields[] = item.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]); //converte String par double
                int quantity = Integer.parseInt(fields[2].trim()); //converte String para int

                list.add(new Product(name, price, quantity));
                item = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                for(Product i : list) {
                    bw.write(i.getName() + ", " + String.format("%.2f", i.total()));
                    bw.newLine();
                    System.out.println(i);
                }
            }
            catch(IOException e) {
                System.out.println("Error writting file: " + e.getMessage());
            }
        }
        catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
       
    } 
}
