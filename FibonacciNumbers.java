public class FibonacciNumbers {
    private long[] fibonaccinumbers = new long[100];
    private int n;

    /**
     *
     * @param n is the number of Fibonacci numbers to generate
     */
    public void getFibonacciNumbers(int n) {
        this.n = n;
        for (int i = 1; i < n; i++) {
            if (i == 1 || i == 2) {
                fibonaccinumbers[i] = 1;
            } else {
                fibonaccinumbers[i] = fibonaccinumbers[i - 1] + fibonaccinumbers[i - 2];
            }
            System.out.print(fibonaccinumbers[i] + " ");
        }
    }

    /**
     *
     * @param num is the number of Fibonacci numbers to check
     */
    public void Check(int num) {
        System.out.println("\nЧисла Фібоначчі, що відповідають формулі w^3+1:");
        int j = 0;

        for (int i = 2; i < n; i++) {
            double result = Math.cbrt(fibonaccinumbers[i] - 1);
            if (result % 1 == 0 && result != 0) {
                System.out.println(i + " число Фібоначі = " + fibonaccinumbers[i]);
            }
        }
    }
}

