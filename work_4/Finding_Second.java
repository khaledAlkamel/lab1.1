import java.util.Scanner;

/**
 * Created by خالد الكامل on 16/03/22.
 */
public class Finding_Second {
    Singlyinked start;
    Finding_Second()
    {
        start = null;
    }

    public void add(int data)
    {
        if(this.start == null)
        {
            Singlyinked temp = new Singlyinked(data);
            this.start = temp;
        }
        else
        {
            Singlyinked temp = new Singlyinked(data);
            temp.next = this.start;
            this.start = temp;
        }
    }

    public int findSecondLastNode(Singlyinked ptr)
    {

        Singlyinked temp = ptr;


        if(temp == null || temp.next == null)
            return -1;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args)
    {
        Finding_Second list = new Finding_Second();
        Scanner in=new Scanner(System.in);
        System.out.println("input the num:");
        int m = 0;
        {

        for (int i = 0; i <4 ; i++)

          list.add(in.nextInt());



        }
        list.add(m);
        System.out.println("The second element is:\t"+list.findSecondLastNode(list.start));

    }
}

