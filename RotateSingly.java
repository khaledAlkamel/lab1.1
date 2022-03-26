/**
 * Created by خالد الكامل on 26/03/22.
 */
class RotateSingly {

    static class Node {

        int data;
        Node next;
    }
    static  Node head = null;


    static void rotate( int m)
    {
        if (m == 0)
            return;

        Node current = head;


        while (current.next != null)
            current = current.next;

        current.next = head;
        current = head;

        for (int i = 0; i < m - 1; i++)
            current = current.next;

        head = current.next;
        current.next = null;
    }


    static void push(int new_data)
    {

        Node new_node = new Node();

        new_node.data = new_data;

        new_node.next = head;

        head = new_node;
    }


    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void  main(String[] args)
    {
        for (int i = 30; i > 0; i -= 5)
            push( i);

        System.out.print("insde linked list: \n");
        printList(head);
        rotate( 4);

        System.out.print("\nRotated Linked list : \n");
        printList(head);
    }
}
