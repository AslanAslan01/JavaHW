package homeWorkMay;

public class HW16Class1 {

    public static String reversedStr(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversedStr("Hello World"));
    }
}
