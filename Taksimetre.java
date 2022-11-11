import java.util.Scanner;
1public class Taksimetre {
    public static void main(String[] args)  {
     double ucret;
     int mesafe;
        Scanner scan = new Scanner(System.in);

        System.out.print("KM giriniz: ");
        mesafe= scan.nextInt();

        ucret=10 + (2.20*mesafe);

        if (ucret < 20 ) {
            ucret = 20;
        }

        System.out.println("Tutar = "+ucret);

    }
}
