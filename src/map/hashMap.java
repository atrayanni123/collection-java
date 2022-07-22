package map;
import java.util.*;



public class hashMap {

    public static int main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Orange", 20);
        map.put("Apple", 45);
        map.put("Date", 34);
        map.put("Grapes", 41);

//            System.out.println("Iterating Hashmap...");
//            for(Map.Entry m : map.entrySet()){
//                System.out.println(m.getKey()+" "+m.getValue());
//
        //       }
        System.out.println("Grapes count= " + map.get("Grapes"));
        System.out.println("Date count= " + map.get("Date"));

        Integer a = map.get("Grapes");
        System.out.println("value for key " + 10);
        return 0;
    }

}
