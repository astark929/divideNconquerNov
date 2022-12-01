package testCode2;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        change(input);
    }

    public static void change(String input) throws IOException {
        String stuff = "";
        String path = "src/main/resources/";
        FileInputStream file = new FileInputStream(path+input);
        Scanner scan = new Scanner(file);

        FileWriter writer = new FileWriter(path+"output");

        while (scan.hasNextLine()){
            stuff = scan.nextLine();
            stuff = stuff.replace("_photo.jpg", "_info.txt \n");
            writer.write(stuff);
        }
        writer.close();
    }

}
