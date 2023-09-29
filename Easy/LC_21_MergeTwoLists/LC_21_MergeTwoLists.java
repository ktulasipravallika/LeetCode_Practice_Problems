
import java.util.Scanner;

public class LC_21_MergeTwoLists {

    public static void main(String[] args) {
        ListNode dummy1 = new ListNode();
        ListNode dummy2 = new ListNode();

        ListNode list1 = dummy1;
        ListNode list2 = dummy2;

        Scanner scan = new Scanner(System.in);

        list1 = addElement(list1, scan);
        list2 = addElement(list2, scan);

        display(dummy1);
        display(dummy2);

        display(mergeTwoLists(dummy1, dummy2));

        scan.close();
    }

    public static ListNode addElement(ListNode list, Scanner scan) {

        System.out.println("Enter the elements in list 1");
        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty())
                break;
            else {
                if (list == null)
                    list = new ListNode(Integer.parseInt(input));
                else {
                    list.next = new ListNode(Integer.parseInt(input));
                    list = list.next;
                }
            }
        }
        return list;
    }

    public static void display(ListNode dummy) {

        System.out.println("The entered list is :");

        while (dummy != null) {
            if (dummy.val == 0) {
                dummy = dummy.next;
            } else {
                System.out.println(dummy.val);
                dummy = dummy.next;
            }
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        if (list1 == null)
            current = list2;

        else if (list2 == null)
            current = list1;

        while (list1!= null && list2!= null) {

            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else if (list2.val <= list1.val) {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        while (list1 != null) {
            
            current.next = list1;
            list1 = list1.next;
            current = current.next;
           
        }
        while (list2 != null) {
            
            current.next = list2;
            list2 = list2.next;
            current = current.next;
           
        }

        return dummy.next;

    }
}
