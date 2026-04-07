package JavaOperators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int firstNumber = 200;
        int secondNumber = 300;

        firstNumber = firstNumber + secondNumber;
        firstNumber += secondNumber;

        System.out.println("FirstNumber ===>" + firstNumber);
    }
}

