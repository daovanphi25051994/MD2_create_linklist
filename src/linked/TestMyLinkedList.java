package linked;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.add(4,5);
        ll.add(5,6);
        ll.add(11,7);
        ll.add(20,8);
        ll.printList();
    }
}
