package exercisms.exceptions;

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        if (operation.equals("/") && operand2 == 0) {
            throw new IllegalOperationException("Division by zero is not allowed", ArithmeticException.class);
        }
        if (operation.equals("+")) {
            int result = operand1 + operand2;
            String operand1String = String.valueOf(operand1);
            String operand2String = String.valueOf(operand2);
            String resultString = String.valueOf(result);
            return operand1String + " + " + operand2String + " = " + resultString;
        }
        if (operation.equals("*")) {
            int result = operand1 * operand2;
            String operand1String = String.valueOf(operand1);
            String operand2String = String.valueOf(operand2);
            String resultString = String.valueOf(result);
            return operand1String + " * " + operand2String + " = " + resultString;
        }
        if (operation.equals("/")) {
            int result = operand1 / operand2;
            String operand1String = String.valueOf(operand1);
            String operand2String = String.valueOf(operand2);
            String resultString = String.valueOf(result);
            return operand1String + " / " + operand2String + " = " + resultString;
        }
        return "N/A";
    }
}
