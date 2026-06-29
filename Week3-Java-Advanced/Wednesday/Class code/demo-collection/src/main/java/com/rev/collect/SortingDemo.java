package com.rev.collect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo 
{
    public static void main(String[] args) 
    {
        List<String> names= new ArrayList<>();
        names.add("Jim");
        names.add("Anuha");
        names.add("Utsav");
        names.add("Benson");
        
        System.out.println(names);

        Collections.sort(names);

        System.out.print(names);
    }
}
