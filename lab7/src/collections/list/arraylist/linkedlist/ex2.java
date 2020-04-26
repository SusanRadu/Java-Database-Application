package collections.list.arraylist.linkedlist;

import java.util.LinkedList;

public class ex2 {


    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();

        list.add("o");
        list.offer("e");
        list.offerFirst("ee");

        System.out.println(list.element());

        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);

        list.pop();



    }

}
