public class Pair <T, V> {
 private T first;
 private V second;

 public Pair(T first, V second){
     this.first = first;
     this.second = second;
 }
 public Pair(Pair<T,V> pair){
     this(pair.getFirst(), pair.getSecond());
 }
    public T getFirst() {
        return first;
    }
    public V getSecond() {
        return second;
    }

    public Pair<V, T> swap (){
     return new Pair<V,T>(getSecond(), getFirst());
    }
}

