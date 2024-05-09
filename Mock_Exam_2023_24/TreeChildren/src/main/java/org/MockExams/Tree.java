package org.MockExams;

import java.util.ArrayList;
import java.util.List;

public class Tree <A>{
    private A name;


    private List<Tree<A>> children; // a list that contains element of type Tree<A>

    public Tree(A name, List<Tree<A>> children) {
        this.name = name;
        this.children = new ArrayList<>(children);
    }
    public Tree(A name) { // creates a leaf (a tree without children)
        this(name, List.of());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Person: ").append(name).append("\n");
        for (Tree<A> child : children) {
            stringBuilder.append(child.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

}

