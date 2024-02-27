
import java.util.HashSet;
import java.util.Arrays;
public class CloneAHashSet{
    public static void main(String[] args) {


        //create set and add numbers
        HashSet<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList("Taiba", "Ahmed","Ameera", "Ali"));

        // Create a shallow copy of set1
        HashSet<String> copySet1 = new HashSet<>(set1);
        //add new elements
        copySet1.add("Maryam");
        copySet1.add("Omar");

        System.out.println("Original Set1: " + set1); //print set1
        System.out.println("Copy of Set1: " + copySet1); //print the copy of set1





    }

}