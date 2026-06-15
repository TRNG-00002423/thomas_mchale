import java.util.Scanner;

/**
 * Week 2 Exercise — menu-driven console (implement the menu loop).
 *
 * Compile: javac TicketMenu.java
 * Run:     java TicketMenu
 */
public class TicketMenu {

    public static void main(String[] args) {
        String[] tickets = {"BUG-101 Login timeout", "BUG-102 CSV import", "BUG-103 flaky assertion"};
        int[] priorities = {2, 2, 2}; // stretch: update in menu option 2

        try (Scanner in = new Scanner(System.in)) {
            // TODO: loop until quit
            // print menu: 1=list 2=set priority 3=summary 4=quit

            boolean moreToDo = true;
            while (moreToDo) 
            { 
                try 
                {
                    System.out.println("Pick 1, 2, 3, or 4 to quit");
                    int curOperation = Integer.parseInt(in.nextLine());
                    switch (curOperation) {
                        case 1:
                            System.out.println("BUG-101 Login timeout, BUG-102 CSV import, BUG-103 flaky assertion");
                            break;
                        case 2:
                            System.out.println("What is the index?");
                            int curIndex = Integer.parseInt(in.nextLine());
                            System.out.println("What is the priority?");
                            int curPriority = Integer.parseInt(in.nextLine());
                            if (curPriority >= 1 && curPriority <= 3)
                            {
                                tickets[curIndex] = "New ticket";
                                priorities[curIndex] = curPriority;
                            }
                            break;
                        case 3:
                            String result = (tickets.length<2) ? "%d ticket\n" : "%d tickets\n";
                            System.out.printf(result, tickets.length);
                            break;
                        case 4:
                            moreToDo = false;
                            break;

                    }
                } 
                catch (Exception e) 
                {
                    System.out.println(e);
                }
            }
        }
    }
}
