package Strings;

import java.util.StringTokenizer;

public class StrTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello, how are you");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }    
}
