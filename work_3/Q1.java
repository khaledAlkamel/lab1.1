/**
 * Created by خالد الكامل on 12/02/22.
 */
import java.util.Scanner;
import java.util.Stack;

public class Q1 {

        static int evaluatePostfix(String exp)
        {
            Stack<Integer> stack=new Stack<>();

            for(int i=0;i<exp.length();i++)
            {
                char c=exp.charAt(i);
                if(Character.isDigit(c))
                    stack.push(c - '0');
                else
                {
                    int Operand1 = stack.pop();
                    int Operand2 = stack.pop();
                    switch(c)
                    {
                        case '+':
                            stack.push(Operand2+Operand1);
                            break;
                        case '-':
                            stack.push(Operand2- Operand1);
                            break;
                        case '/':
                            stack.push(Operand2/Operand1);
                            break;
                        case '*':
                            stack.push(Operand2*Operand1);
                            break;
                        case '^':
                            stack.push( (int) Math.pow(Operand2,Operand1));
                            break;}}}
            return stack.pop();
        }
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an expression in a \"POSTFIX!\" expression.");
            String exp=input.nextLine();
            System.out.println("The \"POSTFIX!\"expression entered = "+exp +" .");
            System.out.println("Postfix evaluation = "+evaluatePostfix(exp)); }}



