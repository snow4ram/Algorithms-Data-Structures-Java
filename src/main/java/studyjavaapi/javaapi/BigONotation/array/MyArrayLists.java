package studyjavaapi.javaapi.BigONotation.array;

import java.util.Arrays;

public class MyArrayLists {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementList;

    private int size = 0;

    //고정
    public MyArrayLists() {
        elementList = new Object[DEFAULT_CAPACITY];
    }

    //가변
    public MyArrayLists(int initialCapacity) {
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

    public void move(int index, Object value) {

        if (size == elementList.length) {
            increaseArray();
        }
        System.out.println(size);
        // 요소들을 뒤로 이동
        for (int i = size; i > 0; i--) {
            elementList[i] = elementList[i - 1];
        }
        elementList[index] = value;

    }


    public Object swipeLeft(int index) {
        Object oldValue = get(index); //2: 20
        shiftLeftFrom(index);
        size--;
        elementList[size] = null;
        return oldValue;
    }

    public void swipeRight(int index , Object value) {
        if (size == elementList.length) {
            increaseArray();
        }
        swipeRightFrom(index);
        elementList[index] = value;
        size++;
    }
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            System.out.println(i);
            elementList[i] = elementList[i + 1];
            System.out.println(elementList[i]);
        }
    }


    private void swipeRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementList[i] = elementList[i - 1];
        }
        System.out.println(Arrays.toString(elementList));
    }

    public void swipeRightFrom2(int index) {
        for (int i = index; i < size; i++) {
            elementList[i] = elementList[size - i + 1];
            System.out.println((elementList[i]));
        }

        System.out.println(Arrays.toString(elementList));
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

    public Object set(int index, Object value) {
        Object oldValue = get(index);
        elementList[index] = value;
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
        return "elementList=" + Arrays.toString(elementList) +
                ", size=" + size;
    }
}
