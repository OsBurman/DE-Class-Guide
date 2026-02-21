public class SwitchStatementDemo {

    // Example 1: Basic switch statement
    public static void getDayName(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    // Example 2: Switch with String
    public static void getCountryCapital(String country) {
        switch (country) {
            case "USA":
                System.out.println("Capital: Washington, D.C.");
                break;
            case "France":
                System.out.println("Capital: Paris");
                break;
            case "Japan":
                System.out.println("Capital: Tokyo");
                break;
            case "Brazil":
                System.out.println("Capital: Brasília");
                break;
            default:
                System.out.println("Country not found");
        }
    }

    // Example 3: Switch with fall-through (grouping cases)
    public static void categorizeVowel(char letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a vowel");
                break;
            case 'y':
                System.out.println(letter + " is sometimes a vowel");
                break;
            default:
                System.out.println(letter + " is a consonant");
        }
    }

    // Example 4: Switch with numbers (season by month)
    public static void getSeason(int month) {
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
        }
        System.out.println("Month " + month + " is " + season);
    }

    // Example 5: Switch expression (Java 14+) - more concise
    public static String getStatusMessage(int code) {
        return switch (code) {
            case 200 -> "OK";
            case 404 -> "Not Found";
            case 500 -> "Server Error";
            case 403 -> "Forbidden";
            default -> "Unknown status";
        };
    }

    // Example 6: Common mistake - missing break (fall-through)
    public static void demonstrateFallThrough(int value) {
        System.out.println("Demonstrating fall-through (missing breaks):");
        switch (value) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Switch Statement Examples ===\n");

        // Example 1
        System.out.println("Example 1: Basic switch");
        getDayName(1);
        getDayName(5);
        getDayName(9);
        System.out.println();

        // Example 2
        System.out.println("Example 2: Switch with String");
        getCountryCapital("USA");
        getCountryCapital("France");
        getCountryCapital("Germany");
        System.out.println();

        // Example 3
        System.out.println("Example 3: Grouping cases (fall-through)");
        categorizeVowel('a');
        categorizeVowel('y');
        categorizeVowel('b');
        System.out.println();

        // Example 4
        System.out.println("Example 4: Multiple cases for one logic");
        getSeason(1);
        getSeason(6);
        getSeason(11);
        System.out.println();

        // Example 5
        System.out.println("Example 5: Switch expression (Java 14+)");
        System.out.println("Status 200: " + getStatusMessage(200));
        System.out.println("Status 404: " + getStatusMessage(404));
        System.out.println("Status 999: " + getStatusMessage(999));
        System.out.println();

        // Example 6
        System.out.println("Example 6: Fall-through behavior");
        demonstrateFallThrough(2);
    }
}
