import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Rent[] rooms = new Rent[10];
        int room;

        System.out.println("How many rooms will be rented? : ");
        int qntRooms = sc.nextInt();

        for(int i=0; i<qntRooms; i++) {
            System.out.printf("\nRent #%d\n", i);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("E-mail: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            room = sc.nextInt();
            if(rooms[room] == null) {
                rooms[room] = new Rent(name, email);
            }   
            else {
                System.out.println("The chosen room is already occupied.");
                System.out.println("Room: ");
                room = sc.nextInt();
                rooms[room] = new Rent(name, email);
            }
        }

        System.out.println("***Busy Rooms***");
        for(int i=0; i<rooms.length; i++) {
            if(rooms[i] != null) {               
                System.out.println(i + ": " + rooms[i]);

            }
        }

        sc.close();
    }
}
