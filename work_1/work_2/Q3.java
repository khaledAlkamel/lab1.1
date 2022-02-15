/**
 * Created by خالد الكامل on 4/02/22.
 */
import java.util.Scanner;
import java.util.Stack;

public class Q3 {

        static int postfix(String x) {
            Stack<Integer> Stack = new Stack<>();
            for (int i = 0; i < x.length(); i++) {
                char z = x.charAt(i);
                if (Character.isDigit(z))
                    Stack.push(z - '0');

                else {
                    int operand1 = Stack.pop();
                    int operand2 = Stack.pop();
                    switch (z) {
                        case '+':
                            Stack.push(operand1 + operand2);
                            break;
                        case '-':
                            Stack.push(operand1 - operand2);
                            break;
                        case '*':
                            Stack.push(operand1 * operand2);
                            break;
                        case '/':
                            Stack.push(operand1 / operand2);
                            break;
                        case '^':
                            Stack.push((int) Math.pow(operand1, operand2));
                            break;
                    }
                }
            }
            return Stack.pop();

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter an expression in A \"Postfix1\" expression ");
            String x = in.nextLine();
            System.out.println("A \"Postfix1\" expression enter = " + x);
            System.out.println("POSTFIX = " + postfix(x));
        }
    }


