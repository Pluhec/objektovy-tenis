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
        System.out.print("   Domací  : Hosté\n");
        if (domaciHry == 100 && hosteHry == 100) {
            System.out.print("Hry  " + vyhoda + " : " + vyhoda + "\n");
        } else if (domaciHry == 100) {
            System.out.print("Hry  " + vyhoda + " : " + hosteHry + "\n");
        } else if (hosteHry == 100) {
            System.out.print("Hry  " + domaciHry + " : " + vyhoda + "\n");
        } else if (domaciHry <= 40) {
            System.out.println("Hry  " + domaciHry + " : " + hosteHry + "\n");
        } else if (hosteHry <= 40) {
            System.out.println("Hry  " + domaciHry + " : " + hosteHry + "\n");
        }



        System.out.println("Gemy " + domaciGemy + " : " + hosteGemy + "\n");
        System.out.println("Sety " + domaciSety + " : " + hosteSety + "\n");
        if (domaciSety == 2) {
            System.out.print("domaci vyhrali " + domaciSety + " : " + hosteSety + "\n");
            endGame();
        }

        if (hosteSety == 2) {
            System.out.print("hoste vyhrali " + hosteSety + " : " + domaciSety + "\n");
            endGame();
        }

        logika.getInput(this);
    }

    void endGame(){
        System.out.println("Game Over");
    }
}
