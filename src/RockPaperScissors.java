import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //declare scanner and string variables
        Scanner scanner = new Scanner(System.in);
        String playerA, playerB, playAgain;

        //get input from players
        do{
            playerA = getPlayerChoice(scanner, "A");
            playerB = getPlayerChoice(scanner, "B");

            //print outcome
            System.out.println(determineOutcome(playerA, playerB));

            //ask if user wants to play again
            System.out.print("Would you like to play again? [Y/N]");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("Y"));
    }


    //logic for player choice
    private static String getPlayerChoice(Scanner scanner, String player) {
        //declare variable for players choice
        String choice;
        //logic for rock paper scissors
        do {
            System.out.print("Player "+ player + ", enter your move (R, P, S): ");
            choice = scanner.next().toUpperCase();
        } while (!choice.equals("R") && !choice.equals("P") && !choice.equals("S"));
        //return players choice
        return choice;
        
    }
    //logic to determine who is winner
    private static String determineOutcome(String a, String b) {
        if (a.equals(b)) {
            return a + " vs " + b + " its a tie!";
        } else if ((a.equals("R") && b.equals("S")) || (a.equals("S") && b.equals("P")) || (a.equals("P") && b.equals("R"))) {
            return getResult(a) + " Player A wins!";
        } else {
            return getResult(b) + "Player B wins!";
        }
    }

    //logic to output winning hands
    private static String getResult(String move) {
        switch (move) {
            case "R":
                return "Rock breaks Scissors,";
            case "P":
                return "Paper covers Rock,";
            case "S":
                return "Scissors cuts Paper,";
            default:
                return "";
        }
    }    
}

