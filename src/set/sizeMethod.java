package set;
import java.util.*;

public class sizeMethod
{
        public static void main(String args[])
        {
            Set<Integer> data = new LinkedHashSet<Integer>();
            data.add(45);
            data.add(24);
            data.add(76);
            data.add(55);
            data.add(97);
            data.add(25);
            System.out.println("data: " + data);

            System.out.println("size of the data is : " + data.size());
        }
    }

