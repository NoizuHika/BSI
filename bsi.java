import java.util.Scanner;

import static java.lang.System.exit;

public class bsi {

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    public static void main(String[] args) {
        String[] options = {"1- Exercise 20",
                "2- Exercise 23",
                "3- Exercise 29",
                "4- Exercise 30",
                "5- Exercise 35",
                "6- Exit",
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 6) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        option1();
                        break;
                    case 2:
                        option2();
                        break;
                    case 3:
                        option3();
                        break;
                    case 4:
                        option4();
                        break;
                    case 5:
                        option5();
                        break;
                    case 6:
                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }

    public static double factorial(int n) {
        int multiply = 1;
        for(int i = 1; i <= n; i++) {
            multiply *= i;
        }
        return multiply;

    }

    // Options
    private static void option1() {
        System.out.println("Exercise 20: In a well-shuffled deck of 52 playing cards, what is the probability \n" +
                "that the top card is: \n" +
                "(a) A diamond (b) a black card, and (c) a nine? \n" +
                "1- a \n" +
                "2- b \n" +
                "3- c \n");
        Scanner scanner = new Scanner(System.in);
        int probability = scanner.nextInt();
        switch (probability) {
            case 1:
                System.out.println("P=13/52=1/4=25%");
                break;
            case 2:
                System.out.println("P=26/52=1/2=50%");
                break;
            case 3:
                System.out.println("P=4/52=1/13=7.7%");
                break;
            default:
                System.out.println("Please enter an integer value between 1 and 3 ");
        }

        System.out.println("If you want to write your own numbers so choose 1, if you want to break this exercise - 2");
        Scanner in = new Scanner(System.in);
        int wybor1 = in.nextInt();
        switch(wybor1){
            case 1: {

            }
            case 2: {
                break;
            }
        }
    }

    /*
    Ten kod oblicza prawdopodobienstwo z jakim zostanie wybrana dokladnie jedna osoba
    Wpisujemy 2 liczby. 1 liczba prawdopodobienstwo wylosowania meza w procentach, oraz 2 liczba prawdopodobienstwo wylosowania żony w procentach
     */

    private static void option2() {
        System.out.println("Exercise 23: A man and his wife appear for an interview for two posts. The \n" +
                "probability of husband's selection is 1/7 and that of the wife's \n" +
                "selection is 1/5. What is the probability that only one of them will be \n" +
                "selected?");
        double pa = 1/7.;
        double pb = 1/5.;
        double pc = 1 - pa;
        double pd = 1 - pb;
        double result = pa * pd + pb * pc;

        System.out.println("P(A)=" + pa + ", P(B)=" + pb + ", P(A')=" + pc + ", P(B')=" + pd);
        System.out.println("PROBABILITY= P(A)*P(B')+P(B)*P(A')=" + result + "=2/7");

        System.out.println("If you want to write your own numbers so choose 1, if you want to break this exercise - 2");
        Scanner in = new Scanner(System.in);
        int wybor2 = in.nextInt();
        switch(wybor2){
            case 1: {
                System.out.println("Probability of husband's selection (percent): ");
                Scanner Husselect = new Scanner(System.in);
                double Husbandselection = Husselect.nextInt();
                double Husproc = Husbandselection / 100;
                System.out.println("Probability of husband's selection (percent): ");
                Scanner Wifeselect = new Scanner(System.in);
                double Wifeselection = Wifeselect.nextInt();
                double Wifeproc = Wifeselection / 100;

                double ppierwsze = 1 - Husproc;
                double pdrugie = 1 - Wifeproc;
                double prawresult = Husproc * pdrugie + Wifeproc * ppierwsze;
                System.out.println("P(A)=" + Husproc + ", P(B)=" + Wifeproc + ", P(A')=" + ppierwsze + ", P(B')=" + pdrugie);
                System.out.println("PROBABILITY= P(A)*P(B')+P(B)*P(A')=" + prawresult);
            }
            case 2: {
                break;
            }
        }
    }

