import java.util.Scanner;
public class CalculatoDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c1 = new Calculator();

        System.out.println("Did you create an account? (Y/N): ");
        char y = sc.next().charAt(0);
        sc.nextLine(); // consume newline

        if (!yesNo(y)) {
            System.out.println("Create your Account:");
            System.out.print("Create your username: ");
            c1.userName = sc.nextLine();

            System.out.print("Create your password: ");
            c1.password = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.println("Congratulations! Your account is created successfully.");
        }

        System.out.println("Login to your account:");

        System.out.print("Enter your username: ");
        String userName = sc.nextLine();

        System.out.print("Enter your password: ");
        int password = sc.nextInt();

        if (userName.equals(c1.userName) && password == c1.password) {
            System.out.println("You are logged in successfully!");

            while (true) {
                System.out.println("\n------- WELCOME -------");
                System.out.println("Choose an option:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Modulus");
                System.out.println("6. Exit");

                int op = sc.nextInt();

                if (op == 6) {
                    System.out.println("Thank you for using Calculator.");
                    break;
                }

                System.out.print("Enter first value: ");
                int a = sc.nextInt();
                System.out.print("Enter second value: ");
                int b = sc.nextInt();

                switch (op) {
                    case 1:
                        c1.addition(a, b);
                        break;
                    case 2:
                        c1.subtraction(a, b);
                        break;
                    case 3:
                        c1.multiplication(a, b);
                        break;
                   /* case 4:
                        c1.division(a, b);
                        break; */
                    case 5:
                        c1.mod(a, b);
                        break;
                    default:
                        System.out.println("Invalid Option!");
                }
            }

        } else {
            System.out.println("Invalid credentials!");
        }

        sc.close();
    }

    public static boolean yesNo(char yes) {
        return yes == 'Y' || yes == 'y';
    }
}
