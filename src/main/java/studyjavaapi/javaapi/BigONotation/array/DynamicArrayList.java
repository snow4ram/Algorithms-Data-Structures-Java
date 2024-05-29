package studyjavaapi.javaapi.BigONotation.array;

import java.util.Arrays;

public class DynamicArrayList {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementList;

    private int size = 0;

    //고정
    public DynamicArrayList() {
        elementList = new Object[DEFAULT_CAPACITY];
    }

    //가변
    public DynamicArrayList(int initialCapacity) {
        elementList = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object element) {
        if (size == elementList.length) {
            increaseArray();
        }
        elementList[size] = element;
        size++;
    }

    public void increaseArray() {
        int oldListLength = elementList.length;
        int newListLength = oldListLength * 2;
        Object[] objects = new Object[newListLength];

        System.arraycopy(elementList, 0, objects, 0, elementList.length);

        elementList = objects;
    }

    public Object get(int index) {
        return elementList[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementList[index] = element;
        return oldValue;
    }

    public int find(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(elementList[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return  "elementList=" + Arrays.toString(elementList) +
                ", size=" + size +
                ", DEFAULT_CAPACITY=" + DEFAULT_CAPACITY ;
    }
}
