public class Calculator {
    double operand1;
    double operand2;
    String operator;

    public Calculator(double operand1, String operator, double operand2)
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double Calculate(){
        if(operator.equals("+")){
            return operand1 + operand2;
        }
        if(operator.equals("-")){
            return operand1 - operand2;
        }
        if(operator.equals("*")){
            return operand1 * operand2;
        }
        if(operator.equals("/")){
            return operand1 / operand2;
        }
        else return 0;
    }

    public static void main(String[] args) {
        //Test it here
        Calculator calculator = new Calculator(60,"+", 40);
        System.out.println(calculator.Calculate());
    }
}
