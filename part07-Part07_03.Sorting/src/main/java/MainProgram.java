
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int i = 0; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        // write your code here
        int smallest, index = 0;
        smallest = smallest(array);
        
        for(int i = 0; i < array.length; i++){
            if(smallest == array[i]){
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    // Returns index of the smallest from given start location: 
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        int smallest = array[index];

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    // Swap method: swap two values of the given indices
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Sort method: sort an array from smallest value to largest value
    // Uses some of the methods written above
    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));

        while (index < array.length) {
            
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            
            index += 1;
        }

    }
    
}
