package com.fluency;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //This block of code will capture the number of the collection test to run.
        Pattern pattern = Pattern.compile("([1-3])");
        Matcher matcher;
        boolean matchResult;
        do {
            System.out.format("\nChoose menu item:\n\t1) Collections Demo\n\t2) Threads Demo\n\t3) Quit: ");
            @SuppressWarnings("resource")
            Scanner in = new Scanner (System.in);
            String input=in.nextLine();
            matcher = pattern.matcher(input);
            matchResult=matcher.find();
            if (!matchResult)
                System.out.println("Invalid value provided.");
            else
                switch (Integer.parseInt(matcher.group(1))) {
                    case 1:  RunCollectionsDemo(); break;
                    case 2:  RunThreadsDemo(); break;
                    case 3:  System.out.println ("Program terminated."); return;
                }
        }
        while (!matchResult || Integer.parseInt(matcher.group(1))<7);
    }

    public static void RunCollectionsDemo() {
    com.fluency.CollectionsDemo c = new com.fluency.CollectionsDemo();

    //This block of code will capture the number of the collection test to run.
    Pattern pattern = Pattern.compile("([1-7])");
    Matcher matcher;
    boolean matchResult;
        do {
        System.out.format("\nChoose menu item:\n\t1) List Demo\n\t2) Hash Set Demo\n\t3) TreeSet Demo\n\t4) Map Demo\n\t5) FIFO Queue Demo\n\t6) LIFO Queue Demo (Linked List)\n\t7) Main Menu: ");
        @SuppressWarnings("resource")
        Scanner in = new Scanner (System.in);
        String input=in.nextLine();
        matcher = pattern.matcher(input);
        matchResult=matcher.find();
        if (!matchResult)
            System.out.println("Invalid value provided.");
        else
            switch (Integer.parseInt(matcher.group(1))) {
                case 1: c.DemoList(); break;
                case 2: c.DemoHashSet(); break;
                case 3: c.DemoTreeSet(); break;
                case 4: c.DemoMap(); break;
                case 5: c.DemoQueueFIFO(); break;
                case 6: c.DemoQueueLIFO(); break;
                case 7: System.out.println ("Program terminated."); return;
            }
    }
        while (!matchResult || Integer.parseInt(matcher.group(1))<7);
}

    public static void RunThreadsDemo() {
        com.fluency.ThreadsDemo t = new com.fluency.ThreadsDemo();

        //This block of code will capture the number of the collection test to run.
        Pattern pattern = Pattern.compile("([1-4])");
        Matcher matcher;
        boolean matchResult;
        do {
            System.out.format("\nChoose menu item:\n\t1) Start simple threads\n\t2) Executors Demo\n\t3) Atomicity Demo\n\t4) Main Menu: ");
            @SuppressWarnings("resource")
            Scanner in = new Scanner (System.in);
            String input=in.nextLine();
            matcher = pattern.matcher(input);
            matchResult=matcher.find();
            if (!matchResult)
                System.out.println("Invalid value provided.");
            else
                switch (Integer.parseInt(matcher.group(1))) {
                    case 1: t.startThreads(); break;
                    case 2: t.startThreadsES(); break;
                    case 3: t.startThreadsRandom(); break;
                    case 4: System.out.println ("Program terminated."); return;
                }
        }
        while (!matchResult || Integer.parseInt(matcher.group(1))<7);
    }
}
