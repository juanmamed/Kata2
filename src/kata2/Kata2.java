package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int data[] = new int[15];
       
        for (int j = 0; j < data.length; j++) {
            data[j] = j;
        }
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
                      
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        Iterator entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            Integer key = (Integer)entry.getKey();
            
            System.out.println(key + "==>" + histogram.get(key));
        } 
    }
    
}
