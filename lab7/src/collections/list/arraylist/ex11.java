package collections.list.arraylist;

//list,set,queue

import java.util.ArrayList;
import java.util.List;

public class ex11 {


    public static void main(String[] args) {


        List bulklist = new ArrayList();

        bulklist.add(1);
        bulklist.add("gfasdga");
        System.out.println(bulklist);

        List<String> list1 = new ArrayList<>();
        System.out.println(list1.isEmpty());

        list1.add("one");
        list1.add("two");
        list1.add(0,"111");
        list1.add(1,"1");
        System.out.println(list1.size());

        if(list1.contains("one")){
            System.out.println(list1.remove(0));
            System.out.println(list1.remove("two"));

        }

        System.out.println(list1);


        List<String> list2 = new ArrayList<>(list1);
        list2.addAll(list2);
        System.out.println(list2);
        list2.addAll(1,list2);
        System.out.println(list2);

        list2.add( "last element");
        list2.removeAll(list1);
        System.out.println("after all remove all:" + list2);
        list1.clear();
        System.out.println("list1 after clear: " + list1);



    }

}
