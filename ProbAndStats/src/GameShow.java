import java.util.Random;

public class GameShow {

    public static boolean playGame(boolean changeDoor) {
        Random random = new Random();
        int winningDoor = random.nextInt(3) + 1;
        int playerChoice = random.nextInt(3) + 1;
        int openedDoor = 0;
        if (playerChoice == winningDoor) {
            int remainingDoor = random.nextInt(2) + 1;
            if (remainingDoor == 1) {
                openedDoor = 2;
            } else {
                openedDoor = 1;
            }
        } else if (winningDoor == 1) {
            openedDoor = (playerChoice == 2) ? 3 : 2;
        } else if (winningDoor == 2) {
            openedDoor = (playerChoice == 1) ? 3 : 1;
        } else {
            openedDoor = (playerChoice == 1) ? 2 : 1;
        }
        if (changeDoor) {
            playerChoice = 6 - playerChoice - openedDoor;
        }
        return playerChoice == winningDoor;
    }

    public static double runSimulation(boolean changeDoor, int numGames) {
        int winCount = 0;
        for (int i = 0; i < numGames; i++) {
            if (playGame(changeDoor)) {
                winCount++;
            }
        }
        return (double) winCount / numGames;
    }

    public static void main(String[] args) {
        double noChangeWinRate = runSimulation(false, 10000);
        System.out.println("Win rate when not changing doors: " + noChangeWinRate);
        double changeWinRate = runSimulation(true, 10000);
        System.out.println("Win rate when changing doors: " + changeWinRate);
    }
}