package chapter22_collection.mapinterface;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class IterationDemo
{
    public static void main(String[] arg)
    {
        Map<String,String> obj = new HashMap<String,String>();

        // enter name/url pair
        obj.put("GFG", "geeksforgeeks.org");
        obj.put("Practice", "practice.geeksforgeeks.org");
        obj.put("Code", "code.geeksforgeeks.org");
        obj.put("Quiz", "quiz.geeksforgeeks.org");
        // using iterators
        Iterator<Map.Entry<String, String>> itr = obj.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}