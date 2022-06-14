package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        sqrt деген метод тузунуз.
//        UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
//        Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).

        Scanner scaner= new Scanner(System.in);
        System.out.println("Press the number:  ");
        int number=scaner.nextInt();
       UnaryOperator unaryOperator= num -> Math.sqrt(num);
        System.out.println(unaryOperator.sqrt(number));

    }
}
@FunctionalInterface
 interface UnaryOperator{

    Double sqrt(double num);





}
