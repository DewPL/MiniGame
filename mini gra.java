import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String args[])
    throws java.io.IOException {
        Scanner in = new Scanner (System.in);

        char choice, ignore;
        String tribename;


        // Gracz                                                                                Gracz
        Gracz plemie = new Gracz();
        plemie.food = 1;
        plemie.water = 1;
        plemie.house = 1;
        plemie.tech = 1;
        plemie.pop = 6;
        plemie.atk = plemie.pop * plemie.tech;
        plemie.def = plemie.pop * plemie.house + plemie.tech;


        // Przeciwnik nr 1                                                                      Przeciwnik 1
        int[] stat1 = {0,2,3,4,5,6,7,8,9,10,11,12};

        int tab1 = stat1.length;
        int rnd1 = (int) (Math.random() * tab1);
        int rnd2 = (int) (Math.random() * tab1);


        int food = stat1[rnd1];
        int water = stat1[rnd2];
        int house = stat1[rnd1];
        int tech = stat1[rnd2];
        int pop = stat1[rnd2];
        int atk1 = pop * tech;
        int def1 = pop * house + tech;
        int x;
        int karma;
        int farmlevel;


        // Walka                                                                                WALKA
        int atak1 = plemie.atk * plemie.def;
        int obro1 = atk1 * def1;


        // Zdarzenia Losowe                                                                    LOS

        String[] zdalosPop = new String[] {"Twoje Plemię nawiedza śmiertelna epidemia -", "Podczas polowanie dziekie zwierze dziesiątkuje grupę łowców -", "Twoi zwiadowcy napotykają grupę wrogich wojowników -","Grypa dziesiątkuje " +
                "Twoje plemię -", "W skótek silnych mrozów Twoje Plemię kurczy się -"};

        // Dobre
        String[] zdalosPop2 = new String[] {"Twoi zwiadowcy spotykają grupę ludzi z innej wioski którzy chcą dołączyć do Twojego Plemienia +", "Ten rok był wyjątkowo płodny dla Twoich kobiet " +
                "przez co w Twojej wiosce rodzi się dużo dzieci +", "Twoje Plemię się rozwija i przyciąga nowych osadników +"};

        String[] zdalosFood = new String[] {"Nadchodzi burza która niszczy Twoje zapasy żywności ", "Plaga szarańczy niszczy Twoje plony ", "Zapas żywności zostaje zaatakowany przez dziekie szczury ", "Wysoki poziom wody " +
                "w pobliskiej rzece powoduje podtopienie Twoich zaspasów żywności ", "Grupa szabrowników z obcego plemienia niszczy Twoje zapasy ", "Grupa szabrowników z obcego plemienia kradnie Twoje zapasy ",
                "Szarańcza niszczy Twoje uprawy ", "Przez suszę Twoje plony są mniejsze "};

        System.out.println("Podaj nazwę swojego Plemienia: ");
        tribename = in.next();
        System.out.println("Jesteś wodzem Plemienia " + tribename);

        for(;;) {
        int[] poziomLos = {1,2,3,4,5};


        int los1 = zdalosPop.length;
        int los2 = zdalosPop2.length;
        int los3 = zdalosFood.length;
        int los4 = poziomLos.length;
        int los5 = poziomLos.length;
        int los6 = poziomLos.length;

        int rnd3 = (int) (Math.random() * los1); // Złe
        int rnd4 = (int) (Math.random() * los2); // Dobre
        int rnd5 = (int) (Math.random() * los3); // Food

        int rnd6 = (int) (Math.random() * los4); // Poziom Los
        int rnd7 = (int) (Math.random() * los5); // Poziom Los
        int rnd8 = (int) (Math.random() * los6); // Poziom Los



        // Menu                                                                                 MENU

            do {

        System.out.println("1. Zobacz statystyki swojej wwioski");
        System.out.println("2. Atakuj pobliskie plemiona");
        System.out.println("3. ---- TEST ---- Statystyki przeciwnika nr 1");
        System.out.println("4. ---- TEST ---- Zdarzenia Losowe");
        System.out.println("Naciśnij q aby wyjść");

                choice = (char) System.in.read();
                System.out.println("Twoj wybor to: " + choice);
                System.out.println("\n");


                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while(choice < '1' | choice > '7' & choice != 'q');

            if(choice == 'q') break;



            switch (choice) {

                case '1':
                    System.out.println("Statystyki Plemienia:");
                    System.out.println("Populacja: \t\t\t\t" + plemie.pop);
                    System.out.println("Zapasy jedzenia: \t\t" + plemie.food);
                    System.out.println("Zapasy wody: \t\t\t" + plemie.water);
                    System.out.println("Poziom wioski: \t\t\t" + plemie.house);
                    System.out.println("Poziom technologii: \t" + plemie.tech);
                    System.out.println();
                    break;

                case '2':
                    System.out.println("Atak na pobliską wioskę: ");
                    System.out.println("Plemię " + tribename + "   .   " + " Plemię Wroga:");
                    System.out.println("Populacja   " + plemie.pop + "\t\t -     " + pop);
                    System.out.println("Technologia " + plemie.tech + "\t\t -     " + tech);
                    System.out.println("LvL Wioski  " + plemie.house + "\t\t -     " + house);
                    System.out.println("Atak        " + plemie.atk + "\t\t -     " + atk1);
                    System.out.println("Obrona      " + plemie.def + "\t\t -     " + def1);
                    System.out.println("Wynik walki twój atak: " + atak1 + " Obrona: " + obro1);
                    if (atak1 > obro1) {
                        System.out.println("Wygrałeś");
                    } else System.out.println("Przegrana");
                    System.out.println();
                    break;

                case '3':
                    System.out.println("Losowe statystyki przeciwnika nr1:");
                    System.out.println("Populacja: \t\t\t\t" + pop);
                    System.out.println("Zapasy jedzenia: \t\t" + food);
                    System.out.println("Zapasy wody: \t\t\t" + water);
                    System.out.println("Poziom wioski: \t\t\t" + house);
                    System.out.println("Poziom technologii: \t" + tech);
                    System.out.println();
                    break;

                case '4':
                    System.out.println(zdalosPop2[rnd4] + poziomLos[rnd6]);
                    System.out.println(zdalosPop[rnd3] + poziomLos[rnd7]);
                    System.out.println(zdalosFood[rnd5] + poziomLos[rnd8]);
                    System.out.println();
                    break;

            } // Switch
        } // for
    } // main
} // class
