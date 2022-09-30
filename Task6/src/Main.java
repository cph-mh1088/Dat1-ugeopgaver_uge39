import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cafe cafe = new Cafe(); //create a cafe object
        cafe.loadMenuData(); //Call the loadMenuData method

        System.out.println(cafe.coffeeMenu); //not quite right.

        }

    }
