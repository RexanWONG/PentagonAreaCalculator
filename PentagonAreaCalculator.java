import java.util.Scanner;
public class PentagonAreaCalculator {
        public static void main(String[] args) {

            //create scanner object for user input
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the length form the center to a vertex : ");
            double center_vertex_length = input.nextDouble();

            //We would need to know the side length of the pentagon first.  It can be calculated like this:
            double pentagon_side_length = ((2 * center_vertex_length) * Math.sin(Math.PI / 5));

            //Formula for calculating the area of pentagon
            double area_pentagon = ((5 * pentagon_side_length * pentagon_side_length) / (4 * Math.tan(Math.PI / 5)));

            System.out.println("The area of the pentagon is " + area_pentagon);

        }
}




