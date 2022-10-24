package lekcijatris.majasdarbs;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        System.out.println("Pirmais uzdevums");
        Scanner scanner = new Scanner(System.in);

        int skaitlis;
        int summa = 0;

        while (summa < 100) {
            System.out.println("Ievadi skaitli:");
            skaitlis = scanner.nextInt();
            summa = summa + skaitlis;
        }

        System.out.println("Gatavs");

        System.out.println("Otrais uzdevums");
        int[] laimigieSkaitli = {3, 6, 7, 8, 11, 12};
        //while
        int a = 0;
        while (a < laimigieSkaitli.length) {
            System.out.println(laimigieSkaitli[a]);
            a++;
        }
        //do  while
        int b = 0;
        do {
            System.out.println(laimigieSkaitli[b]);
            b++;
        }
        while (b < laimigieSkaitli.length);
        //for loop
        for
        (int c = 0; c < laimigieSkaitli.length; c++)
            ;


        //for each
        for (int laimigaisSkaitlis : laimigieSkaitli) {
            System.out.println(laimigaisSkaitlis);
        }

        String[] pukes = {"Rozes", "Lilijas", "Vijolītes"};
        int d = 0;
        //while
        while (d < pukes.length) {
            System.out.println(pukes[d]);
        }
        d++;
        //Do while
        int f = 0;
        do {
            System.out.println(pukes[f]);
            f++;
        }
        while (f < pukes.length);

        //for loop
        for
        (int m = 0; m < pukes.length; m++)
            ;
        //for each
        for (String vienapuke : pukes) {
            System.out.println(vienapuke);
        }


        char[] simboli = {'@', '$', '&'};
//while
        int r = 0;
        while (r < simboli.length) {
            System.out.println(simboli[r]);
            r++;
        }

//do while
        int l = 0;
        do {
            System.out.println(simboli[l]);
            l++;
        }
        while (l < simboli.length);
        //for loop
        for (int z = 0; z < simboli.length; z++) ;
        System.out.println();
        //for each
        for (char viensSimbols : simboli) {
            System.out.println(viensSimbols);
        }


        System.out.println("Tresais uzdevums");
        int[] paraSkaitli = new int[100];
        int z;
        for (z = 2; z <= 100; z++) {
            if (z % 2 == 0) {
            }
            System.out.println(paraSkaitli + " ");

        }
    }}




















