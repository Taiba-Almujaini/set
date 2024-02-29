import java.lang.reflect.Array;
import java.util.*;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of array :"); //Ask the user to enter the array size
        int size= scanner.nextInt();
        System.out.println("Enter your coins :");
        int [] coinsArray= new int[size];//create array for coins
        int [] sumArray= new int[size];// create array to store the sum values

        for(int i=0;i<size; i++) { // ask user to eneter coins
            coinsArray[i] = scanner.nextInt();
        }
        int sum=0;
        for (int i=0; i<size; i++) //calculate the sum values
        {
            sum+=coinsArray[i];
            sumArray[i]=sum;
        }
        System.out.println("The coins you entered :"+ Arrays.toString(coinsArray));//print values user enter
        System.out.println("Sum of your Coins :"+ Arrays.toString(sumArray)); // print values after sum

    }

}