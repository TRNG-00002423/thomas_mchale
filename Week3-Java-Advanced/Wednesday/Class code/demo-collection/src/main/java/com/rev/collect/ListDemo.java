
package com.rev.collect;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo 
{
    public static void main(String[] args) 
    {
        List<String> arrayList= new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add(1,"Pineapple");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("red");
        linkedList.add("Blue");
        linkedList.addFirst("Green");
        linkedList.addLast("Aqua");

        linkedList.add("elem");
        linkedList.set(0, "elem");
        linkedList.remove(0);
        linkedList.indexOf("Green");
        linkedList.size();
        linkedList.contains("Blue");
        linkedList.addAll(arrayList);
        linkedList.containsAll(arrayList);
        
        for (String element: linkedList)
        {
            System.out.print(element);
        }
    }
}
