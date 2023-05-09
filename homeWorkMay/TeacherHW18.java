package homeWorkMay;

public class TeacherHW18 {
        /*
    task: Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
     */

    String name;
    int age;
    char gender;
    int salary;

    void startTeaching(){
        System.out.println(name+" started the class");
    }
    void endTeaching(){
        System.out.println(name + " finished the lesson");
    }
    void giveHW(){
        System.out.println(name + " gives homework");
    }
    void sayGoodbue(){
        System.out.println(name +" says goodbye to the students");
    }




}










