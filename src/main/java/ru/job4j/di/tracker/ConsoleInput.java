package ru.job4j.di.tracker;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInput {

    private final Scanner scanner = new Scanner(System.in);

    public ConsoleInput() {
    }

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
