//1.Find missing number from 1 to N -> 1,2,3,5,6  

public class MissingNumber {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 6};  // given array
        int n = 6;                   // numbers from 1 to 6

        int sum = 0;

        // find sum of array
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // total sum from 1 to n
        int total = n * (n + 1) / 2;

        // missing number
        int missing = total - sum;

        System.out.println("Missing number is: " + missing);
    }
}