            // 60. music player

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "src\\music.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String choice = "";

            while(!choice.equals("Q")){

                System.out.println("P - Play");
                System.out.println("S - Stop");
                System.out.println("R - Reset");
                System.out.println("Q - Quit");
                System.out.print("Enter your choice: ");
                choice = scanner.next().trim().toUpperCase();

                switch (choice){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
