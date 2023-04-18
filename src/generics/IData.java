package generics;

public class IData <T> {
    public boolean insert(T data){
        System.out.println("Data is inserted");
        return true;
    }

    public boolean delete(T data){
        System.out.println("Data is deleted");
        return true;
    }

}
