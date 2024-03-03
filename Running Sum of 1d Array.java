import java.lang.reflect.Array;
import java.util.*;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of array :"); //Ask the user to enter the array size
        Integer size= scanner.nextInt();
        System.out.println("Enter your coins :");
        Integer [] coinsArray= new Integer[size];//create array for coins
        Integer [] sumArray= new Integer[size];// create array to store the sum values

        for(Integer i=0;i<size; i++) { // ask user to eneter coins
            coinsArray[i] = scanner.nextInt();
        }
        Integer sum=0;
        for (Integer i=0; i<size; i++) //calculate the sum values
        {
            sum+=coinsArray[i];
            sumArray[i]=sum;
        }
        System.out.println("The coins you entered :"+ Arrays.toString(coinsArray));//print values user enter
        System.out.println("Sum of your Coins :"+ Arrays.toString(sumArray)); // print values after sum

    }

}
