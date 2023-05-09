package homeWorkMay;

public class HW16Class2 {

    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name
     */
    private static String vowels(String str) {
        StringBuilder resultString = new StringBuilder();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                resultString.append(str.charAt(i));
            }
        }
        return resultString.toString();
    }
    public static void main(String[] args) {

        System.out.println(vowels("happy friday! i love weekends"));
    }
}
