import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

    //An array is a collection of elements of the same type stored in contiguous memory locations.

    int[] numbers = {10, 20, 30, 40, 50}; // Initialize array

    // Accessing elements
    System.out.println("First Element: " + numbers[0]);

    
        //length
        int arrlength = numbers.length;
        System.out.println(arrlength);

        //sort
        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        System.out.println(numbers[0]);


        //for-each loop
        System.out.println("for each loop");
        for (int num : numbers) {
            System.out.println(num);
        }

        //2d array
        System.out.println("2D Array");
        int[][] marks = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Printing matrix
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        //access the value
        System.out.println(marks[2][1]);

        //Copying an Array
        //1.Using clone()
        int[] number = {1, 2, 3, 4, 5};

        int[] copy = number.clone();
            System.out.println(copy[2]); 


    //Linear Search
     
    int[] values ={50,20,30,40,50,60};
    int target =30;
    boolean found= false;
    

    for(int num: values){
        if(num == target){
            found = true;
            break;
        }
    }
    System.out.println(found? "found" : "Not Found");


    //Binary search(sorted array)
    Arrays.sort(values);
    int index = Arrays.binarySearch(values, 30);
    System.out.println("Found at index: " + index); 

        
    }
    
}
