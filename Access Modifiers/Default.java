class Car{
    String model; // default access
}

public class Default {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Toyota"; // accessible within the same package
        System.out.println("Car model: " + c.model);
    }
    
}
