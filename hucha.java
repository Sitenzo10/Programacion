package com.company;

import javax.xml.transform.SourceLocator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //int dineros; //la inicializamos sin cantidad para luego ponerle la que queramos
        int dineros = (0);

        System.out.println("¿Cuánto hay en la hucha? \n");

        System.out.println("En la hucha hay: " + dineros + "€ \n");

        //dineros = sc.nextInt(); // para ponerle la cantidad que quieres al principio

        System.out.println("¿Cuánto dinero le vas a echar? \n ");
        int dineros1 = sc.nextInt();

        int total = dineros + dineros1;

        System.out.println("La hucha" + " tiene: " + total + " € \n");

        if (total < 500) {

            System.out.println("sigue echando dinero: \n");
            /*
            int total1 = sc.nextInt();
            int total2 = total+total1;

            System.out.println("La hucha" + " tiene: " + total2 + " € \n");
            */

        }
        else{
            System.out.println("Ya tienes para la PS5, campeón");
        }




    }
}
