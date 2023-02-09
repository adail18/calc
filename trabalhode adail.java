import javax.swing.JOptionPane;

public class addition {
    public static void main(String[] args) {
        String operation = JOptionPane.showInputDialog("Enter operation");
        
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum=0;
        if (operation.equals("+")) {
            sum = number1 + number2;
        } else if (operation.equals("-")) {
            sum = number1 - number2;

        }else if (operation.equals("*")) {
        sum = number1 * number2;

        }else if (operation.equals("/")) {
            sum = number1 / number2;
        }
    
     

        JOptionPane.showMessageDialog( null, "The result is " + sum,
        "Result of Two Integers", JOptionPane.PLAIN_MESSAGE );
    }
}