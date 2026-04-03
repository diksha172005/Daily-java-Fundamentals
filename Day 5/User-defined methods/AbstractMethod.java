abstract class AbsMethod {
    abstract void check(String name); // Abstract method
}

public class AbstractMethod extends AbsMethod{
    @Override
    void check(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        AbstractMethod obj = new AbstractMethod();
        obj.check("Hello World");
    }
}
