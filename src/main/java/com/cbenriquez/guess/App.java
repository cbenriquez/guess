package com.cbenriquez.guess;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public int number;

    public App() {
        Random random = new Random();
        number = random.ints(0, 100).findFirst().getAsInt();
    }
    
    public void run() {
        System.out.println("Guess an integer between 0 and 100");
        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int guess;
            try {
                guess = Integer.parseInt(bufferedReader.readLine());
            } catch(Exception error) {
                System.out.println("Please input a valid integer.");
                continue;
            }
            if (guess > number) {
                System.out.println("Lower...");
            } else if (guess < number) {
                System.out.println("Higher...");
            } else {
                System.out.println("You guessed it!");
                break;
            }
        }
    }
}
