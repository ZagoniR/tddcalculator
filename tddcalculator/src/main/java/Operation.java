/**
 * Created by lenovo on 7/6/2017.
 */
public class Operation implements Adder, Subtractor {

    public long add(long... operands) {

        if (operands.length == 0) {
            return 0;
        }

        long sum = 0;

        for (long operand : operands) {
            sum += operand;
        }

        return sum;
    }

    public long subtract(long... operands) {

        if (operands.length == 0) {
            return 0;
        }

        long difference = operands[0];

        for (int i = 1; i < operands.length; i++) {
            difference -= operands[i];
        }

        return difference;
    }
}
