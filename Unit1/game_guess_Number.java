import java.util.Scanner;

public class game_guess_Number {
    public static void main(String[] args) {
        int maxScore = 0;
        int yourScore;
        Scanner sc = new Scanner(System.in);
        int randomValue = (int)(Math.random()*100);
        int guess = 0;
        boolean result;
        String choice = "y";
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.println();
            System.out.println("-----Welcome to Guess and Win game-----");
            System.out.println();
            System.out.println("You can choose numbers between 1 and 100.");
            System.out.print("Enter your guess:\t\t");
            guess = sc.nextInt();
            result = true;
            yourScore = 10;
            while (result) {
                if(yourScore > 1)
                {
                    if(guess > randomValue){
                        System.out.println("-----Enter smaller number-----");
                        guess = sc.nextInt();
                        yourScore--;

                    }
                    else if(guess < randomValue){
                        System.out.println("-----Enter larger number----");
                        guess = sc.nextInt();
                        yourScore--;
                    }
                    else{
                        System.out.println();
                        System.out.println("-------------------------------------------------");
                        System.out.println("\tCongratulations, You won the game");
                        System.out.println("\t\tYour Score is " + yourScore);
                        if(yourScore > maxScore){
                            maxScore = yourScore;
                            System.out.println("\t----------Highest Score Recorded--------");
                            System.out.println();
                        }
                        System.out.println("-------------------------------------------------");
                        System.out.println();
                        result = false;
                    }
                }
                else
                {
                    result = false;
                    System.out.println();
                    System.out.println("\n\nSorry ! You lost the match.... ");
                    System.out.println();
                }               
            }
            sc.nextLine();
            System.out.println("Do you want to play again?");
            System.out.println("Press and enter y to continue and press any other key to exit..............");
            choice = sc.nextLine();
        }
        System.out.println();
        System.out.println("Exiting from game................");
        System.out.println();
    }
}
    

