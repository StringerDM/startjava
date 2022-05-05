import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        String name1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока:");
        String name2 = scanner.nextLine();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "";
        do {
            game.run();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}