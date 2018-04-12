package Exercise16_SkiJumping;

import java.util.Arrays;
import java.util.Random;

public class Jump {
    private int length;
    private int[] judgeVotes;
    private Random random;

    public Jump() {
        random = new Random();
        length = createRandomLength(60, 120);
        judgeVotes = createRandomJudgeVotes(5);
    }

    private int createRandomLength(int min, int max) {
        int diff = max - min + 1;
        return random.nextInt(diff) + min;
    }

    private int[] createRandomJudgeVotes(int number) {
        int[] votes = new int[number];
        for (int i = 0; i < number; i++) {
            votes[i] = random.nextInt(11) + 10;
        }
        return votes;
    }

    public int getLength() {
        return length;
    }

    public int jumpPoints() {
        int points = 0;
        Arrays.parallelSort(judgeVotes);

        for (int i = 1; i < judgeVotes.length - 1; i++) {
            points += judgeVotes[i];
        }
        return points + length;
    }

    public String toString() {
        return "length: " + length + "\n  judge votes: " + Arrays.toString(judgeVotes);
    }
}
