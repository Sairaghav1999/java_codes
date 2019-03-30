import java.util.Scanner;

abstract class Themepark{
    int afee = 500, cfee = 300;
    int calc(int n, int m){
        return (n*afee) + (m*cfee);
    }
    abstract void playGame(int j);
}

class Queensland extends Themepark{
    int i;
    Boolean games[] = new Boolean[30];

    Queensland(){
        System.out.println("Welcome to Queensland!");
        for(i = 0; i < games.length; i++){
            games[i] = false;
        }
    }

    void playGame(int j){
        if(j == 100){
            System.out.println("Quitting!");
            System.exit(0);
        }
        else{
            if(j>=0 && j<games.length)
            {
                if(games[j] == true){
                    System.out.println("Error: You've already played this game");
                }
                else {
                    System.out.println("Playing Game " + j + " at Queensland");
                    games[j] = true;                    
                }                
            }
            else
            {
                System.out.println("Game unavailable!");
            }
            
        }
    }
}

class Wonderla extends Themepark{
    int i;
    Boolean games[] = new Boolean[40];

    Wonderla(){
        System.out.println("Welcome to Wonderla!");
        for(i = 0; i < games.length; i++){
            games[i] = false;
        }
    }

    void playGame(int j){
        if(j == 100){
            System.out.println("Quitting!");
            System.exit(0);
        }
        else{
            if(j>=0 && j<games.length)
            {
                if(games[j] == true){
                    System.out.println("You've already played this game");
                }
                System.out.println("Playing Game " + j + " at Wonderla");
                games[j] = true;
            }
            else
            {
                System.out.println("Game unavailable!");
            }
        }
    }

}

public class AmusementParks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("----Welcome to the Amusement Park----");
        System.out.println("Select a park:\n1. Queensland\n2. Wonderla");
        int c = sc.nextInt();

        switch(c){
            case 1:
                Queensland q = new Queensland();
                System.out.print("Select a game (0 - 29) and enter 100 to quit: ");
                while(sc.hasNextInt()){
                    i = sc.nextInt();
                    q.playGame(i);
                }
                break;

            case 2:
                Wonderla w = new Wonderla();
                System.out.print("Select a game (0 - 39) and enter 100 to quit: ");
                while(sc.hasNextInt()){
                    i = sc.nextInt();
                    w.playGame(i);
                }
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}