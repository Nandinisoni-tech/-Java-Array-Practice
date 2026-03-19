//8.Find the majority element n/3

public class MajorityElementNby3 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 1, 1, 2, 1};
        int n = arr.length;

        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > n/3) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}