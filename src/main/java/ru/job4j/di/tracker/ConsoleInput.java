package ru.job4j.di.tracker;

import java.util.Scanner;

public class ConsoleInput {

    private final Scanner scanner = new Scanner(System.in);

    public ConsoleInput() {
    }

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}