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
        
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        Iterator entries = histogr.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            Integer key = (Integer)entry.getKey();
            
            System.out.println(key + "==>" + histogr.get(key));
        } 
    }
    
}
