package generics;

public class Student extends IData<String> {
    @Override
    public boolean insert(String data) {
        return super.insert(data);
    }

    @Override
    public boolean delete(String data) {
        return super.delete(data);
    }
}
