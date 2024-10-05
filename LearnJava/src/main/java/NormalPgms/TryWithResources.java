package NormalPgms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResources {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter(new File(""))) {
            printWriter.println("");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
