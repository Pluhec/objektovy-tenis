import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logika logika = new Logika();
        Vystupy vystupy = new Vystupy(logika);
        vystupy.gameStart();
    }
}