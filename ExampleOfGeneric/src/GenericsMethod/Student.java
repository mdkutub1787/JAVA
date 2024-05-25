package GenericsMethod;

public class Student<N, I, A> {

    private N name;
    private I id;
    private A age;

    public Student() {
    }

    public Student(N name, I id, A age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
    }

}
