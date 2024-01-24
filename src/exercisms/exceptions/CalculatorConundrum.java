package exercisms.exceptions;

import java.awt.dnd.InvalidDnDOperationException;

public class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {

        if( operation == null ){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if( operation == "" ){
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {
            if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
                throw new IllegalOperationException("Operation " + operation + " does not exist");
            }
        } catch (IllegalOperationException e) {
            System.out.println("Operation " + operation + " does not exist");
            e.printStackTrace();
        }

            if (operation == "+") {
                int result = operand1 + operand2;
                String operand1String = String.valueOf(operand1);
                String operand2String = String.valueOf(operand2);
                String resultString = String.valueOf(result);
                return operand1String + " + " + operand2String + " = " + resultString;
            }
            if (operation == "*") {
                int result = operand1 * operand2;
                String operand1String = String.valueOf(operand1);
                String operand2String = String.valueOf(operand2);
                String resultString = String.valueOf(result);
                return operand1String + " * " + operand2String + " = " + resultString;
            }
            if (operation == "/") {
                int result = operand1 / operand2;
                String operand1String = String.valueOf(operand1);
                String operand2String = String.valueOf(operand2);
                String resultString = String.valueOf(result);
                return operand1String + " / " + operand2String + " = " + resultString;
            }
            return "N/A";
    }
    class IllegalOperationException extends Exception {
        public IllegalOperationException(String message) {
            super(message);
        }
    }

}
