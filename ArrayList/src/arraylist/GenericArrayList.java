
package arraylist;

public class GenericArrayList <T>{
     private T t;

    public GenericArrayList() {
    }

    public GenericArrayList(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericArrayList{" + "t=" + t + '}';
    }

       
}
