// Sushant Khatri
// Lab Assignment 7 - Task 3: Array of Objects
import java.io.*;

/**
   This program creates a list of songs for a CD
   by reading from a file.
*/
public class CompactDisc {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("Classics.txt");
        BufferedReader input = new BufferedReader(file);
        String title;
        String artist;

        // Declare an array of six Song objects.
        Song[] cd = new Song[6];

        for (int i = 0; i < cd.length; i++) {
            title = input.readLine();
            artist = input.readLine();

            // Create and store each Song object.
            cd[i] = new Song(title, artist);
        }
        input.close();

        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++) {
            // Song.toString() already ends with a newline.
            System.out.print(cd[i]);
        }
    }
}
