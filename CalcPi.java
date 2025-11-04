// Computes an approximation of PI.
public class CalcPi {
    public static final int NUM_OF_ARGS = 1;
    public static void main(String[]  args) {
        if (args.length != NUM_OF_ARGS) {
            System.err.println("Usage: java CalcPi <NUM_TERMS>");
            return;
        }
	    int numTerms = Integer.parseInt(args[0]);
        double currentTotalValue = 0.0;
        int currentDivisionIndex = 1;

        for (int i = 0; i < numTerms; i++) {
            if (i % 2 == 0) {
                currentTotalValue += (double)1 / currentDivisionIndex;
            }
            else {
                currentTotalValue -= (double)1 / currentDivisionIndex;
            }
            currentDivisionIndex +=2;
        }

        System.out.println("pi, according to Java: " + Math.PI);
        System.out.println("pi, approximated:      " + currentTotalValue*4);
	}
}
