public class runner {
    public static void main(String arg[])
    {
        linkedlist l1= new linkedlist();
        l1.insert(5);
        l1.insert(12);
        l1.insert(4);
        l1.insertAt(2,34);
        l1.insertAt(3, 23);
        l1.insertAtStart(56);
        l1.deleteAt(3);
        l1.deleteAt(1);
        l1.deleteKey(12);
        l1.insert(17);
        l1.deleteKey(17);
        l1.deleteAt(3);
    }
}