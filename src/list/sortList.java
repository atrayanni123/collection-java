package list;
import java.util.*;

public class sortList
{
        public static void sort(List<Integer> list1)
        {


            Collections.sort(list1);
            for(Integer fruit:list1)
                System.out.println(fruit);

            System.out.println("Sorting numbers...");

            List<Integer> list2=new ArrayList<Integer>();
            list2.add(21);
            list2.add(11);
            list2.add(51);
            list2.add(1);

            Collections.sort(list2);
            for(Integer number:list2)
                System.out.println(number);
        }

    }

