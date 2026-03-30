public class Variables {

    int instanceVar = 10; //belongs to each obj.
    static String staticVar = "Im static";  //shared across all objects of the class
    public void showVariables(){
        int localVar = 5; //declared inside a method.
        System.out.println("Instance Variable :" +instanceVar);
        System.out.println("static Variable :" +staticVar);
        System.out.println("local Variable :" +localVar);
    
    }
    public static void main(String[] args) {
        //creating obj.
        Variables obj1 = new Variables();
        obj1.showVariables();
        System.out.println("Accessing Static Variables via class :" +Variables.staticVar);
    }
}
