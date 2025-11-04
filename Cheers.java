// Prints a crowd cheering output.
public class Cheers {
    public static final int NUM_OF_ARGS = 2;
    public static void main(String[]  args) {
        if (args.length != NUM_OF_ARGS) {
            System.err.println("Usage: java Cheers <CHEER> <NUM_OF_CHEERS>");
            return;
        }
        String cheer = args[0];
        int numOfCheers = Integer.parseInt(args[1]);

        char[] useAnCharacters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R','S', 'X'};

        for (int i = 0; i < cheer.length(); i++) {
            // Yeah... In the tests they actually align the lines by having another space after "a"
            String letterPrefix = "a ";
            char currentCharacterUpper = Character.toUpperCase(cheer.charAt(i));
            for (int j = 0; j < useAnCharacters.length; j++) {
                if (currentCharacterUpper == useAnCharacters[j]) {
                    letterPrefix = "an";
                    break;
                }
            }
            System.out.println("Give me " + letterPrefix + " " +  currentCharacterUpper + ": " + currentCharacterUpper + "!");
        }
        System.out.println("What does that spell?");

        for (int i = 0; i < numOfCheers; i++) {
            System.out.println(cheer.toUpperCase() + "!!!");
        }
    }
}
