import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Vt4main {
    private static final Scanner sc = new Scanner(System.in).useLocale( new Locale("us", "US"));
    public static void main(String [] args){
        
        InsInfoContainer sailio = new InsInfoContainer();
        int kpl;
        String tyyppi;
        String sijainti;
        double vakuutusarvo;
        double arvo;
        

        System.out.println(" ");
        System.out.println("Luo vahintaan 5 oliota.");
        System.out.println(" ");
        while(true){
            try{
                System.out.print("Montako haluat: ");
                kpl = sc.nextInt();
                sc.nextLine();
                if(kpl<5){
                    System.out.println("Luo vahintaan 5.");
                }else{
                    break;
                }
            }catch(InputMismatchException ime) {
                System.out.println("Anna kokonaisluku.");
                sc.nextLine();
            }
        }
        for(int i=1; i < kpl+1; i++){
            System.out.println(" ");
            System.out.println("Kiinteisto " + i);
            System.out.print("Anna kiinteiston tyyppi: ");
            tyyppi = sc.nextLine();
            System.out.print("Anna kiinteiston sijainti: ");
            sijainti = sc.nextLine();
            while(true){
                try{
                    System.out.printf("Anna kiinteiston vakuutusarvo reaalilukuna: ");
                    vakuutusarvo = sc.nextDouble();
                    sc.nextLine();
                    if(vakuutusarvo <= 0) {
                        System.out.println("Anna nollaa suurempi arvo."); 
                    }else{
                        break;
                    }
                }catch(InputMismatchException ime) {
                    System.out.println("Anna arvo reaalilukuna.");
                    sc.nextLine();
                }
            }
            sailio.lisaaVakuutustieto(new InsuranceInfo(tyyppi, sijainti, vakuutusarvo));         
        }
        
        System.out.println(" ");
        System.out.println("Tulostetaan sailion sisalto: ");
        System.out.println(" ");
        sailio.tulostaSailio();
        
        System.out.println(" ");
        while(true){
            try{
                System.out.printf("Anna arvo niin tulostetaan kiinteistot joiden vakuutusarvo on tata pienempi: ");
                arvo = sc.nextDouble();
                sc.nextLine();
                if(arvo <= 0) {
                    System.out.println("Anna nollaa suurempi arvo."); 
                }else{
                    break;
                }
            }catch(InputMismatchException ime) {
                System.out.println("Anna arvo reaalilukuna.");
                sc.nextLine();
            }
        }
        
        System.out.println(" ");
        System.out.println("Tulostetaan kaikki, joiden vakuutusarvo on vahemman kuin " + arvo + " euroa.");
        System.out.println(" ");
        sailio.tulostaPienemmat(arvo);
        
        System.out.println(" ");
        while(true){
            try{
                System.out.printf("Anna arvo niin tulostetaan kiinteistot joiden vakuutusarvo on tata suurempi: ");
                arvo = sc.nextDouble();
                sc.nextLine();
                if(arvo <= 0) {
                    System.out.println("Anna nollaa suurempi arvo."); 
                }else{
                    break;
                }
            }catch(InputMismatchException ime) {
                System.out.println("Anna arvo reaalilukuna.");
                sc.nextLine();
            }
        }
        
        System.out.println(" ");
        System.out.println("Tulostetaan kaikki, joiden vakuutusarvo on enemman kuin " + arvo + " euroa.");
        System.out.println(" ");
        sailio.tulostaIsommat(arvo);
        
    }
}    