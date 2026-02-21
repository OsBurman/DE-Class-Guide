public class PrimeChecker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Edge case: numbers less than 2 are not prime
        if (n < 2) {
            System.out.println(n + " is not prime");
            return;
        }

        // Check for divisors from 2 to sqrt(n)
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                // Found a divisor - not prime
                System.out.println(n + " is not prime");
                System.out.println("Smallest divisor: " + i);
                return;
            }
        }

        // No divisors found - it's prime
        System.out.println(n + " is prime");
    }
}
