import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Adam f1 = new Adam("ENES ", 10, 120, 100, 40);
        Adam f2 = new Adam("MAHMUT", 20, 85,85, 30);

        Match match = new Match(f1, f2, 85, 100, 2);
        match.run();


    }
}