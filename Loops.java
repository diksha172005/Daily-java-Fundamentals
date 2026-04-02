public class Loops {
    public static void main(String[] args) {
        //For Loop.
        System.out.println("For Loop:");
        for(int i = 1; i <=5; i++){
            System.out.println("i =" +i);
        }
        //while Loop.
        System.out.println("While Loop:");
        int j = 1;
        while (j<=5) {
            System.out.println("j =" +j);
            j++;
            
        }       
        // Do While loop.
        System.out.println("Do-While Loop:");
        int k = 1;
        do{
            System.out.println("k = " +k);
            k++;
        } while(k <=5);
        //Enhanced for loop (For - each loop:)
        System.out.println("Enhanced for loop:");
        int[] numbers = {1,2,3,4,5,6};
        for(int num: numbers){
            System.out.println("num =" +num);
        }
    }
    
}
