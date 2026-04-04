abstract class AbstractMethod {
    abstract void check(String name); // Abstract method
}

public class AbsMethod extends AbstractMethod{
    @Override
    void check(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        AbsMethod obj = new AbsMethod();
        obj.check("Hello World");
    }
}
