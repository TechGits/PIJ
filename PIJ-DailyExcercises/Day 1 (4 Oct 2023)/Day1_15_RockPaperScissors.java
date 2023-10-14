import java.util.Scanner;

public class Day1_15_RockPaperScissors {
    public static void main(String[] args) {
        RockPaperScissors instanceGame = new RockPaperScissors("P","R","S");

        instanceGame.whoWins();

    }
}

class RockPaperScissors {
    String P; String R; String S; int play1Count; int play2Count; String player1; String player2;
    public RockPaperScissors(String P, String R, String S) {

        this.P = P;
        this.R = R;
        this.S = S;
        this.player1 = player1;
        this.player2 = player2;

    }
    public void whoWins(){

        int play1Score = 0;
        int play2Score = 0;
        int playCount = 0;



        Scanner scanner = new Scanner(System.in);
        System.out.print("Player one, please enter your name: ");
        String name1 = scanner.nextLine();
        System.out.print("Player two, please enter your name: ");
        String name2 = scanner.nextLine();
        while (play1Score -  play2Score <3 && play2Score - play1Score <3){
            playCount++;
            System.out.println("Round "+playCount);

            System.out.print(name1 + ", please enter P (for Paper), R (for Rock) or S (for Scissors): ");
            this.player1 = scanner.nextLine(); player1 = player1.toUpperCase();

            System.out.print(name2 + ", please enter P (for Paper), R (for Rock) or S (for Scissors): ");
            this.player2 = scanner.nextLine(); player2 = player2.toUpperCase();


            if (player1.equals(player2)) {
                System.out.println("It's a tie!");

            } else if ((player1.equals("R") && player2.equals("S")) ||
                    (player1.equals("P") && player2.equals("R")) ||
                    (player1.equals("S") && player2.equals("P"))) {
                play1Score++;
                System.out.println(name1 + " wins round " + playCount+".");

            } else {
                play2Score++;
                System.out.println(name2 + " wins round " + playCount+".");

            }
//          if (play1Score + 3 > play2Score) {
//              System.out.println("The Winner is: "+ name1);
//              break;

//          }  else {
//              System.out.print("The Winner is: "+ name2);
//              }
        }

    }






}
