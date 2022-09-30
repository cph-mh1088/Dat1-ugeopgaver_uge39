import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    //attribute called coffeeMenu of type ArrayList<String>
    public static ArrayList<String>coffeeMenu = new ArrayList<>();

    //Add a method loadMenuData that loads the coffess.txt file.
    public static void loadMenuData (){
        File file = new File("coffees.txt"); //might not work. file needs to be outside of src???

        try {
            //making a Scanner object.
            Scanner scan = new Scanner(file);

            //Use a while loop with hasNextLine() on the Scanner instance
            //to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
            while (scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found. Check path and filename");
        }
    }
}
