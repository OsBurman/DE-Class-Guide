public class DayOfWeek {
    public static void main(String[] args) {
        int dayNumber = Integer.parseInt(args[0]);

        String dayName = "";
        String dayType = "";

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                dayType = "weekday";
                break;
            case 2:
                dayName = "Tuesday";
                dayType = "weekday";
                break;
            case 3:
                dayName = "Wednesday";
                dayType = "weekday";
                break;
            case 4:
                dayName = "Thursday";
                dayType = "weekday";
                break;
            case 5:
                dayName = "Friday";
                dayType = "weekday";
                break;
            case 6:
                dayName = "Saturday";
                dayType = "weekend";
                break;
            case 7:
                dayName = "Sunday";
                dayType = "weekend";
                break;
            default:
                System.out.println("Invalid day");
                return;
        }

        System.out.println(dayName + " is a " + dayType);
    }
}
