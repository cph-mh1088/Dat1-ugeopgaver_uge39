import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Create an ArrayList<String> called "actions".initialize the Arraylist
        ArrayList<String> actions = new ArrayList<>(Arrays.asList("1) Start game", "2) Resume game", "3) Pause game", "4) End game"));

        //System.out.println((actions.get(2))); //Used to test actions. Works fine.


        //Create an object of Menu with actions as the argument.
        Menu menu = new Menu(actions);

    }

    private static void doAction(int action){
        if choice 
    }

}

/*
  4.h Create a method in the Main class, for testing that the user dialog in the Menu class works as expected (this method needs to be static).
  The method should have this signature: public static void doAction(int action). The int action parameter represents the user's choice of action.


 */