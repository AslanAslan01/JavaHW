package homeWorkMay;

public class Students {

    private String name;
    private int studentID;
    private static int numOfStud = 0;

    public Students(String name, int ID) {
        this.name = name;
        this.studentID = ID;
        numOfStud++;
    }

    public static void main(String[] args) {
        Students student1 = new Students("John", 1);
        Students student2 = new Students("Emma", 2);
        Students student3 = new Students("Michael", 3);

        System.out.println("Total number of students: " + numOfStud);
    }
}
