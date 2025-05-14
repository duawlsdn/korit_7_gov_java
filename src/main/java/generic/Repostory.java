package generic;

import java.util.ArrayList;
import java.util.List;

public class Repostory {
    private List<Object> list;

    public Repostory() {
        list = new ArrayList<>();
    }

    public Object save(Object obj) {
        list.add(obj);
        return obj;
    }

    public List<Object> findAll() {
        return list;
    }
}
