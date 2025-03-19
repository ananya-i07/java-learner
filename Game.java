// rock,paper,scissor

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int k=1;
        Random game=new Random();
        String[] options={"Rock","Paper","Scissor"};
        Scanner sc=new Scanner(System.in); 
        while (k<=5) 
        {
        System.out.println("enter your choise for round: "+ k);
        String user_choice=sc.next();
        String choice=options[game.nextInt(options.length)];
        System.out.println("computer choice for round: "+ k);
        System.out.println(choice);

         if ((user_choice.equalsIgnoreCase("Rock") && choice.equalsIgnoreCase("Scissor")) || 
            (user_choice.equalsIgnoreCase("Scissor") && choice.equalsIgnoreCase("Paper")) || 
            (user_choice.equalsIgnoreCase("Paper") && choice.equalsIgnoreCase("Rock"))) {
          i++;
         System.out.println("you win this round");
         k++;
         }
         if((choice.equalsIgnoreCase("Rock") && user_choice.equalsIgnoreCase("Scissor")) || 
         (choice.equalsIgnoreCase("Scissor") && user_choice.equalsIgnoreCase("Paper")) || 
         (choice.equalsIgnoreCase("Paper") && user_choice.equalsIgnoreCase("Rock")))
          {
            System.out.println("you lose this round");
            j++;
            k++;
        }
        if(user_choice.equalsIgnoreCase(choice))
         {
           System.out.println("tie");
           k++;
         }
         else if (!user_choice.equalsIgnoreCase("Rock") && !user_choice.equalsIgnoreCase("Paper") && !user_choice.equalsIgnoreCase("Scissor")) {
            System.out.println("❗ Invalid choice! Please enter Rock, Paper, or Scissor.");
        }
    }
        if(i>j){
            System.out.println("you win the game");
        }
        else if(j>i){
            System.out.println("oops!you lose the game");
        }
        else if(j==i){
            System.out.println("it's a tie./n Let's play again.");
        }
        sc.close();
    }
}
