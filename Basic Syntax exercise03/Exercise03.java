package BasicSyntax_MoreExercise;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scan.nextLine());
        double spentBalance = 0;
        String games = scan.nextLine();
        while(!games.equals("Game Time")){

            if(currentBalance<=0){
                System.out.println("Out of money!");
                break;
            }else{
                if(games.equals("OutFall 4") || (games.equals("RoverWatch Origins Edition"))){
                    if(currentBalance >=39.99){
                        currentBalance -=39.99;
                        spentBalance +=39.99;
                        System.out.printf("Bought %s",games);

                    }else{
                        System.out.print("Too Expensive");

                    }
                } else if (games.equals("CS: OG")) {
                    if(currentBalance >=15.99){
                        currentBalance -=15.99;
                        spentBalance +=15.99;
                        System.out.printf("Bought %s",games);

                    }else {
                        System.out.print("Too Expensive");

                    }
                }else if (games.equals("Zplinter Zell")) {
                    if (currentBalance >= 19.99) {
                        currentBalance -= 19.99;
                        spentBalance +=19.99;
                        System.out.printf("Bought %s",games);
                    } else {
                        System.out.print("Too Expensive");

                    }
                } else if (games.equals("Honored 2")) {
                    if (currentBalance >= 59.99) {
                        currentBalance -= 59.99;
                        spentBalance +=59.99;
                        System.out.printf("Bought %s",games);
                    } else {
                        System.out.print("Too Expensive");

                    }
                }else if (games.equals("RoverWatch")) {
                    if (currentBalance >= 29.99) {
                        currentBalance -= 29.99;
                        spentBalance +=29.99;
                        System.out.printf("Bought %s",games);
                    } else {
                        System.out.print("Too Expensive");

                    }
                }else{
                    System.out.print("Not Found");
                }
            }

            System.out.println();

            games = scan.nextLine();

        }
        if(currentBalance>0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spentBalance,currentBalance);
        }else{
            System.out.println("Out of money!");
        }

    }
}