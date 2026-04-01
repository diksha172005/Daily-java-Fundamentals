public class ControlStatement {
    public static void main(String[] args) {
        //if ststement.
        int number = 4;
        if(number > 0){
            System.out.println("the number is positive.");
        }
        // if-else statement.
        if(number%2 == 0){
            System.out.println("the number is even.");

        } else{
            System.out.println("the number is odd.");
        }
        //if-else-if Statement.
        if(number<0){
            System.out.println("the number is negative.");
        } else if(number == 0){
            System.out.println("the number is Zero.");
        } else{
            System.out.println("the number is positive.");
        }

        //Switch case
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;        
        
            default:
                System.out.println("Other day");
                break;
        }
        
    }
}
