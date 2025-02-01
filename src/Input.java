import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Get and store user's name
        System.out.print("\nEnter your full name: ");
        String name = scanner.nextLine();

        //Get and store user's age
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        //Get user's weight in kilograms(kg)
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        //true or false for being a smoker
        System.out.print("Are you a smoker (True/False): ");
        boolean isSmoker = scanner.nextBoolean();

        //user information
        System.out.println("\n---Medical Information---");
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Smoker: " + isSmoker + '\n');
        scanner.close();
    }
}
    /* examples
        nextBoolean()	Reads a boolean value from the user
        nextByte()	Reads a byte value from the user
        nextDouble()	Reads a double value from the user
        nextFloat()	Reads a float value from the user
        nextInt()	Reads an int value from the user
        nextLine()	Reads a String value from the user
        nextShort()	Reads a short value from the user
        */