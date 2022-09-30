import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please type your name"); //2.b

        Scanner scan = new Scanner(System.in); //2.c - create a Scanner object



        String name = scan.nextLine();// 2.d: Declare a String variable, name and assign the content of the Scanner.
        System.out.println(name);//2.e print the name variable

        System.out.println("Please type your age");//2.f

        int age = scan.nextInt();//2.g
        System.out.println(age);//2.h

        int result = 67 - age;
        System.out.println(result);

    }






}

