import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num =inputNumber();
        FibonacciNumbers fibonaccinumber = new FibonacciNumbers();
        fibonaccinumber.getFibonacciNumbers(num);
        fibonaccinumber.Check(num);


    }

    /**
     *
     * @return number, which is the number of Fibonacci numbers to generate
     */
    static int inputNumber(){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Введіть кількість чисел Фібоначчі: ");
        //number is the number of Fibonacci numbers to be generated
        number = input.nextInt();
        if (number<=0)
            throw new IllegalArgumentException("Некоректне введеня, число повинно бути більшим за 0");
        return number;
    }


}
