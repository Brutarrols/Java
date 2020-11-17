import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Hammer Smashed Face", "Cannibal Corpses");
        trackList.put("Mutant Chist", "Cryptopsy");
        trackList.put("Seven Tears are flowing to the river", "Nargaroth");
        trackList.put("Remnants of Divination", "Monstrosity");
        
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key+" - "+ trackList.get(key));
        }
    }
}