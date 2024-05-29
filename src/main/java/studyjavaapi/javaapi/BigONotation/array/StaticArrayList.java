package studyjavaapi.javaapi.BigONotation.array;

import java.util.Arrays;


public class StaticArrayList {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] arrays;

    private int size = 0;

    //고정
    public StaticArrayList() {
        arrays = new Object[DEFAULT_CAPACITY];
    }

    //가변
    public StaticArrayList(int initialCapacity) {
        arrays = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object element) {
        arrays[size] = element;
        size++;
    }

    public Object get(int index) {
        return arrays[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        arrays[index] = element;
        return oldValue;
    }

    public int find(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(arrays[i])) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        return  " arrays = " + Arrays.toString(arrays) +
                " size = " + size +
                " capacity = " + DEFAULT_CAPACITY +
                '}';
    }
}
