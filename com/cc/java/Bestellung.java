package com.cc.java;

public class Bestellung {


    public static void main(String[] args) {
    
        // Variablen deklarieren
        String food = "noch kein Burger gewählt";
        String drink = "noch kein Getränk gewählt";
        String itemNumStr;
        String flag;

        // System.out.println(food);
        // System.out.println(drink);

         // Bestelldialog 1 : Ausgabe
        System.out.println("-------------------------------");
        System.out.println("Herzlich Willkommen bei MD, Ihre Bestellung bitte!");
        System.out.println("Hamburger(1), Cheeseburger(2) oder Chilliburger(3) ?");

        // Bestelldialog 1 : Eingabe
        itemNumStr = System.console().readLine("Ihre Wahl? : ");
        // System.out.println(itemNumStr);  // 1 oder 2 oder 3

    switch (itemNumStr)
        {
            case "1":
                food = "Hamburger";
                break;
            case "2":
                food = "Cheeseburger";
                break;
            case "3":
                food = "Chilliburger";
                break;
        }

        // System.out.println(food);


     // Entscheidung Getränk dazu?
        System.out.println("-------------------------------");
        System.out.println("Möchten Sie ein Getränk dazu bestellen? (j/n)");
       flag = System.console().readLine("(j/n)? :");
        System.out.println(flag);

    
    }



}
