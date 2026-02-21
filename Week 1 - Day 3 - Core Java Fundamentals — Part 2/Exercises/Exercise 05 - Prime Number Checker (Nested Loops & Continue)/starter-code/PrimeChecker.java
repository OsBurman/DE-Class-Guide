public class PrimeChecker {
    public static void main(String[] args) {
        // TODO: Parse the number from command line
        int n = 0; // REPLACE THIS

        // TODO: Handle edge case: if n < 2, print "X is not prime"
        if (n < 2) {
            System.out.println(n + " is not prime");
            return;
        }

        // TODO: Use a loop to find divisors
        // TODO: Loop from 2 to sqrt(n)
        // TODO: For each i, check if n % i == 0
        // TODO: If divisible, print "X is not prime" and divisor, then return
        // TODO: If loop completes without finding divisor, print "X is prime"

        System.out.println(n + " is prime");
    }
}
