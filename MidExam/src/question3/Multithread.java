
package question3;


public class Multithread {
    
public static void main(String[] args)
    {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object= new MultithreadingDemo();
            object.run();
        }
    }
}