    /*
    Ten kod oblicza stosunek wygrania A do wygrania B
    Wpisujemy 6 liczb. 3 stosuja sie do A, a 3 do B
    Pierwsza liczba to ilosc losow uczestnika A, 2 liczba ile jest nagrod dla uczestnika A, 3 liczba ile jest przeegranych losow dla uczestnika A
    Rowniez dla uczestnika B to samo: 4 liczba to ilosc losow uczestnika B, 5 liczba ile jest nagrod dla uczestnika B, 6 liczba ile jest przeegranych losow dla uczesnika B
     */
    private static void option3() {
        System.out.println("Exercise 29: A has one share in a lottery in which there is one prize and two \n" +
                "blanks ; B has three shares in a lottery in which there are three \n" +
                "prizes and 6 blanks; compare the probability of A's success to that \n" +
                "of B's success. ");
        double pA=factorial(2)/(factorial(3)/factorial(2));//Probability for A to loss
        double pB=(factorial(6)/(factorial(3)*factorial(3)))/(factorial(9)/(factorial(3)*factorial(6)));//Probability for B to loss

        double result= (1-pA)/(1-pB);
        System.out.println("PROBABILITY="+result+"7:16");

        System.out.println("If you want to write your own numbers so choose 1, if you want to break this exercise - 2");
        Scanner in = new Scanner(System.in);
        int wybor3 = in.nextInt();
        switch(wybor3){
            case 1: {
                System.out.println("How much share A have: ");
                Scanner IAshare = new Scanner(System.in);
                int Ashare = IAshare.nextInt();
                System.out.println("How much prizes in A lottery: ");
                Scanner IAprize = new Scanner(System.in);
                int Aprize = IAprize.nextInt();
                System.out.println("How much blanks in A lottery: ");
                Scanner IAblanks = new Scanner(System.in);
                int Ablanks = IAblanks.nextInt();
                System.out.println("How much share B have: ");
                Scanner IBshare = new Scanner(System.in);
                int Bshare = IBshare.nextInt();
                System.out.println("How much prizes in B lottery: ");
                Scanner IBprize = new Scanner(System.in);
                int Bprize = IBprize.nextInt();
                System.out.println("How much blanks in B lottery: ");
                Scanner IBblanks = new Scanner(System.in);
                int Bblanks = IBblanks.nextInt();

                double spA = factorial(Ablanks)/(factorial(Aprize+Ablanks)/factorial((Ablanks+Aprize)-Ashare));
                double spB = (factorial(Bblanks)/(factorial(Bshare)*factorial((Bblanks-Bshare))))/(factorial(Bblanks+Bprize)/(factorial(Bshare)*factorial((Bblanks+Bprize)-Bshare)));

                double sresult = (1-spA)/(1-spB);
                System.out.println("PROBABILITY="+sresult);
            }
            case 2: {
                break;
            }
        }

    }

    /*
    ten kod oblicza prawdopodobienstwo wybrania dokladnie 2 dzieci z posrod uczestnikow
    Pierwsza liczba ilosc mezczyzn w grupie, 2 liczba ilosc kobiet oraz 3 liczba ilosc dzieci w grupie
     */
    private static void option4() {
        System.out.println("Exercise 30: Four persons are chosen at random from a group containing 3 men, \n" +
                "2 women and 4 children. Calculate the chances that exactly two of \n" +
                "them will be children. ");
        double x = factorial(9)/(factorial(4)*factorial(5)) ; //"number of ways of choosing 4 persons out of 9";
        double z = factorial(4)/(factorial(2)*factorial(2))*factorial(5)/(factorial(2)*factorial(3));// number of ways of choosing 2 children out of 4 and 2 persons out of (3 + 2) personal
        double result = z / x;
        System.out.println("PROBABILITY=" + result+ "=10/21");
        System.out.println("If you want to write your own numbers so choose 1, if you want to break this exercise - 2");
        Scanner in = new Scanner(System.in);
        int wybor4 = in.nextInt();
        switch(wybor4){
            case 1: {
                System.out.println("How much men in group: ");
                Scanner men = new Scanner(System.in);
                int mens = men.nextInt();
                System.out.println("How much women in group: ");
                Scanner women = new Scanner(System.in);
                int women1 = women.nextInt();
                System.out.println("How much childrens in group: ");
                Scanner chil = new Scanner(System.in);
                int chil1 = chil.nextInt();
                int all = mens+women1+chil1;
                int old = mens+women1;

                double y = factorial(all)/(factorial(chil1)*factorial(old));
                double c = factorial(chil1)/(factorial(2)*factorial((chil1)-2))*factorial(old)/(factorial(2)*factorial((women1+mens)-2));
                double result1 = c/y;
                System.out.println("Probability that exactly 2 childrens will choosen = "+result1);
            }
            case 2: {
                break;
            }
        }

    }

