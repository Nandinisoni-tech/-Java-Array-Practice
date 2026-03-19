//4.Find all duplicates in an array

public class FindDuplicates {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 4, 5, 1};

        System.out.print("Duplicate elements are: ");

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}