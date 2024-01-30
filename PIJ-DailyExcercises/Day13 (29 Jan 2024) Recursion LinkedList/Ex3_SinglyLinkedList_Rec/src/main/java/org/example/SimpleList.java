package org.example;

import java.util.List;

public interface SimpleList <E>{

   boolean isEmpty();

   int size();

   E get(int index);

   boolean contains(Object o);

   int indexOf(Object o);

   void clear();

   E set(int index, E element);

   void add(int index, E element);

   E remove(int index);

   String toString();

   List<E> toList();

}
