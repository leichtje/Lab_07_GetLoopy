import java.util.Scanner;

public class CToFConverter {
    public static void main(String[] args) {

        double degreesFahrenheit;
        double degreesCelsius;
        String trash;
        Boolean correct = false;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("What is the temperature in Celsius?");
            if (in.hasNextDouble()) {
                correct=true;
                degreesCelsius = in.nextDouble();
                degreesFahrenheit = degreesCelsius * 1.8 + 32;
                System.out.printf("The temperature in fahrenheit is:%.2f ", degreesFahrenheit);
            } else {
                trash = in.nextLine();
                System.out.println("You have inputted an invalid temperature: " + trash + " Please try again");
            }
        }while(!correct);
    }
}
