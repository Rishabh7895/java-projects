package com.company;
import java.util.Scanner;
public class game1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter your move : 'rock', 'paper', 'scissor'.To quit the game enter 'quit'. ");
            String my_move = sc.nextLine();
            if(my_move.equals("quit")){
                break;
            }
            if((!my_move.equals("rock"))&&(!my_move.equals("paper"))&&(!my_move.equals("scissor"))){
                System.out.println("YOUR MOVE isn't VALID");
            }
            else {
                int rand = (int)(Math.random()*3);
                String opponent_move = "";
                if(rand==0){
                    opponent_move = "rock";
                }
                else if(rand==1){
                    opponent_move="paper";
                }
                else{
                    opponent_move="scissor";
                }
                System.out.println("Opponent's move = " +opponent_move);
                if(my_move.equals(opponent_move)){
                    System.out.println("It's a Tie");
                }
                else if((my_move.equals("rock") && opponent_move.equals("scissor"))
                        || (my_move.equals("paper") && opponent_move.equals("rock"))
                        || (my_move.equals("scissor") && opponent_move.equals("paper"))){
                    System.out.println("You WON");
                }
                else{
                    System.out.println("You LOST");
                }
            }
        }
        System.out.println("Thanks for playing! ");//Asking the user to enter there move
    }
}
