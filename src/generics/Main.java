package generics;

public class Main {
    public static void main(String[] args) {

        Integer[] arr={23,14,85,24,97};

        System.out.println(Method.ArrayContain(arr,15));
        System.out.println(Method.ArrayContain(arr,23));

        Student st= new Student();
        st.insert("adf");
    }
}
