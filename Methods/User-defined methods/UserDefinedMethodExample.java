public class UserDefinedMethodExample {
    void hello(){
        System.out.println("This is a user defined method");
    }
    
    public static void main(String[] args) {
        UserDefinedMethodExample obj = new UserDefinedMethodExample(); // Creating object
        obj.hello(); // Calling method
    }
}
