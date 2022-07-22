package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseArraylist
{
        public static void reverse(List<String> l)
        {

            System.out.println("Before Reversing");
            System.out.println(l.toString());

            Collections.reverse(l);
            System.out.println("After Reversing");
            System.out.println(l);
        }
}

