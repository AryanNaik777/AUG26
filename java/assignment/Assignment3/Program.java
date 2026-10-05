package Calculator;


public class Program {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int num1 = ConsoleInput.getInteger();
        int num2 = ConsoleInput.getInteger();

        int result_add = cal.add(num1, num2);
        int result_substract = cal.substract(num1, num2);
        int result_multiply = cal.multiply(num1, num2);
        int result_divide = cal.divide(num1, num2);

        System.out.println(result_add);
        System.out.println(result_substract);
        System.out.println(result_multiply);
        System.out.println(result_divide);

        float fnum1 = ConsoleInput.getFloat();
        float fnum2 = ConsoleInput.getFloat();
        float fresult_add = cal.add(fnum1, fnum2);
        float fresult_substract = cal.substract(fnum1, fnum2);
        float fresult_multiply = cal.multiply(fnum1, fnum2);
        float fresult_divide = cal.divide(fnum1, fnum2);

        System.out.println(fresult_add);
        System.out.println(fresult_substract);
        System.out.println(fresult_multiply);
        System.out.println(fresult_divide);

    }

}