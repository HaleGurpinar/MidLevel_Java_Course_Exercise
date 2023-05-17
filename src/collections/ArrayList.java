package collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> list= new java.util.ArrayList<>();

        list.add(25);
        list.add(10);
        list.add(30);
        list.add(12);
        System.out.println(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(list.size());
        System.out.println(list.get(0));

    }
}
