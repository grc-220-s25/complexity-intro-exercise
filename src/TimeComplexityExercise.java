public class TimeComplexityExercise {
    //0(1), because n is an integer input. 
    //It is constant time because it performs a single operation.
    public static int multiplyByTwo(int n) {
        return n * 2;
    }

    //0(n), because n is the input integer.
    //Loop runs in 'n' times, meaning the system prints each number from 1 to n.
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    //0(1), where n is an input integer
    //Loops runs 7 times, without regarding the value of n.
    public static void printHelloSevenTimes(int n) {
        for(int i = 0; i < 7; i++) {
            System.out.println("Hello");
        }
    }

    //0(n^2), because n is the input integer showing the range of numbers
    //both the outer and inner loop runs n times
    public static void printAllPairs(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }

    //0(n), where n is the input integer that shows the sum
    //loop runs in n times, which adds each number from 1 to n until it reaches the sum
    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //0(n), where n is the input integer that shows the iterations for each loop
    //loops runs 2n
    public static void adjacentLoops(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Loop 1, iteration: " + i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println("Loop 2, iteration: " + j);
        }
    }

    //0(n^2), n represents number of iterations. First loop 0(n), and the other loop runs in 0(n^2).
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

    //0(n), n is the length of the input array 'arr', loop runs once to find max value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //0(n^2), n is the length of input array 'arr', two nested loops to check pair of elements in array
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

    //0(n^3), n is length of input array 'arr'
    //has 3 nested loops, and due to size of array, it is ^3.
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

    //0(n^4), n is length of input array 'arr'.
    //uses a four nested loop to check every quadruplet combinations of the array
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

    //0(n), n is the length of the input array 'arr', iterates through
    //array once to check if every element is less than/equal to the next
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //0(n), n is the length of the input array 'arr', loop iterates entire array until element is less than or equal to or if the end of the array is completed.
    public static int countUntil(int[] arr, int x) {
        int count = 0;
        while(arr[count] < x) {
            System.out.println(arr[count] + " is less than " + x);
        }
        return count;
    }

    //0(n), n is the length of the input array 'arr', since each elements passes through a fixed number '7', the total is 7n so it is 0(n) 
    public static void printEach7Times(int[] arr) {
        for(int num : arr) {
            for(int i = 0; i < 7; i++) {
                System.out.println(num);
            }
        }
    }

    //0(1), where x is the input integer
    //loop runs at 9 times, so its considered constant
    public static int nextDivisibleBy10(int x) {
        while(x % 10 != 0) {
            x++;
        }
        return x;
    }

}
