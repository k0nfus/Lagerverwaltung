import java.util.Scanner;

class Lagerverwaltung {

    public static void neueKiste(int kistenArray[][]) {
        //Eingabe einer neuen Kiste via call by reference
        Scanner benutzereingabe = new Scanner(System.in);
        System.out.println("Welche Kisten-ID moechten Sie veraendern? 1-75");
        int anlegenID = benutzereingabe.nextInt();
        System.out.println("Sie haben die Kiste mit der ID " + anlegenID + " gewaehlt.");
        System.out.println("ID\tBreite\tLaenge\tHoehe");
        anlegenID = anlegenID-1;
        System.out.println(kistenArray[anlegenID][0] + "\t" + kistenArray[anlegenID][1] + "\t" + kistenArray[anlegenID][2] + "\t" + kistenArray[anlegenID][3]);
        System.out.println("Geben Sie die neue Breite ein:");
        int breite = benutzereingabe.nextInt();
        System.out.println("Geben Sie die neue Laenge ein:");
        int laenge = benutzereingabe.nextInt();
        System.out.println("Geben Sie die neue Hoehe ein:");
        int hoehe = benutzereingabe.nextInt();
        kistenArray[anlegenID][1] = breite;
        kistenArray[anlegenID][2] = laenge;
        kistenArray[anlegenID][3] = hoehe;
        // Aufruf der Methode Menü
        menu(kistenArray);
    }

    public static void loeschen(int kistenArray[][]) {
        // Einträge einer Kiste "löschen"
        // auch call by reference
        Scanner benutzereingabe = new Scanner(System.in);
        System.out.println("Welche Kisten-ID moechten Sie loeschen? 1-75");
        int loeschID = benutzereingabe.nextInt();
        System.out.println("Sie haben die Kiste mit der ID " + loeschID + " gewaehlt.");
        System.out.println("ID\tBreite\tLaenge\tHoehe");
        loeschID = loeschID - 1;
        System.out.println(kistenArray[loeschID][0] + "\t" + kistenArray[loeschID][1] + "\t" + kistenArray[loeschID][2] + "\t" + kistenArray[loeschID][3]);
        System.out.println("Sind Sie sich sicher, dass Sie diese Kiste loeschen wollen? 1 = ja / 0 = abbruch");
        int janein = benutzereingabe.nextInt();
        if (janein == 1) {
            kistenArray[loeschID][1] = 0;
            kistenArray[loeschID][2] = 0;
            kistenArray[loeschID][3] = 0;
        } else {
            System.out.println("Der Vorgang wurde abgebrochen!");
        }
        // Aufruf der Methode Menü
        menu(kistenArray);
    }

    public static void eineKiste (int kistenArray[][]) {
        // Einzelne Kiste anzeigen
        // call by reference
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die anzuzeigende Kisten-ID an: 1-75");
        int id = eingabe.nextInt();
        id = id - 1;
        System.out.println("ID\tBreite\tLaenge\tHoehe");
        System.out.println(kistenArray[id][0] + "\t" + kistenArray[id][1] + "\t" + kistenArray[id][2] + "\t" + kistenArray[id][3]);
        // Aufruf der Methode Menü
        menu(kistenArray);
    }

    public static void alleKisten (int kistenArray[][]) {
        // Anzeigen aller Kisten
        // call by reference
        System.out.println("ID\tBreite\tLaenge\tHoehe");
        for(int zeile = 0; zeile < kistenArray.length; zeile++) {
            for(int spalte = 0; spalte < kistenArray[zeile].length; spalte++) {
                System.out.print(kistenArray[zeile][spalte] + "\t");
            }
            System.out.println();
        }
        // Aufruf der Methode Menü
        menu(kistenArray);
    }

    public static void menu (int kistenArray[][]) {
        // call by reference
        Scanner benutzereingabe = new Scanner(System.in);
        System.out.println("\t##### Lagerverwaltung #####\n");
        System.out.println("A \t Eingabe einer neuen Kiste");
        System.out.println("B \t Loeschen einer vorhandenen Kiste");
        System.out.println("C \t Anzeigen der Daten einer vorhandenen Kiste");
        System.out.println("D \t Anzeigen aller vorhandenen Kisten");
        System.out.println("X \t Exit");
        String menu = benutzereingabe.next();
        switch(menu) {
            case "A":
            case "a":
                neueKiste(kistenArray);
            case "B":
            case "b":
                loeschen(kistenArray);
            case "C":
            case "c":
                eineKiste(kistenArray);
            case "D":
            case "d":
                alleKisten(kistenArray);
            case "X":
            case "x":
                System.exit(0);
                break;
            // wenn es wild wird
            default:
                System.out.println("Sie haben keine gueltige Auswahl getroffen!");
                // neuer Versuch
                menu(kistenArray);
        }

    }

    public static void main(String[] args) {
        // 75 Kisten, je Kiste fixe ID, Breite, Länge, Höhe
        int kistenArray[][] = {
                {1,0,0,0}, {2,0,0,0}, {3,0,0,0}, {4,0,0,0}, {5,0,0,0}, {6,0,0,0}, {7,0,0,0}, {8,0,0,0}, {9,0,0,0}, {10,0,0,0},
                {11,0,0,0}, {12,0,0,0}, {13,0,0,0}, {14,0,0,0}, {15,0,0,0}, {16,0,0,0}, {17,0,0,0}, {18,0,0,0}, {19,0,0,0}, {20,0,0,0},
                {21,0,0,0}, {22,0,0,0}, {23,0,0,0}, {24,0,0,0}, {25,0,0,0}, {26,0,0,0}, {27,0,0,0}, {28,0,0,0}, {29,0,0,0}, {30,0,0,0},
                {31,0,0,0}, {32,0,0,0}, {33,0,0,0}, {34,0,0,0}, {35,0,0,0}, {36,0,0,0}, {37,0,0,0}, {38,0,0,0}, {39,0,0,0}, {40,0,0,0},
                {41,0,0,0}, {42,0,0,0}, {43,0,0,0}, {44,0,0,0}, {45,0,0,0}, {46,0,0,0}, {47,0,0,0}, {48,0,0,0}, {49,0,0,0}, {50,0,0,0},
                {51,0,0,0}, {52,0,0,0}, {53,0,0,0}, {54,0,0,0}, {55,0,0,0}, {56,0,0,0}, {57,0,0,0}, {58,0,0,0}, {59,0,0,0}, {60,0,0,0},
                {61,0,0,0}, {62,0,0,0}, {63,0,0,0}, {64,0,0,0}, {65,0,0,0}, {66,0,0,0}, {67,0,0,0}, {68,0,0,0}, {69,0,0,0}, {70,0,0,0},
                {71,0,0,0}, {72,0,0,0}, {73,0,0,0}, {74,0,0,0}, {75,0,0,0}
        };

        // Aufruf des Menüs
        menu(kistenArray);

    }



}


