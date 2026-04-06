package Strings;

public class ImmutableString {
    public static void main(String[] args) {
        String S = "hello ";

        // Attempting to append the String using "concat()" 
        S.concat("World");
        System.out.println(S); // This will print "Hello" only as String are immutable
        
        // Using "concat()" method in right way to append a String
        S = S.concat("World");
        System.out.println(S);
    }

    
}
