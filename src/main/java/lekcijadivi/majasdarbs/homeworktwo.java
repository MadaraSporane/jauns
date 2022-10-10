package lekcijadivi.majasdarbs;

public class homeworktwo {

        public static void printBusinessCard(){
            System.out.println("######");
            System.out.println("Vārds: Madara");
            System.out.println("Uzvārds: Sporāne");
            System.out.println("Telefona nr; 22452344");
            System.out.println("Dzimšanas gads: 1992");
            System.out.println("######");

        }
    public static void printBusinesscard2(String vārds,String uzvārds, int telefonanr, int dzimšanasgads)
    {
        System.out.println("######");
        System.out.println("Vārds"+ vārds);
        System.out.println("Uzvārds"+ uzvārds);
        System.out.println("Telefona nr"+ telefonanr);
        System.out.println("Dzimšanas gads" + dzimšanasgads);
        System.out.println("######");

    }

    public static void main(String[] args) {

        printBusinesscard2("Madara","Sporāne",22451411,1992);
printBusinesscard2("Jānis", "Ozoliņš",22451411,1994);

System.out.println("1.uzd:");

        int x = 10;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(x <= 5 || x <= 10);
        int xdivi = 11;
        System.out.println(xdivi == 0 || xdivi == 10);

        System.out.println(x * x > 10);



//meneša nosaukums swich metode
        System.out.println("2.uzdevums: Mēneša nosaukums");
        int menesis = 3;
        switch (menesis) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
        }
        //te jābūt trešajam uzd...
        System.out.println("3.uzdevums");




//        String luksaforaGaisma;
//        System.out.print("Ieraksti luksafora krāsu:");
//        luksaforaGaisma = scanner.nextLine();
//        if (luksaforaGaisma.equals("zaļa")) {
//            System.out.println("Var iet");
//        }
//        if (luksaforaGaisma.equals("sarkana")) {
//            System.out.println("Nevar iet");
//        }
//        if (luksaforaGaisma.equals("dzeltena")) {
//            System.out.println("Gaidi");
//        }
       System.out.println("4. uzdevums: luksafora krāsa:");
        {
            String color = "zaļa";
            if (color.equals("zaļa")) ;
            {
                System.out.println("Var iet");
            }

            String color2 = "sarkans";
            if (color2.equals("sarkans")) ;
            {
                System.out.println("Nevar iet");
            }

            String color3 = "dzeltena";
            if (color3.equals("dzeltens")) ;
            {
                System.out.println("jāgaida");

            }



        }



        }
        }





