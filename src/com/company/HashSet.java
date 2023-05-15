package com.company;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


class HSet {
        public static void main(String[] args) {
// f(x) = x*3 * xmod7 * sqrt(x)
//            HashSet<String> h = new HashSet<>();
//            h.add("a");
//            h.add("b");
//            h.add("z");
//            h.add(null);
//            h.remove("b");
//            System.out.println(h.size());
//            System.out.println(h.contains("b"));
//            for (String s : h) {
//                System.out.println(s);
//            }
//
//            Iterator<String> itr= h.iterator();
//            while (itr.hasNext()) {
//                System.out.println(itr.next());
//            }

            LinkedHashSet<String> days = new LinkedHashSet();
            days.add("Monday");
            days.add("Tuesday");
            days.add("Wednesday");
            days.add("Thursday");
            days.add("Friday");
            days.add("Saturday");
            days.add("Sunday");

            for (String str: days){
                System.out.println(str);
            }
        }

        }






