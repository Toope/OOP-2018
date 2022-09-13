import java.util.Scanner;
import java.util.InputMismatchException;

public class AsukasMain {
    private static final Scanner sc = new Scanner(System.in);
    public static void main( String [] args ){
        //asukkaan attribuutit
        String nimi;
        String synt_aika;
        //rakennuksen attribuutit
        double neliot;
        int huone_lkm;
        //tontin attribuutit
        String t_nimi;
        double pinta_ala;
        //koordinaattien attribuutit
        String leveys;
        String pituus;
        
        //luodaan tontti, tontin ala oltava positiivinen
        System.out.println(" ");
        System.out.println("Luodaanpas ensin tontti!");
        System.out.println(" ");
        System.out.printf("Anna tontin nimi: ");
        t_nimi = sc.nextLine();
        
        while(true){
            try{
                System.out.printf("Anna tontin pinta-ala positiivisena reaalilukuna : ");
                pinta_ala = sc.nextDouble();
                sc.nextLine();
                if(pinta_ala < 0) {
                    System.out.println("Pinta-alan oltava positiivinen.");
                }else{
                    break;
                }   
            }catch(InputMismatchException ime) {
                System.out.println("Anna pinta-ala reaalilukuna.");
                sc.nextLine();
            }
        }
        
        //koordinaattien kysely,luodaan Sijainti-olio
        do{
            System.out.println("Anna tontin 7-merkkinen leveyskoordinaatti.");
            System.out.printf("Muoto xx.xxxA, missa A on joko S tai N: ");
            leveys = sc.nextLine();
        }while(leveys.length() != 7 || leveys.charAt(2) != '.' || ((leveys.charAt(6) != 'N' && leveys.charAt(6) != 'S')));
        
        do{
            System.out.println("Anna tontin 7-merkkinen pituuskoordinaatti.");
            System.out.printf("Muoto xx.xxxA, missa A on joko E tai W: ");
            pituus = sc.nextLine();
        }while(pituus.length() != 7 || pituus.charAt(2) != '.'|| ((pituus.charAt(6) != 'E' && pituus.charAt(6) != 'W')));
             
             
        Sijainti s = new Sijainti(leveys, pituus);
        Tontti t = new Tontti(t_nimi, s, pinta_ala); 

        //luodaan rakennus mummola, koko ja huoneitten maara oltava positiivisia
        System.out.println(" ");
        System.out.println("Luodaan tontille talo!");
        System.out.println(" ");
        
        while(true){
            try{
                System.out.printf("Anna rakennuksen koko nelioissa: ");
                neliot = sc.nextDouble();
                sc.nextLine();
                if(neliot > pinta_ala) {
                    System.out.println("Talo on suurempi kuin tontti! Ei onnistu. ");
                } 
                else if(neliot < 0){
                    System.out.println("Koon on oltava positiivinen.");
                }else{
                    break;
                } 
            }catch(InputMismatchException ime) {
                System.out.println("Anna neliot reaalilukuna.");
                sc.nextLine();
            }
        }     
        
        while(true){
            try{
                System.out.printf("Anna huoneiden lukumaara, minimi on 1: ");
                huone_lkm = sc.nextInt();
                sc.nextLine();
                if(huone_lkm < 1) {
                    System.out.println("Talossa on aina ainakin yksi huone."); 
                }else{
                    break;
                }
            }catch(InputMismatchException ime) {
                System.out.println("Anna huoneiden lukumaara kokonaislukuna.");
                sc.nextLine();
            }
        }        
        
        //luodaan asukas Assi
        System.out.println(" ");
        System.out.println("Viimeisena luodaan asukas!");
        System.out.println(" ");
        System.out.printf("Anna asukkaan nimi: ");
        nimi = sc.nextLine();
        
        do{
            System.out.printf("Anna asukkaan syntyma-aika muodossa pp.kk.vv : ");
            synt_aika = sc.nextLine();
        }while(synt_aika.length() != 8 || (synt_aika.charAt(2) != '.' && synt_aika.charAt(5) != '.')); //tarkistaa syotteen oikean muodon, ei jarkevyytta
        
        Asukas assi = new Asukas(nimi, synt_aika);
        
        Rakennus mummola = new Rakennus(neliot, huone_lkm, assi);
        
        //tietojen printtaus
        System.out.println(assi.toString());
        System.out.println(mummola.toString());
        //System.out.println("Sijainti: " + s.toString());
        System.out.println(t.toString());  
        
    }
}
