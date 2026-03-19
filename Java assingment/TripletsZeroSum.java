//5.Find all triplets with 0 sum

public class TripletsZeroSum {

    public static void main(String[] args) {

        int arr[] = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;

        System.out.println("Triplets with zero sum are:");

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                for(int k = j + 1; k < n; k++) {

                    if(arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }
}