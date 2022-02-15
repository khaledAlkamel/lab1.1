/**
 * Created by خالد الكامل on 12/02/22.
 */
import java.util.Stack;
public class Q2 {


        Stack<Object> S = new Stack<>();
        Stack<Object> s = new Stack<>();
        public static void main(String[] args) {

            Q2 g = new Q2();

            g.S.push("k");
            g.S.push(6);
            g.S.push(5);
            g.S.push(2);
            System.out.println("Stack S="+g.S);
            System.out.println("S.size ="+g.S.size());
            int s =g.S.size();
            for (int i = 0; i <s ; i++) {
                g.S.push(g.S.pop());
            }
            System.out.println("Stack s="+g.S);
        }}


