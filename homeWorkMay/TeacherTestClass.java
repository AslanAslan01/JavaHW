package homeWorkMay;

public class TeacherTestClass {
    public static void main(String[] args) {

        PianoTeacher tom = new PianoTeacher();
        tom.name = "Tom Snow";
        tom.age = 33;
        tom.gender = 'M';
        tom.salary = 100000;
        tom.endTeaching();
        tom.sayGoodbue();

        MathTeacher joan = new MathTeacher();
        joan.name = "Joan Smith";
        joan.age = 27;
        joan.gender = 'F';
        joan.salary = 110000;
        joan.startTeaching();
        joan.giveHW();

        ChemistryTeacher sam = new ChemistryTeacher();
        sam.name = "Sam White";
        sam.age = 40;
        sam.gender = 'M';
        sam.salary = 105000;
        sam.startTeaching();
        sam.endTeaching();
    }
}