public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println(calculate(12, "/", 0));
    }

    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        return ((operation.equals("+") ? numberOne+numberTwo : operation.equals("-") ? numberOne-numberTwo : operation.equals("*") ? numberOne * numberTwo :
                operation.equals("/") ? numberOne/numberTwo : null));
    }
}
/*Just create a calculator.*/
