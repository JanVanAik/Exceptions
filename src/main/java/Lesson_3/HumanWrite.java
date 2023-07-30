package Lesson_3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class HumanWrite{
    public static void WriteHuman(String Path, Human human ){
        try (FileWriter writer = new FileWriter(Path, true)) {
            writer.write(human.toString() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
