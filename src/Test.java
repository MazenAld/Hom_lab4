public class Test {
    public static void main(String[] args) {
        lab4_SinglyLinkedList<Integer> A=new lab4_SinglyLinkedList<>();

        System.out.println(A.isEmpty());
        System.out.println(A.size());

       A.addFirst(2);
        A.addLast(3);
        A.addLast(4);
        A.addFirst(1);

        System.out.println("  ");

        System.out.println(A.Last());
        while (!A.isEmpty())
            System.out.print(A.removeFirst()+"\t");

        System.out.println(A.rotate());
    }
}
