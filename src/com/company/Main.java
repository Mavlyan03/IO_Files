package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Alphabet();
        Reader();
    }

    public static void Reader() {
        try ( FileReader reader = new FileReader("Alphabet.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Alphabet() {
        try (FileWriter writer = new FileWriter("Alphabet.txt")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                for (char j = 'a'; j <= 'z'; j++) {
                    if (j - i == 32) {
                        writer.write(i + " " + j+"\n");
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                writer.write(i+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




