package exam2.models;

import java.util.HashMap;
import java.util.Map;

public class TwoWays {
    Map<Integer,String> array = new HashMap<Integer,String>();
    TwoWays next;

    public TwoWays(Map<Integer, String> array) {
        this.array = array;
    }
}
