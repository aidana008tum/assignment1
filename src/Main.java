public class Main {
    // Task 1
    static void printDigits(int n){
        if(n == 0) return;
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    static double average(int[] arr, int n, int total) {
        if(n == 0) return (double) total / arr.length;
        return average(arr, n-1, total + arr[n-1]);
    }

    // Task 3
    static boolean isPrime(int n, int i){
        if(n <= 2) return (n == 2);
        if(n % i == 0) return false;
        if(i * i > n) return true;
        return isPrime(n, i + 1);
    }

    // Task 4
    static int fact(int n){
        if(n == 1) return 1;
        return n * fact(n - 1);
    }

    // Part 2
    // Task 5
    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    // Task 6
    static int power(int a, int n){
        if(n == 0) return 1;
        return a * power(a, n-1);
    }

    // Task 8
    static boolean onlyDigits(String s, int i){
        if(i == s.length()) return true;
        if(!Character.isDigit(s.charAt(i))) return false;
        return onlyDigits(s, i+1);
    }

    // Task 9
    static int length(String s){
        if(s.equals("")) return 0;
        return 1 + length(s.substring(1));
    }

    // Task 10
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Task 1
        printDigits(5481);

        // Task 2
        int[] numbers = {3,2,4,1};
        double avg = average(numbers, numbers.length, 0);
        System.out.println("Average = " + avg);

        // Task 3
        System.out.println(isPrime(7, 2) ? "Prime" : "Composite");

        // Task 4
        System.out.println(fact(5));

        // Task 5
        System.out.println(fib(5));

        // Task 6
        System.out.println(power(2,10));

        // Task 8
        System.out.println(onlyDigits("123456", 0) ? "Yes" : "No");

        // Task 9
        System.out.println(length("hello"));

        // Task 10
        System.out.println(gcd(32,48));
    }
}