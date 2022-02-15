/**
 * Created by خالد الكامل on 4/02/22.
 */
import java.util.Stack;
public class Q1 {


    public static void main(String[] args) {
        Stack<Object> x = new Stack();
        Stack<Object> z = new Stack();
        x.push("k");
        x.push("h");
        x.push("a");
        x.push("l");
        x.push("e");
        x.push("d");
        System.out.println("Stack s = " + x);
        System.out.println("x size = " + x.size());
        int m = x.size();

        for (int i = 0; i < m; ++i) {
            z.push(x.pop());
        }

        System.out.println("Stack z =" + z);
    }
}

