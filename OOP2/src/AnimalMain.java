import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        for (int i = 0; i < animals.size() + 1; i++) {
            
            System.out.println("Enter name of animal:");
            String inputAnimal = scanner.nextLine();
            System.out.println("Is it a dog? true/false");
            Boolean inputIsDog = scanner.nextBoolean();
            animals.add(new Animal(inputAnimal, inputIsDog));
            
            System.out.println("keep going? yes/no");
            String fixABug = scanner.nextLine();
            String keepGoing = scanner.nextLine();
            
            if (keepGoing.equals("no")) {
                for (Animal Animal : animals) {
                    System.out.println(Animal.toString());
                }
                break;
            }
        }
    }
}
