package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while (beerNum>0) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на столе");
            System.out.println(beerNum + " " + word + " ");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum <0) {
                System.out.println("Нет бутылок пива на столе");
            }

        }
    }
}
