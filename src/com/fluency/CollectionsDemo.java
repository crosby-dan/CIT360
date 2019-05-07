package com.fluency;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class CollectionsDemo {
    Character[] appleJacks = { 'A', 'P', 'P', 'L', 'E', ' ', 'J', 'A', 'C', 'K', 'S' };

    public void DemoList() {
        System.out.println("***************************************");
        System.out.println("**  Java Collections Demonstration  ***");
        System.out.println("**            By Dan Crosby         ***");
        System.out.println("***************************************");
        System.out.println("For purposes of this demonstration, we have defined a list of characters containing the following values:");
        System.out.println(Arrays.toString(appleJacks));
        Util.promptEnterKey();

        System.out.println("******************************************************************************");
        System.out.println("**\tA List is a simple collection.");
        System.out.println("**\t\t1) Duplicates are allowed.");
        System.out.println("**\t\t2) List items are not sorted.");
        System.out.println("**\t\t3) List items can be indexed by item number.");
        System.out.println("******************************************************************************");

        ArrayList listDemo = new ArrayList (appleJacks.length);
        for (int i=0;i<appleJacks.length;i++) {
           listDemo.add(appleJacks[i]);
        }
        System.out.format("LIST RESULT:  Using a for loop and .add on the ArrayList, the character array %s has now been copied.", Arrays.toString(appleJacks));
        System.out.format("Here is the resulting ArrayList (listDemo): %s\n",listDemo.toString());
        System.out.println("Point 1) Because duplicates are allowed, the finished list contains 2 A's and 2 P's.");
        System.out.println("Point 2) The list has not been automatically sorted");
        System.out.println("Point 3) We can access the array list using an iterator.");
        System.out.format("\tExample 3a:  listDemo.get(0)=%s\n",listDemo.get(0));
        System.out.format("\tExample 3b:  listDemo.get(4)=%s\n",listDemo.get(4));
        System.out.format("\tExample 3c:  listDemo.get(6)=%s\n",listDemo.get(6));
        Util.promptEnterKey();

    }

    public void DemoSet() {
        System.out.println("\n\n\n\n\n\n******************************************************************************");
        System.out.println("**\tA HashSet organizes elements by value and cannot be used to reconstruct the original list.");
        System.out.println("**\t\t1) Duplicates are removed or not retained.");
        System.out.println("**\t\t2) Set items ARE sorted (in a TreeSet, but not in a HashSet).");
        System.out.println("**\t\t3) Set items are accessed by value rather than iteration index.");
        System.out.println("******************************************************************************");
        TreeSet setDemo = new TreeSet();
        for (int i=0;i<appleJacks.length;i++) {
            setDemo.add(appleJacks[i]);
        }
        System.out.println("SET RESULT:  Using a for loop and .add on the ArrayList, the character array %s has now been copied.");
        System.out.format("Here is the resulting ArrayList (appleJacks): %s\n",setDemo.toString());
        System.out.println("Point 1) Because duplicates are NOT allowed, the finished list does not contain 2 A's or 2 P's.");
        System.out.println("Point 2) The list has been automatically sorted, with the space between APPLE JACKS coming first.");
        System.out.println("Point 3) We can check for elements in the set by using .contains.");
        System.out.format("\tExample 3a:  setDemo.contains('A')=%s\n",setDemo.contains("A".charAt(0)));
        System.out.format("\tExample 3b:  setDemo.contains('J')=%s\n",setDemo.contains("J".charAt(0)));
        System.out.format("\tExample 3c:  setDemo.contains('X')=%s\n",setDemo.contains("X".charAt(0)));
        Util.promptEnterKey();
    }

    public void DemoMap() {
        System.out.println("\n\n\n\n\n\n******************************************************************************");
        System.out.println("**\tA TreeMap or HashMap organizes elements by value pair.");
        System.out.println("**\t\t1) All key values must be unqiue for a given value.");
        System.out.println("**\t\t2) Map items ARE sorted (in a TreeMap, but not in a HashMap).");
        System.out.println("**\t\t3) Map items are accessed by key rather than iteration index.");
        System.out.println("******************************************************************************");
        TreeMap<Integer,String> mapDemo = new TreeMap<>();

        mapDemo.put(1,"Dan");
        mapDemo.put(2,"Steve");
        mapDemo.put(3,"Stacie");

        System.out.println("TREEMAP RESULT:  Using mapDemo.add(key,value), we now have a map demo object containing 3 employee ID's and names.");
        System.out.format("Here is the resulting treeMap: %s\n",mapDemo.toString());
        System.out.format("\tExample 1a:  Showing name of employee 1 using mapDemo.get(1)=%s\n",mapDemo.get(1));
        System.out.format("\tExample 1b:  Showing name of employee 2 using mapDemo.get(2)=%s\n",mapDemo.get(2));
        System.out.format("\tExample 1c:  Showing name of employee 3 using mapDemo.get(3)=%s\n",mapDemo.get(3));

        Util.promptEnterKey();
    }

    public void DemoQueue() {
        System.out.println("\n\n\n\n\n\n******************************************************************************");
        System.out.println("**\tA queue can be used to manage items in a FIFO or LIFO fashion.");
        System.out.println("**\t\t1) Uniqueness is not enforced.");
        System.out.println("**\t\t2) Items are sorted only by the sequence in which they are added to the queue.");
        System.out.println("**\t\t3) Only the first or last items in the queue are readily accessed (when they are also removed)");
        System.out.println("******************************************************************************");
        Queue<String> queueDemo = new Queue<>();

        queueDemo.add("Dan");
        mapDemo.put(2,"Steve");
        mapDemo.put(3,"Stacie");

        System.out.println("TREEMAP RESULT:  Using mapDemo.add(key,value), we now have a map demo object containing 3 employee ID's and names.");
        System.out.format("Here is the resulting ArrayList (appleJacks): %s\n",mapDemo.toString());
        System.out.format("\tExample 1a:  Showing name of employee 1 using mapDemo.get(1)=%s\n",mapDemo.get(1));
        System.out.format("\tExample 1b:  Showing name of employee 2 using mapDemo.get(2)=%s\n",mapDemo.get(2));
        System.out.format("\tExample 1c:  Showing name of employee 3 using mapDemo.get(3)=%s\n",mapDemo.get(3));

        Util.promptEnterKey();
    }


}
