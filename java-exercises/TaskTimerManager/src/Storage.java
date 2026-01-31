import java.util.Collection;
import java.util.HashMap;

public class Storage <T>{

    HashMap<Integer, T> items = new HashMap<>();

    void add(int id, T item){
        items.put(id, item);
    }
    void remove(int id){
        items.remove(id);
    }
    public T get(int id){
        return items.get(id);
    }
    Collection<T> getAll(){
        return items.values();
    }

}
