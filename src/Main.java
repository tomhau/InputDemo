import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // (1) Declaration
        double inputTemp;
        double maxTemp = -100; // So far the maximum temperature ...


        int count = 1;  // counting in the loop
        Scanner in = new Scanner(System.in);


        // (2) Getting validating input TODO split this into input and (3) processing/computing
        System.out.println("Input a temperature");
        inputTemp = in.nextDouble();
        System.out.println("inputTemp is "+inputTemp);

        while (count < 1)  // TODO set another limit
        {
            // TODO process the temperatures etc...
        }

        // (4) Presenting output

        System.out.printf("The highest temperature among these 12 was: %.2f ", maxTemp);
    }
}
