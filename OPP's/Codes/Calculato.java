class Calculato {
    String userName;
    int password;

    public void addition(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Result: " + (a - b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Result: " + (a * b));
    }

    public void division(int a, int b) {
        if (b != 0)
            System.out.println("Result: " + (a / b));
        else
            System.out.println("Error: Division by zero!");
    }

    public void mod(int a, int b) {
        if (b != 0)
            System.out.println("Result: " + (a % b));
        else
            System.out.println("Error: Modulus by zero!");
    }
}