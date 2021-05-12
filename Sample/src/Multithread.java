import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
class Multithread {
    
	public static void main(String[] args) {
		String message = "Hello";
		print(message);
		message += "World!";
		print(message);
	}
	static void print(String message){
		System.out.print(message);
		message += " ";
	}
}