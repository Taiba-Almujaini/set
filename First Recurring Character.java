import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRecurringCharacter{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: "); // ask uer to enter string
        String input = scanner.nextLine();

        Set<Character> characterSet = new HashSet<>();// create set

        for (char character : input.toCharArray()) {
            if (characterSet.contains(character)) { // check if contain same character
                System.out.println("First recurring character: " + character);
                break;
            } else {
                characterSet.add(character);
            }
        }

    }
}
