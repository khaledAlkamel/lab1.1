/**
 * Created by خالد الكامل on 15/02/22.
 */
public class jos {




        static int jos(int m, int b)
        {
            if (m == 1)
                return 1;
            else
                return (jos(m- 1, b) + b-1) % m + 1;
        }


        public static void main(String[] args)
        {
            int m = 10;
            int b =2 ;
            System.out.println("The chosen place is " + jos(m, b));
        }
    }


