public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString (int seconds) {
        if (seconds < 0 ) {
            System.out.println("invalid value of seconds");
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);

    }

    public static String getDurationString (int minutes, int seconds) {
        if (seconds < 0 || seconds > 60 || minutes < 0 ) {
            System.out.println("Invalid value!");
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hour + " h " + remainingMinutes + " m " + seconds + " s";
    }
}