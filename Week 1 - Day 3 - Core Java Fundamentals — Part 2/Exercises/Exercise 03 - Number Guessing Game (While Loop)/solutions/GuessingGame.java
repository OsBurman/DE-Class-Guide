public class GuessingGame {
    public static void main(String[] args) {
        // Generate random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        int guessCount = 0;

        // Process each guess
        for (String arg : args) {
            int guess = Integer.parseInt(arg);
            guessCount++;

            System.out.print("Guess " + guessCount + ": " + guess + " - ");

            if (guess == randomNumber) {
                System.out.println("Correct!");
                System.out.println("You guessed it in " + guessCount + " tries!");
                break;
            } else if (guess > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
    }
}
