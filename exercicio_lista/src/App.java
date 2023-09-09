import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Employee emp;
        Locale.setDefault(Locale.US);

        System.out.print("How many employees will be registered? : ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            System.out.println("Employee #" + i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            
            while(hasID(employees, id)) { //enquanto o usuário digitar id's que são iguais
                System.out.print("The ID is already taken! Enter another ID: ");
                id = sc.nextInt();
            }
            
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            emp = new Employee(name, id, salary);
            employees.add(emp);

            System.out.println();
        }

        System.out.println("Enter the employee id that will have the salary increased: ");
        int idIncrease = sc.nextInt();
        int verifiedIDPosition = findIDForIncrease(employees, idIncrease);

        while(verifiedIDPosition == -1) {
            System.out.println("ID not found! Enter another ID: ");
            idIncrease = sc.nextInt();
            verifiedIDPosition = findIDForIncrease(employees, idIncrease);
        }
        System.out.println("Enter the percentage: ");
        int percentage = sc.nextInt();
        employees.get(verifiedIDPosition).increaseSalary(percentage);


        System.out.println("List of employees> ");
        for(Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }

    public static int findIDForIncrease(List<Employee> list, int id) {
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return -1; //elemento não encontrado
    }

    public static boolean hasID(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); //expressão lamba
        //filtra os id's que são iguais ao getId(), pega o primeiro ou retorna nulo
        return emp != null; //retorna se o funcionário é ou não diferente de nulo (true or false)
    }
}
