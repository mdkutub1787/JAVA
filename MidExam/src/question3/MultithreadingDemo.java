
package question3;


public class MultithreadingDemo extends Multithread{
    
    
    public void run()
    {
        try {
            
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
           
            System.out.println("Exception is caught");
        }
    }

    
}

