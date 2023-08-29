public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "   Matheus Souza Azevedo   ";
        String s2 = s1.trim();
        String vect[] = s2.split(" "); //split recorta uma string de acordo com o separador determinado, nesse caso " " (espaço)

        System.out.println("trim - " + s1.trim()); //Remove espaços das laterais
        System.out.println("replace('e', 3) - " + s2.replace('e', '3')); //Substitui um caracter por outro caracter determinado
        System.out.println("substring(14, 21) - " + s2.substring(14, 21)); //cria uma substring a partir de um índice de início e finaç
        
        System.out.println();

        System.out.println("Nome > " + vect[0]);
        System.out.println("Sobrenome 1 > " + vect[1]);
        System.out.println("Sobrenome 2 > " + vect[2]);
    }
}
