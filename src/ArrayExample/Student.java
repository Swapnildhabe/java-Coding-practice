package ArrayExample;

public class Student {
    private int rollNumber;
    private String name;

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
}
