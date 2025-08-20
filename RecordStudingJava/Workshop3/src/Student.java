public class Student {
    private final String name;
    public final int studentNumber;
    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }
    public String getName() {
        return name;
    }
    /*
    public void setName(String name) {
    this.name = name;
    } Cant use the Setter
    */
}