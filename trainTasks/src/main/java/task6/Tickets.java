package task6;

import java.util.Scanner;

/**
 * 6. Счастливые билеты
 * Есть 2 способа подсчёта счастливых билетов:
 * 1. Простой — если на билете напечатано шестизначное число, и сумма первых трёх цифр равна
 * сумме последних трёх, то этот билет считается счастливым.
 * 2. Сложный — если сумма чётных цифр билета равна сумме нечётных цифр билета, то билет
 * считается счастливым.
 * Определить программно какой вариант подсчёта счастливых билетов даст их большее
 * количество на заданном интервале.
 * Входные параметры: min и max номер билета
 * Выход: информация о победившем методе и количестве счастливых билетов для каждого
 * способа подсчёта.
 */

public class Tickets {
    public static void main(String[] args) {
        System.out.println("input 6-char number of ticket!");
        Scanner scanner = new Scanner(System.in);
        int ticketNumber = scanner.nextInt();
        scanner.close();

        if (ticketNumber < 100000 || ticketNumber > 999999) {
            System.out.println("Your input is incorrect");
            return;
        }

        int num1 = ticketNumber % 10;
        ticketNumber /= 10;
        int num2 = ticketNumber % 10;
        ticketNumber /= 10;
        int num3 = ticketNumber % 10;
        ticketNumber /= 10;
        int num4 = ticketNumber % 10;
        ticketNumber /= 10;
        int num5 = ticketNumber % 10;
        ticketNumber /= 10;
        int num6 = ticketNumber % 10;
        int sum1 = (num1 + num2 + num3);
        int sum2 = (num4 + num5 + num6);

        if (sum1 == sum2) {
            System.out.println("Везунчик! Твой билетик счастливый!");
        } else {
            System.out.println("Увы! Твой билет не счастливый!");
        }
    }
}