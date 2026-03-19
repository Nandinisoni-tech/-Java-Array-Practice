//6.Count occurrences of an element in a sorted array

public class CountOccurrences {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 2, 3, 4, 5};  
        int key = 2;                        

        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                count++;
            }
        }

        System.out.println("Element " + key + " occurs " + count + " times");
    }
}