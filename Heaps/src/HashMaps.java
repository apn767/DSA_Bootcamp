import java.util.HashMap;
import java.util.HashSet;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map  = new HashMap<>();
        map.put("alok", 65);
        map.put("amartya", 87);
        map.put("sanjeet", 85);
//        System.out.println(map.get("sanjeet"));
//        System.out.println(map.getOrDefault("hello", -1));
        System.out.println(map.containsKey("sanjeet"));
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(23);
        set.add(56);
        set.add(32);
        set.add(2);
        System.out.println(set);

    }
}
