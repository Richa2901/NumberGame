import java.util.Scanner ;
public class NumberGame
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chances=5;
        int finals=0;
        boolean playAgain=true;
        System.out.println("welcome champion!");
        System.out.println(" Hey Champ you have about  "+chances+" chances to win this game");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance"+(i+1)+" Enter your Number:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You won it.");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too Low");
                }
            }
            if(guess==false){
                System.out.println("Sorry Champ. You lost .The number is"+rand);
            }
            System.out.println("Do you want to play Again(yes/no)");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("yes");
        }
        System.out.println("Well Done Champ , Hope you enjoyed it ");
        System.out.println("Here is you Score"+finals);

    }
         public static int getrandN(int min,int max){
        return(int)(Math.random()*(max-min+1)+min);
         }
}