    /*
    ten kod oblicza prawdopodobienstwo trafiania w samolot
    Pierwsza liczba to jest prawdopodobienstwo 1 strzalu w procentach, 2 liczba to jest prawdopodobienstwo 2 strzalu w procentach,
    3 liczba to jest prawdopodobienstwo 3 strzalu w procentach, 4 liczba to jest prawdopodobienstwo 4 strzalu w procentach
     */
    private static void option5() {
        System.out.println("Exercise 35: An anti-aircraft gun can take a minimum of four shots at an enemy \n" +
                "plane moving away from it. The probability of hitting the plane at \n" +
                "first, second, third, and fourth shots are 0.4, 0.3, 0.2, and 0.1 \n" +
                "respectively. What is the probability that the gun hits the plane?");
        double a1 = 0.4;
        double a2 = 0.3;
        double a3 = 0.2;
        double a4 = 0.1;
        double b1 = 1 - a1;
        double b2 = 1 - a2;
        double b3 = 1 - a3;
        double b4 = 1 - a4;
        double result = 1 - (b1 * b2 * b3 * b4);
        System.out.println("P(A1)=" + a1 + " P(A2)=" + a2 + " P(A3)=" + a3 + " P(A4)=" + a4);
        System.out.println("P(A1')=" + b1 + " P(A2')=" + b2 + " P(A3')=" + b3 + " P(A4')=" + b4);
        System.out.println("PROBABILITY= 1-P(A1')P(A2')P(A3')P(A4'=)" + result);
        System.out.println("If you want to write your own numbers so choose 1, if you want to break this exercise - 2");
        Scanner in = new Scanner(System.in);
        int wybor5 = in.nextInt();
        switch(wybor5){
            case 1: {
                System.out.println("Write probability of first shot in percent: ");
                Scanner ps = new Scanner(System.in);
                double pierwszy = ps.nextInt();
                double pierwszyproc = pierwszy/100;

                System.out.println("Write probability of second shot in percent: ");
                Scanner ds = new Scanner(System.in);
                double drugi = ds.nextInt();
                double drugiproc = drugi/100;

                System.out.println("Write probability of third shot in percent: ");
                Scanner ts = new Scanner(System.in);
                double trzeci = ts.nextInt();
                double trzeciproc = trzeci/100;

                System.out.println("Write probability of fourth shot in percent: ");
                Scanner cs = new Scanner(System.in);
                double czwarty = cs.nextInt();
                double czwartyproc = czwarty/100;

                double pps = 1 - pierwszyproc;
                double pds = 1 - drugiproc;
                double pts = 1 - trzeciproc;
                double pcs = 1 - czwartyproc;
                double prawdoresult = 1 - (pps * pds * pts * pcs);
                System.out.println("P(A1)=" + pierwszyproc + " P(A2)=" + drugiproc + " P(A3)=" + trzeciproc + " P(A4)=" + czwartyproc);
                System.out.println("P(A1')=" + pps + " P(A2')=" + pds + " P(A3')=" + pts + " P(A4')=" + pcs);
                System.out.println("PROBABILITY= 1-P(A1')P(A2')P(A3')P(A4'=)" + prawdoresult);

            }
            case 2: {
                break;
            }
        }
    }
}
