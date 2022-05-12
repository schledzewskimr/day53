import java.util.Scanner;
public class CounterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to begin");
        int value = scanner.nextInt();
        Counter counter1 = new Counter(value);
        Counter counter2 = new Counter();

        System.out.println("Your counter: "+counter1.value());
        System.out.println("Computer counter: " + counter2.value());
        while (true) {
            System.out.println("To increase by one press 1");
            System.out.println("To increase by an amount press 2");
            System.out.println("To decrease by one press 3");
            System.out.println("To decrease by an amount press 4");
            System.out.println("To get value press 0");
            int choice = scanner.nextInt();
            if (choice == 1) {
                counter1.increase();
                counter2.increase();
            }
            if (choice == 2) {
                System.out.println("Enter specified amount:");
                int increaseAmount = scanner.nextInt();
                counter1.increase(increaseAmount);
                counter2.increase(increaseAmount);
            }
            if (choice == 3) {
                counter1.decrease();
                counter2.decrease();
            }
            if (choice == 4) {
                System.out.println("Enter specified amount:");
                int decreaseAmount = scanner.nextInt();
                counter1.decrease(decreaseAmount);
                counter2.decrease(decreaseAmount);
            }
            if (choice == 0) {
                System.out.println("Your counter: " + counter1.value());
                System.out.println("Computer counter: " + counter2.value());
            }
        }
    }
}
