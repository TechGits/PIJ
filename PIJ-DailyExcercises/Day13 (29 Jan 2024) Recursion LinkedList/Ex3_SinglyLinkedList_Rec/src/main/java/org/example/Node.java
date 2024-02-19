package org.example;

/**
 * Ommitted 'public' modifier.
 * This makes it package-private access, meaning it's accessible
 * only within the same package.
 *
 *
 * @param <E>
 */
class Node <E>{
    /** The payload of this node. May be null */
    private E data;

    private Node<E> next;

    public Node(E data, Node<E> next){
        this.data = data;
        this.next = next;
    }

    public Node (E data) { // for nodes without a next node
        this(data, null);
    }


}
