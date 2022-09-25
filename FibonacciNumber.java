public class FibonacciNumber {
    /**
     * field that shows the order of the Fibonacci Number
     */
    private int number;
    /**
     * field that shows the value of the Fibonacci Number
     */
    private long value;

    /**
     * constructor
     */
    FibonacciNumber() {
        number = 2;
    }
    // getters and setters
    long getValue()  {
        return value;
    }
    void setValue(int val) {
        value = val;
    }
    int getNumber() {
        return number;
    }
    void setNumber(int num) {
        number = num;
    }

    /**
     *
     * @param val  parameter that is assigned a field value
     */
    void nextValue(long val) {
        value = val;
        number++;
    }
}