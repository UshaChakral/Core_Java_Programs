/*2.Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.*/

package Core_Java;

import java.util.ArrayDeque;

public class BookQueue { //Defining a class named BookQueue
	
    public static void main(String[] args) {
    	
        // Create an ArrayDeque to store book names
        ArrayDeque<String> bookQueue = new ArrayDeque<String>();

        // Add books to both ends of the deque
        bookQueue.addFirst("The Midnight Library (2020)");  
        bookQueue.addLast("Project Hail Mary (2021)");       
        bookQueue.addFirst("Klara and the Sun (2021)");     
        bookQueue.addLast("The Invisible Life of Addie LaRue (2020)");  

        // Print the queue after adding books
        System.out.println("Books in the queue: " + bookQueue);

        // Remove a book from the front of the deque
        String removedFromFront = bookQueue.removeFirst();
        System.out.println("\nRemoved from front: " + removedFromFront);

        // Remove a book from the rear of the deque
        String removedFromRear = bookQueue.removeLast();
        System.out.println("Removed from rear: " + removedFromRear);

        // Print the queue after removals
        System.out.println("\nRemaining books in the queue: " + bookQueue);
    }
}

//Output
/*
Books in the queue: [Klara and the Sun (2021), The Midnight Library (2020), Project Hail Mary (2021), The Invisible Life of Addie LaRue (2020)]

Removed from front: Klara and the Sun (2021)
Removed from rear: The Invisible Life of Addie LaRue (2020)

Remaining books in the queue: [The Midnight Library (2020), Project Hail Mary (2021)]
*/