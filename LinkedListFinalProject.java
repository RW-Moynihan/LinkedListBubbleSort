//Will Moynihan
//S02331452
 import java.lang.StringBuilder;
 import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LinkedListFinalProject {//Start LinkedListFinalProject Parent Class
	
	public static void main(String[] args)
    {
        // creating new LinkedList
        LinkedList mainList=null;

        //Reading data from names.txt
        try
        {
            File names = new File("names.txt");
            Scanner scnr = new Scanner(names);

            while(scnr.hasNext())
            {
                String line = scnr.nextLine();
                String[] parts = line.split(",");
                Student newStudent = new Student(parts[1],parts[0]);
                Node newNode = new Node(newStudent);

                if(mainList == null)
                {
                    mainList = new LinkedList(newNode);
                }
                else
                {
                    mainList.addNode(newNode);
                }
            }

            // closing scanner
            scnr.close();
        }
        catch(Exception e)
        {
            // error reading file
            System.out.println("Error Reading File or other issue with File IO");
            System.out.println(e.toString());
        }

        // printing out linked list
        System.out.println(mainList);

        // sort linked list
        mainList.bubbleSort();

        System.out.println("-----------------------------------");
        System.out.println("AfterSort");;
        System.out.println("-----------------------------------\n");
        
        // print out mainList again to verify it is sorted
        System.out.println(mainList);
        
        // print out indication that the program made it to the end and it is done!
        System.out.println("Done");

    }// end main()

   
} // End LinkedListFinalProject Parent Class
