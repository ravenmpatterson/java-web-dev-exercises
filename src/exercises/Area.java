package exercises;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle in inches?");
        Double numLength = input.nextDouble();

        System.out.println("What is the width of the rectangle in inches?");
        Double numWidth = input.nextDouble();

        Double area = numLength * numWidth;
        System.out.println("The area of the rectangle equals " + area + " inches");
    }
}
