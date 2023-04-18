package generics;

public class Method {

    public static  <T> boolean ArrayContain(T[] array,T elem){
        for (T i: array){
            if (i != null && i.equals(elem) )
                return true;
        }
            return false;
        }
    }

