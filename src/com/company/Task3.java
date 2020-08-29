package com.company;

//3. Написать программу, которая выводит информацию о дне неделе.
//   Например для понедельника – пятницы выводит сообщение “Это рабочий
//   день”, а для субботы и воскресенья выводит “Это выходной!”
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner week = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String day = week.nextLine();
        switch (day) {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Это рабочий день");
                break;
            case "Суббота":
            case "Воскресенье":
                System.out.println("Это выходной!");
                break;
            default:
                System.out.println("Switch default");
        }
    }
}
