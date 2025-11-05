// Demonstrates the Collatz conjecture.
public class Collatz {
    public static final int NUM_OF_ARGS = 2;

    public static void main(String args[]) {
        if (args.length != NUM_OF_ARGS) {
            System.err.println("Usage: java Collatz <SEED> <MODE>");
            return;
        }
        int seed = Integer.parseInt(args[0]);
        char mode = args[1].charAt(0);

        if (mode != 'c' && mode != 'v') {
            System.err.println(String.format("Invalid mode '%c' given", mode));
            return;
        }
        int count;

        for (int i = 1; i <= seed; i++) {
            count = 1;
            int currentValue = i;
            do {
                if (mode == 'v') {
                    System.out.print(currentValue + " ");
                }

                if (currentValue % 2 == 0) {
                    currentValue /= 2;
                } else {
                    currentValue = (currentValue * 3) + 1;
                }
                count++;
            } while (currentValue != 1);
            if (mode == 'v') {
                System.out.print(currentValue + " ");
                System.out.print("(" + count + ")");
                System.out.println();
            }
        }
        System.out.println(String.format("Every one of the first %d hailstone sequences reached 1.", seed));

    }
}
