public class TimeComplexityExercise {

    //Time complexity: O(1), so n is an integer input
    //here no matter what n value is, it's only doing one calcule wich is a multiplication by 2.  
    public static int multiplyByTwo(int n) {
        return n * 2;
    }

    //Time complexity: O(n), n an integer input
    //here the method prints number 1 to n, and the operation grow linearly by the value of n.
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    //Time complexity: O(1), n is an integer input.
    //here the method prints "hello" 7 times, wich doesn't depends on n value.
    public static void printHelloSevenTimes(int n) {
        for(int i = 0; i < 7; i++) {
            System.out.println("Hello");
        }
    }

    //Time complexity: O(n), n an integer input
    //here the method prints n*n times as in outer loop it prints n times and for each outer loop, the inner loop prints n times. 
    public static void printAllPairs(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }

    
    //Time Complexity: O(n),n is an integer input .
    //here the method make a sums of all integers from 1 to n.
    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    
    //Time Complexity: O(n), where n is the input integer.
    //here the method runs two separate loops that iterating n times.
    public static void adjacentLoops(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Loop 1, iteration: " + i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println("Loop 2, iteration: " + j);
        }
    }

    
    //Time Complexity: O(n^2), where n is the input integer.
    //here the method the first loop runs n times, and the nested loop runs n * n times.
    public static void adjacentAndNestedLoops(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("First loop, iteration: " + i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nested loops, i: " + i + ", j: " + j);
            }
        }
    }


    
    //Time Complexity: O(n), where n is the length of the array.
    //here the method finds the maximum value in the array.
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    
    //Time Complexity: O(n^2), where n is the length of the array.
    //here the method checks all pairs to see if any two sum to the target.
    public static boolean hasTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }


    
    //Time Complexity: O(n^3), where n is the length of the array.
    //here the method checks all triplets to see if any three sum to the target
    public static boolean hasThreeSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for(int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    
    //Time Complexity: O(n^4), where n is the length of the array.
    //here the method checks all quadruplets to see if any four sum to the target.
    public static boolean hasFourSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for(int k = 0; k < arr.length; k++) {
                    for(int l = 0; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    
    //Time Complexity: O(n), where n is the length of the array.
    //here the method checks if the array is sorted in non-decreasing order.
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static int countUntil(int[] arr, int x) {
        int count = 0;
        while(arr[count] < x) {
            System.out.println(arr[count] + " is less than " + x);
        }
        return count;
    }


    
    //Time Complexity: O(n), where n is the length of the array.
    //here each element is printed 7 times, but the number of elements determines the loop count.
    public static void printEach7Times(int[] arr) {
        for(int num : arr) {
            for(int i = 0; i < 7; i++) {
                System.out.println(num);
            }
        }
    }

    
    
    //Time Complexity: O(n), where n is the length of the array.
    //here the method increments n until it is divisible by 10
    public static int nextDivisibleBy10(int x) {
        while(x % 10 != 0) {
            x++;
        }
        return x;
    }

}
