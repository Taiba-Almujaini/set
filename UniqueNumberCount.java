import java.util.*;

public class UniqueNumberCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,5,4,9,3,5,8,3,0);// list to store duplicate number

        // Set to store unique numbers
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Print unique numbers along with their counts
        for (Integer uniqueNum : uniqueNumbers) {
            int count = 0;
            for (Integer num : numbers) {
                if (num.equals(uniqueNum)) {
                    count++;
                }
            }
            System.out.println(uniqueNum + " occurs " + count + " times"); // print the number with each time occurs
        }
    }
}
