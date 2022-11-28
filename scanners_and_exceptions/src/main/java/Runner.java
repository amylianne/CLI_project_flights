import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int secretNumber = random.nextInt(1, 101);
//cont running until correct ans
        boolean running = true;

        while (running) {

            System.out.println("Guess a number between 1 and 100");
            int userGuess = 0;
                    //scanner.nextInt();  ///user input

            try {
                userGuess = scanner.nextInt();
            }
            catch (InputMismatchException exception){
                System.out.println("Write an integer");
                continue;
            }

            if (secretNumber == userGuess) {
                System.out.println("correct");
//            } if (userGuess(int)){
//                System.out.println("write a integer number");
            } else if (secretNumber < userGuess) {
                System.out.println("too high");
            } else {
                System.out.println("too low");
            }

        }
    }
}
