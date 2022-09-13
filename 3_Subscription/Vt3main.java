import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Vt3main {
    private static final Scanner sc = new Scanner(System.in).useLocale( new Locale("us", "US"));
    public static void main(String [] args ){
        
        String lehden_nimi;
        String tilaajan_nimi;
        String toimitusosoite;
        double kuukausihinta;
        
        int tilauksen_kesto;
        int alennusprosentti;
        
        //eka tilaus
        System.out.println(" ");
        System.out.println("Tilataan 2 lehtea. Tehdaan siis yksi normaali- ja yksi kestotilaus.");
        System.out.println("Tehdaan ensin normaalitilaus.");
        System.out.println(" ");
        
        System.out.printf("Anna lehden nimi: ");
        lehden_nimi = sc.nextLine();
        
        System.out.printf("Anna tilaajan nimi: ");
        tilaajan_nimi = sc.nextLine();
        
        System.out.printf("Anna toimitusosoite: ");
        toimitusosoite = sc.nextLine();
        
        while(true){
            try{
                System.out.printf("Anna kuukausihinta positiivisena reaalilukuna: ");
                kuukausihinta = sc.nextDouble();
                sc.nextLine();
                if(kuukausihinta < 0) {
                    System.out.println("Anna positiivinen hinta."); 
                }else{
                    break;
                }
            }catch(InputMismatchException ime) {
                System.out.println("Anna hinta reaalilukuna.");
                sc.nextLine();
            }
        }

        while(true){
            try{
                System.out.printf("Anna tilauksen kesto: ");
                tilauksen_kesto = sc.nextInt();
                sc.nextLine();
                if(tilauksen_kesto < 0) {
                    System.out.println("Anna positiivinen kesto."); 
                }else{
                    break;
                }
            }catch(InputMismatchException ime) {
                System.out.println("Anna kesto kokonaislukuna.");
                sc.nextLine();
            }
        }
        
        RegularSubscription rs = new RegularSubscription(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta, tilauksen_kesto);
        
        //toka tilaus
        System.out.println(" ");
        System.out.println("Tehdaan nyt kestotilaus.");
        System.out.println(" ");
        
        System.out.printf("Anna lehden nimi: ");
        lehden_nimi = sc.nextLine();
        
        System.out.printf("Anna tilaajan nimi: ");
        tilaajan_nimi = sc.nextLine();
        
        System.out.printf("Anna toimitusosoite: ");
        toimitusosoite = sc.nextLine();
        
        while(true){
            try{
                System.out.printf("Anna kuukausihinta positiivisena reaalilikuna: ");
                kuukausihinta = sc.nextDouble();
                sc.nextLine();
                if(kuukausihinta < 0) {
                    System.out.println("Anna positiivinen hinta."); 
                }else{
                    break;
                }
            }catch(InputMismatchException ime) {
                System.out.println("Anna hinta reaalilukuna.");
                sc.nextLine();
            }
        }        
        
        while(true){
            try{
                System.out.printf("Anna positiivinen alennusprosentti valilla 0-100: ");
                alennusprosentti = sc.nextInt();
                sc.nextLine();
                if(alennusprosentti < 0 || alennusprosentti > 100) {
                    System.out.println("Anna kelvollinen alennusprosentti."); 
                }else{
                    break;
                }
            }catch(InputMismatchException ime) {
                System.out.println("Anna alennus kokonaislukuna.");
                sc.nextLine();
            }
        } 
        
        
        StandingSubscription ss = new StandingSubscription(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta, alennusprosentti);
        
        //tietojen tulostus
        System.out.println(" ");
        printSubscriptionInvoice(rs);
        System.out.println(" ");
        printSubscriptionInvoice(ss);
            
    }
    
    static void printSubscriptionInvoice(Subscription subs) {
        subs.printInvoice();
    }

}