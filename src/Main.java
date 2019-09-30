import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // (1) Declaration
        double inputTemp;
        double maxTemp = 0.0; // So far the maximum temperature ...

        int sentinel = 1;

        Scanner in = new Scanner(System.in);


        // (2) Getting validating input TODO split this into input and (3) processing/computing

        while (true)  // TODO set another limit
        {
            System.out.println("Input a temperature, to stop write 0");
            inputTemp = in.nextDouble();
            sentinel = (int) inputTemp;
            if (sentinel==0){
                // get out of the loop please!!!!
                break;
            }
            System.out.println("inputTemp is "+inputTemp);

        }

        // (4) Presenting output

        System.out.printf("The highest temperature among these 12 was: %.2f ", maxTemp);
    }
}
