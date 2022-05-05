import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void run() {
        int compNum = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число в диапазоне (0, 100] " + compNum);
        int playerNum = 0;
        Player currentPlayer = player1;
        Scanner scanner = new Scanner(System.in);

        while(playerNum != compNum) {
            System.out.println("Игрок " + currentPlayer.getName() + " введите число:");
            playerNum = scanner.nextInt();
            if(playerNum > compNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
                if(currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }
            } else if(playerNum < compNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                if(currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }
            }
        }
        System.out.println("Игрок " + currentPlayer.getName() + " победил");
    }
}