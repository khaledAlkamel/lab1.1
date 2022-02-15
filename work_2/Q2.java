/**
 * Created by خالد الكامل on 4/02/22.
 */
import java.util.Stack;
public class Q2 {

        static int counter=0;
        static Stack<Object>Stack2=new Stack<>();
        public static String pop(){
            while (!Stack2.isEmpty()) {

                System.out.println("deleted = " + Stack2.pop());
                System.out.println("size=" + Stack2.size());
                System.out.println("is the stack empty ? " + Stack2.isEmpty());
            }
            return "No Stack is  Empty \n Stack = "+Stack2;
        }

        public static void main(String[] args) {
            Stack2.push("k");
            Stack2.push("h");
            Stack2.push("a");
            Stack2.push("l");
            Stack2.push("a");
            Stack2.push("d");
            System.out.println("Element pushed to Stack ");
            System.out.println("Stack = "+Stack2);
            System.out.println(pop());

        }
    }


