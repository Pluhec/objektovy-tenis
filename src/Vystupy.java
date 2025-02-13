import java.util.Scanner;

public class Vystupy {
    private Logika logika;

    public Vystupy(Logika logika) {
        this.logika = logika;
    }

    public void gameStart(){
        System.out.println("Toto je počítadlo pro tenis");
        logika.getInput(this);
    }

    void inputMessage(){
        System.out.println("Pro ovládaní kalkulačky budeš pro domací mačka 1 a pro hosty mačka 2");
    }

    int input(){
        Vstupy vstupy = new Vstupy(this);
        int userInput = vstupy.userInput();
        return userInput;
    }

    void outputMessage(int domaciHry, int hosteHry, int domaciGemy, int hosteGemy, int domaciSety, int hosteSety, String vyhoda){
        String domaci = logika.homeAdvantage(domaciHry);
        String hoste = logika.hostAdvantage(hosteHry);
        String gameOver = logika.gameOver(domaciSety, hosteSety);

        System.out.print("   Domací  : Hosté\n");
        System.out.print("Hry  " + domaci  + " : " + hoste + "\n");
        System.out.println("Gemy " + domaciGemy + " : " + hosteGemy + "\n");
        System.out.println("Sety " + domaciSety + " : " + hosteSety + "\n");
        System.out.println(gameOver);

        logika.getInput(this);
    }

    void endGame(){
        System.out.println("Game Over");
    }
}
