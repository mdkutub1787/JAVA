
package OOPExercise2;

/**
 * @author MD KUTUB UDDIN
 */
public class OOPExerciseTest2 {
    public static void main(String[] args) {
        
        Dog d1=new Dog("Buddy", "Golden Retriever");
        Dog d2=new Dog("Charlie", "Golden Bulldog");
//      
        
        
        d1.getDog();
        
        System.out.println(d1.getName() + " is a "+ d1.getBreed() );
        System.out.println(d2.getName() + " is a "+ d2.getBreed() );
        
    }
}
