package com.softserve.ivko;

import java.io.IOException;
import java.util.Arrays;

/**
 * Файловый парсер
 * Нужно написать программу, которая будет иметь два режима:
 * 1. Считать количество вхождений строки в текстовом файле.
 * 2. Делать замену строки на другую в указанном файле
 * Программа должна принимать аргументы на вход при запуске:
 * -D <путь к файлу> -D <строка для подсчёта>
 * -D <путь к файлу> -D <строка для поиска> -D <строка для замены>
 */

public class ParserApp {
    public static void main(String[] args) {
        ParserRunner runner = new ParserRunner();
        try {
            runner.runApplication(args);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}