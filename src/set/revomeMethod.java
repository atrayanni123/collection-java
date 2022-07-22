package set;
import java.util.*;

public class revomeMethod
{
        public static void main(String args[])
        {
            Set<Integer> data = new LinkedHashSet<Integer>();
            data.add(11);
            data.add(40);
            data.add(46);
            data.add(59);
            data.add(33);
            data.add(70);
            System.out.println("data: " + data);

            data.remove(46);
            data.remove(59);
            data.remove(11);
            System.out.println("data after removing elements: " + data);
        }
    }

