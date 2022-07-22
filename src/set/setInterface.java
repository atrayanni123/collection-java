package set;
import java.util.*;

public class setInterface
{

        public static void main(String[] args)
        {
            Set<String> hash_Set = new HashSet<String>();
            hash_Set.add("Anand");
            hash_Set.add("Aman");
            hash_Set.add("Rohit");
            hash_Set.add("Kamal");
            hash_Set.add("Shyam");
            hash_Set.add("Aman");
            hash_Set.add("Shyam");

            System.out.println(hash_Set);
        }
    }

