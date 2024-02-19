package org.example;
import java.util.List;

public class SimpleLinkedList <E> implements SimpleList <E>{

private Node<E> head;

    @Override
    public boolean isEmpty() {
        return this.head==null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int index) {
        if (this.isEmpty()){
            throw new IllegalArgumentException("Cannot get anything from an empty list");
        }
        return this.head.get(index);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public List<E> toList() {
        return null;
    }
}
