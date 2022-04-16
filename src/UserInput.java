import java.util.Scanner;

public class UserInput {

    public static void main(String[] args)  {

        String startMessage;
        startMessage = "Welcome! ";
        System.out.println(startMessage);


        Scanner userInput = new Scanner(System.in) ;

        String name = "";
        int age = 0;

        System.out.print ("Enter age: ") ;

        age = userInput.nextInt () ;

        System.out.println ("You are") ;

        System.out.println (age) ;




    }


}
