package collections;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<String,String> country =new HashMap();

        country.put("Tr","Turkey");
        country.put("En","England");
        country.put("Jp","Japan");
        country.put("Fr","France");


        System.out.println(country);
        System.out.println(country.get("Jp"));

    }
}
