public class TimeComplexityExercise {

    public static int multiplyByTwo(int n) {
        return n * 2;
    }
    //O(1)


    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    //O(n)

    public static void printHelloSevenTimes(int n) {
        for(int i = 0; i < 7; i++) {
            System.out.println("Hello");
        }  
    }
    //O(1)


    public static void printAllPairs(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
    //O(n^2)

    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //O(n)

    public static void adjacentLoops(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Loop 1, iteration: " + i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println("Loop 2, iteration: " + j);
        }
    }
    //O(n)

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
    //O(n^2)


    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    //O(n=arr.length) O(arr.length)
    // O(n) n=arr.length


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
    //O(arr.length^2)

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
    //O(arr.length^3)

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
    //O(arr.length^4)

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    //O(arr.length)


    public static int countUntil(int[] arr, int x) {
        int count = 0;
        while(arr[count] < x) {
            System.out.println(arr[count] + " is less than " + x);
            count++;
        }
        return count;
    }
    //O(arr.length)


    public static void printEach7Times(int[] arr) {
        for(int num : arr) {
            for(int i = 0; i < 7; i++) {
                System.out.println(num);
            }
        }
    }
    //O(arr.length)

    
    public static int nextDivisibleBy10(int x) {
        while(x % 10 != 0) {
            x++;
        }
        return x;
    }
    //O(1)

}
