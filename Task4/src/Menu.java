import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {



    //4.a: private field/ variable "options" of the type ArrayList<String>
    private static ArrayList<String> options = new ArrayList<>();

    //Add a constructor with a parameter of type ArrayList. Assign the value received, to the options field.
    Menu (ArrayList<String> options){
        this.options = options;
    }

    //Method that printes each element in the options ArrayList.
     private static String showMenu(){

        //Create a Scanner object that takes System.in. Declare a String "choice" and assign it user input.
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        System.out.println("Type a number to choose");
        for (int i = 0; i < options.size(); i++){
            System.out.println(options);
        }
        // Let the showMenu method return the user's choice (as a String)
        return choice;



     }

/*



 */


}
