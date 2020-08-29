package com.company;

//2. Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
//и возле каждого пишет четное это число или нечетное.
//Пример
//1 -> нечетное
//2 -> четное
//и т д.
import java.util.Date;
public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++){
            if (i % 2 == 0)
                System.out.println(i + " " + "Четное");
            else
                System.out.println(i + " " + "Нечетное");
        }
    }
}
