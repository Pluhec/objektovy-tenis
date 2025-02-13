import java.util.Scanner;

public class Vstupy {
    private Vystupy vystupy;

    public Vstupy(Vystupy vystupy) {
        this.vystupy = vystupy;
    }

    public int userInput(){
        Scanner sc = new Scanner(System.in, "UTF-8");
        int userInput;

        do {
            vystupy.inputMessage();
            userInput = sc.nextInt();
        } while(userInput > 2 || userInput < 1);

        return userInput;
    }
}
