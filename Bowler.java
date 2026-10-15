// Sushant Khatri
// Lab Assignment 7 - Task 1: Bowler Class
import java.util.Scanner;

public class Bowler {
    private String name;
    private int[] scores;
    private int highScore;
    private double average;

    public Bowler(String name) {
        this.name = name;
        scores = new int[4];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter bowling score " + (i + 1) + ": ");
            scores[i] = keyboard.nextInt();
        }
        selectionSort();
        getHighScore();
        calculateAverage();
    }

    public void selectionSort() {
        for (int start = 0; start < scores.length - 1; start++) {
            int maxIndex = start;
            for (int index = start + 1; index < scores.length; index++) {
                if (scores[index] > scores[maxIndex]) {
                    maxIndex = index;
                }
            }
            int temp = scores[start];
            scores[start] = scores[maxIndex];
            scores[maxIndex] = temp;
        }
    }

    public void getHighScore() {
        highScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
    }

    public void calculateAverage() {
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        average = (double) total / scores.length;
    }

    @Override
    public String toString() {
        String result = "Bowler's name: " + name
                + "\nHighest bowling score: " + highScore
                + "\nAverage bowling score: " + String.format("%.2f", average)
                + "\nBowling scores (highest to lowest): ";
        for (int i = 0; i < scores.length; i++) {
            result += scores[i];
            if (i < scores.length - 1) {
                result += ", ";
            }
        }
        return result;
    }
}
