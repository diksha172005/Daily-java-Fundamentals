public class CallStack_Example {

    public static void D(){
        float d = 40.5f;
        System.out.println("In method D and value of d is: " +d); 
    }

    public static void C(){
        double c = 30.5;
        System.out.println("In method C and value of c is: " +c);
    }

    public static void B(){
        int b = 20;
        C(); // Calling method C()
        System.out.println("In method B and value of b is: " +b);
    }

    public static void A(){
        int a = 10;
        B(); // Calling method B()
        System.out.println("In method A and value of a is: " +a);
    }

    public static void main(String[] args){
        A(); // Starts with function A()
        D(); // Calling method D()
    }
}
