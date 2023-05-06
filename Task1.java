package homeWork16;

public class Task1 {
    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.*? */
    public String reverse(String s){

        String rev=" ";
        for (int i = s.length()-1; i>=0 ; i--) {
            rev=rev+s.charAt(i);

        }
        return rev;
    }

}
