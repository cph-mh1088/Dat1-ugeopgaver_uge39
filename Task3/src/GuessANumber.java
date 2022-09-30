import java.util.Random;
import java.util.Scanner;


    public class GuessANumber {
        private static int rnd_number;


        public static void main(String[] args) {
            // pick a random number
            Random random = new Random();
            rnd_number = random.nextInt(100) + 1;
            System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
            System.out.println( "Can you guess what it is?...");
            makeAGuess();
        }


        private static void makeAGuess(){
            // Create a Scanner object
            // Read user input
            Scanner scanner = new Scanner(System.in);
            // Read user input




            //use hasNextInt to check if input is numeric,
            if (scanner.hasNextInt()){
                int num = scanner.nextInt();
                scanner.nextLine();
                // if so...

                //   Compare it with the random number

                System.out.println("Your number is:" +num);
                //   Let the user know the result of the comparison (was it the right number?)


                if (num == rnd_number){
                    System.out.println("Right guess");
                }
                else {

                    if (num < rnd_number){
                        System.out.println("Number is too low");
                    }
                    if (num > rnd_number){
                        System.out.println("Number is too high");
                    }



                    System.out.println("Wrong guess");
                    //calls the method again (recursion)
                    makeAGuess();


            }


                // if input was not numeric show an error message and call this method recursively

            } else {
                System.out.println("Error");
                makeAGuess();
            }





        }


    }


