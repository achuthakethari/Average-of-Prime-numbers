package avgprime;

public class AvgPrime {
    public static void main(String[] args) {
       /* int number = 2;
        int count = 0;
        long sum = 0;
        float avg =0;
        while (number < 12) {
            if (isPrimeNumber(number)) {
                sum += number;
                count++;

            }
            number++;
        }
        avg = sum / count;
        System.out.println("Sum of prime numbers between 1 to 10 is:" + sum);
        System.out.printf("Average of prime numbers between 1 to 10 is" + avg);
    }

    private static boolean isPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

*/
        int sum = 0, count = 2;
        int i;
        float b = 0;
        float avg = 0;
        int j;

        for (i = 2; i < 10; i++) {
            count = 2;

            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(i);
                b++;
                sum = sum + i;

            }
        }

        avg = sum / b;

        System.out.println("the sum of all prime no.s b/w 1 to 1000 is : " + sum);
        // System.out.println("the no. of prime no.s b/w 1 to 1000 is :" + count);

        System.out.println("the avg of prime no.s is: " + avg);

    }
}