public class TimeComplexityExercise {

    // O(1) Constant, because not depends on 'n', where n is the input number.
    public static int multiplyByTwo(int n) {
        return n * 2;
    }

    // O(n) linear, where n is the input number.
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // O(1) Constant, beacuse loop not depends on 'n', it will always run 7 times.
    public static void printHelloSevenTimes(int n) {
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello");
        }
    }

    // O(n^2) Quadratic, where n is the input number.
    public static void printAllPairs(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }

    // O(n), where n is the input number.
    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // n+n = 2n => O(n), by dropping constant factor! here n is the input number.
    public static void adjacentLoops(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Loop 1, iteration: " + i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println("Loop 2, iteration: " + j);
        }
    }

    // n+n^2 = n^2, keeping only dominant term. So, O(n^2), where n is the input
    // number.
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

    // O(n), where n is the length of the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // O(n^2), where n is the length of the array
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

    // O(n^3), where n is the length of array
    public static boolean hasThreeSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // O(n^4), where n is the length of the array
    public static boolean hasFourSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // O(n), where n is the length of the array
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // O(1), it is a infinite loop, not depends on array
    public static int countUntil(int[] arr, int x) {
        int count = 0;
        while (arr[count] < x) {
            System.out.println(arr[count] + " is less than " + x);
        }
        return count;
    }

    // 7n => O(n), where n is the length of the array
    public static void printEach7Times(int[] arr) {
        for (int num : arr) {
            for (int i = 0; i < 7; i++) {
                System.out.println(num);
            }
        }
    }

    // O(n), where n is the input number
    public static int nextDivisibleBy10(int x) {
        while (x % 10 != 0) {
            x++;
        }
        return x;
    }

}
