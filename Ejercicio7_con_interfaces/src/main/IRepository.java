package main;

public interface IRepository<T> {
    boolean addObj(T object);
    void editObj(int position, T object);
    void removeObj(T object);
    T getObj(int position);
    int findObj(T object);
    T[] findAllObj();
    T[] findObjByName(String name);
    T[] findObjByCode(char character);
}
