package collections;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<String,String> country =new HashMap<>();

        country.put("Tr","Turkey");
        country.put("En","England");
        country.put("Jp","Japan");
        country.put("Fr","France");


        System.out.println(country);
        System.out.println(country.get("Jp"));
        System.out.println(country.containsKey("En"));
        System.out.println(country.containsValue("England"));
        System.out.println(country.containsValue("Italy"));
        System.out.println(country.remove("Fr"));
        System.out.println(country.size());
        System.out.println(country);

        for (String c : country.keySet()){
            System.out.println(c);
        }

        for (String c : country.values()){
            System.out.println(c);
        }
    }
}
