/* mini golf scorer program
we are going ot sum up the number of strokes it takes each player per hole. There are 18 holes in a game of golf. 
The simple version of this program will have 2 players, we will ask for their names
and we will prompt each player how many strokes it took for each hole. we will sum the scores along the way */

import java.util.Scanner; 
public class minigolf {
    public static void main(String[] args){
       String player1, player2; // store the player's names
       int score1=0; // rolling summation for player 1
       int score2=0; // rolling summation for player 2
       int strokes; //reuse this for input for hole
       final int HALF_HOLES= 9; // shorter game
       final int NUM_HOLES = 18; //final means that number of holes will never be changed in this program
       Scanner sc = new Scanner(System.in);

       // gather the name of teh players and welcome them to the game

        System.out.println("welcome to mini golf scoring");
        System.out.print("player1, what is your name?");// without ln, prints on same line
        player1 = sc.next();
        System.out.println("player2, what is your name?");
        player2 = sc.next();

        for(int i = 0; i < NUM_HOLES; i++)   {
            System.out.println("Player1's score for hole" + (i+1) + ":");
            strokes = sc.nextInt();
            score1 += strokes;
            System.out.println("Player2's score for hole" + (i+1) + ":");
            strokes= sc.nextInt();
            score2 += strokes;
        }

/* print out the final scores and who wins the game*/
System.out.println("Thank you for playing " + player1+ ". Your score is: " + score1);
System.out.println("Thank you for playing " + player2+ ". Your score is: " + score2);
if (score1<score2){
System.out.println("Congrats "+ player1+ ", you won!");
}
else if (score2 < score1){
    System.out.println("Congrats " + player2+ ", you won!");
}
else {
    System.out.println("You are tied, Play agin!");
}
    }
    
}
