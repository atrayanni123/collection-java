package list;
import java.util.*;

public class arrayList
{
        public static void main(String args[])
        {

            List<String> list=new ArrayList<String>();

            list.add("Banana");
            list.add("Apple");
            list.add("Orange");
            list.add("Date");

            for(String fruit:list)
                System.out.println(fruit);

        }
    }

