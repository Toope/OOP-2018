import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Vt5Main {
    private static final Scanner sc = new Scanner(System.in).useLocale( new Locale("us", "US"));
    public static void main( String [] args ){
        //asukkaan attribuutit
        String nimi;
        String synt_aika;
        //rakennuksen attribuutit
        int asunto_lkm;
        double neliot;
        int huone_lkm;
        //tontin attribuutit
        String osoite;
        String t_nimi;
        double pinta_ala;
        //koordinaattien attribuutit
        String leveys;
        String pituus;
        //sailio, jossa kaikki asuntojen tiedot
        InfoContainer sailio = new InfoContainer();
        
        //luodaan tontti, tontin ala oltava positiivinen
        System.out.println(" ");
        System.out.println("Luodaanpas ensin tontti!");
        System.out.println(" ");
        System.out.printf("Anna tontin nimi: ");
        t_nimi = sc.nextLine();
        System.out.printf("Anna tontin osoite: ");
        osoite = sc.nextLine();        
        while(true){
            try{
                System.out.printf("Anna tontin pinta-ala positiivisena reaalilukuna : ");
                pinta_ala = sc.nextDouble();
                sc.nextLine();
                if(pinta_ala < 1) {
                    System.out.println("Pinta-alan oltava positiivinen ja vahintaan 1 m^2.");
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
        Tontti t = new Tontti(t_nimi, osoite, pinta_ala, s); 

        //luodaan rakennus
        System.out.println(" ");
        System.out.println("Luodaan tontille yksi rakennus!");
        System.out.println(" ");
        
        //looppi jossa valitaan minkatyyppinen talo luodaan, loopista poistutaan kun kaikki tiedot on annettu
        while(true) {
            System.out.println("Poistu painamalla mita tahansa muuta kirjainta kuin alla luetellut.");
            System.out.printf("Valitse tyyppi: kerrostalo (K), rivitalo (R) tai paritalo (P): ");
            String valinta;
            valinta = sc.nextLine();
            if(valinta.toUpperCase().charAt(0) == 'K') {
                //asuntojen maara
                while(true){
                    try{
                        System.out.printf("Anna asuntojen lukumaara, minimi on 1: ");
                        asunto_lkm = sc.nextInt();
                        sc.nextLine();
                        if(asunto_lkm < 1) {
                            System.out.println("Rakennuksessa on aina ainakin yksi asunto."); 
                        }else{
                            break;
                        }
                    }catch(InputMismatchException ime) {
                        System.out.println("Anna asuntojen lukumaara kokonaislukuna.");
                        sc.nextLine();
                    }
                }
                //asuntojen tiedot
                for(int i=0;i < asunto_lkm ; i++) {
                    System.out.println(" ");
                    System.out.println("Asunto nro." + (i+1));
                    //huone_lkm
                    while(true){
                        try{
                            System.out.printf("Anna huoneiden lukumaara, minimi on 1: ");
                            huone_lkm = sc.nextInt();
                            sc.nextLine();
                            if(huone_lkm < 1) {
                                System.out.println("Asunnossa on aina ainakin yksi huone."); 
                            }else{
                                break;
                            }
                        }catch(InputMismatchException ime) {
                            System.out.println("Anna huoneiden lukumaara kokonaislukuna.");
                            sc.nextLine();
                        }   
                    }                        
                    //koko
                    while(true){
                        try{
                            System.out.printf("Anna asunnon koko nelioissa: ");
                            neliot = sc.nextDouble();
                            sc.nextLine();
                            if(neliot > pinta_ala) {
                                System.out.println("Jo yksi asunto on suurempi kuin tontti! Ei onnistu. ");
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
                    //asukkaat
                    System.out.printf("Anna asukkaan nimi: ");
                    nimi = sc.nextLine(); 
                    
                    Asukas assi = new Asukas(nimi);
                    //Kerrostalo k = new Kerrostalo(asunto_lkm, neliot, huone_lkm, assi);
                    sailio.lisaaTieto(new Kerrostalo(asunto_lkm, neliot, huone_lkm, assi));
                }
                break;
            }
            
            else if(valinta.toUpperCase().charAt(0) == 'R') {
                //asuntojen maara
                while(true){
                    try{
                        System.out.printf("Anna asuntojen lukumaara, minimi on 1: ");
                        asunto_lkm = sc.nextInt();
                        sc.nextLine();
                        if(asunto_lkm < 1) {
                            System.out.println("Rakennuksessa on aina ainakin yksi asunto."); 
                        }else{
                            break;
                        }
                    }catch(InputMismatchException ime) {
                        System.out.println("Anna asuntojen lukumaara kokonaislukuna.");
                        sc.nextLine();
                    }
                }
                //asuntojen tiedot
                for(int i=0;i < asunto_lkm ; i++) {
                    System.out.println(" ");
                    System.out.println("Asunto nro." + (i+1));
                    //huone_lkm
                    while(true){
                        try{
                            System.out.printf("Anna huoneiden lukumaara, minimi on 1: ");
                            huone_lkm = sc.nextInt();
                            sc.nextLine();
                            if(huone_lkm < 1) {
                                System.out.println("Asunnossa on aina ainakin yksi huone."); 
                            }else{
                                break;
                            }
                        }catch(InputMismatchException ime) {
                            System.out.println("Anna huoneiden lukumaara kokonaislukuna.");
                            sc.nextLine();
                        } 
                    }                        
                    //koko
                    while(true){
                        try{
                            System.out.printf("Anna asunnon koko nelioissa: ");
                            neliot = sc.nextDouble();
                            sc.nextLine();
                            if(neliot > pinta_ala) {
                                System.out.println("Jo yksi asunto on suurempi kuin tontti! Ei onnistu. ");
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
                    //asukkaat
                    System.out.printf("Anna asukkaan nimi: ");
                    nimi = sc.nextLine(); 
                    
                    Asukas assi = new Asukas(nimi);
                    //Rivitalo r = new Rivitalo(asunto_lkm, neliot, huone_lkm, assi);
                    sailio.lisaaTieto(new Rivitalo(asunto_lkm, neliot, huone_lkm, assi));
                }
                break;
            }

            else  if(valinta.toUpperCase().charAt(0) == 'P') {
                //asuntojen maara
                System.out.println("Paritalossa on aina kaksi asuntoa.");
                asunto_lkm = 2;
                //asuntojen tiedot
                for(int i=0;i < asunto_lkm ; i++) {
                    System.out.println(" ");
                    System.out.println("Asunto nro." + (i+1));
                    //huone_lkm
                    while(true){
                        try{
                            System.out.printf("Anna huoneiden lukumaara, minimi on 1: ");
                            huone_lkm = sc.nextInt();
                            sc.nextLine();
                            if(huone_lkm < 1) {
                                System.out.println("Asunnossa on aina ainakin yksi huone."); 
                            }else{
                                break;
                            }
                        }catch(InputMismatchException ime) {
                            System.out.println("Anna huoneiden lukumaara kokonaislukuna.");
                            sc.nextLine();
                        } 
                    }                        
                    //koko
                    while(true){
                        try{
                            System.out.printf("Anna asunnon koko nelioissa: ");
                            neliot = sc.nextDouble();
                            sc.nextLine();
                            if(neliot > pinta_ala) {
                                System.out.println("Jo yksi asunto on suurempi kuin tontti! Ei onnistu. ");
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
                    //asukkaat
                    System.out.printf("Anna asukkaan nimi: ");
                    nimi = sc.nextLine(); 
                    
                    Asukas assi = new Asukas(nimi);
                    //Paritalo p = new Paritalo(asunto_lkm, neliot, huone_lkm, assi);
                    sailio.lisaaTieto(new Paritalo(asunto_lkm, neliot, huone_lkm, assi));

                }
                break;
            }
            else{
                break;
            }
        }
        //kaikkien tietojen tulostus
        System.out.println(" ");
        System.out.println("Tulostetaan tontin tiedot: ");
        System.out.println(t.toString());  
        System.out.println(" ");
        System.out.println("Tulostetaan asuntojen tiedot: ");
        System.out.println(" ");
        sailio.tulostaSailio();
    }
}
