public class Operators {

    public static void main(String[] args) {
        //Arithmaic operators
        int a = 10;
        int b = 3;
        System.out.println("a+b = " +(a+b));
        System.out.println("a>b" +(a>b)); 
        //relational operators
        boolean x = true, y = false;
        System.out.println("x&&y = " +(x&&y)); //Loical AND
        a+=5; //assignment.
        System.out.println("a after + =5:" +a);
        int max = (a>b)? a:b; //ternary.
        System.out.println("Maximum = " +max );

    }
}

