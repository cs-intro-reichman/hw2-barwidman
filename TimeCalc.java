public class TimeCalc {
    public static final int NUM_OF_ARGS = 2;
    public static final int HOURS_TO_MINUTES_MULTIPLIER = 60;
    public static void main(String[] args) {
        if (args.length != NUM_OF_ARGS) {
            System.err.println("Usage: java TimeCalc <TIME> <MINUTES_TO_ADD>");
            return;
        }
        // Just the same implementation as in the TimeFormat exercise for parsing.
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        // Does the same with the minutes part of the input.
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours * HOURS_TO_MINUTES_MULTIPLIER) + minutes + minutesToAdd;
        int totalHours =  totalMinutes / HOURS_TO_MINUTES_MULTIPLIER;
        int newHours = totalHours % 24;
        int newMinutes =  totalMinutes - (totalHours * HOURS_TO_MINUTES_MULTIPLIER);
        System.out.println(String.format("%02d:%02d", newHours, newMinutes));
    }
}
