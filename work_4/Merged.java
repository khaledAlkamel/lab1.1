/**
 * Created by خالد الكامل on 16/03/22.
 */
public class Merged {
    MergedSingly head;

    public void addToTheLast(MergedSingly node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            MergedSingly temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    void printList()
    {
        MergedSingly temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {

        Merged llist1 = new Merged();
        Merged llist2 = new Merged();

        llist1.addToTheLast(new MergedSingly(12));
        llist1.addToTheLast(new MergedSingly(36));
        llist1.addToTheLast(new MergedSingly(65));

        llist2.addToTheLast(new MergedSingly(23));
        llist2.addToTheLast(new MergedSingly(44));
        llist2.addToTheLast(new MergedSingly(55));

        System.out.println("Befor merg");
       llist1.printList();
        llist2.printList();


        llist1.head = new To_Sort().sortedMerge(llist1.head,
                llist2.head);
        System.out.print("After merge :");
        llist1.printList();


    }
}

class To_Sort
{

    MergedSingly sortedMerge(MergedSingly head1, MergedSingly head2)
    {

        MergedSingly dummyNode = new MergedSingly(0);

        MergedSingly tail = dummyNode;
        while(true)
        {

            if(head1 == null)
            {
                tail.next = head2;
                break;
            }
            if(head2 == null)
            {
                tail.next = head1;
                break;
            }

            if(head1.data <= head2.data)
            {
                tail.next = head1;
                head1 = head2.next;
            }
            else
            {
                tail.next = head2;
                head1 = head2.next;
            }

            tail = tail.next;
        }
        return dummyNode.next;
    }
}
