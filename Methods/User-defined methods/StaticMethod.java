class Test {
    static void hello(){
        System.out.println("Hello world");
    }    
}

public class StaticMethod{
    public static void main(String[] args) {
        // Calling the static method without creating an instance of the class
        Test.hello();
    }
}
