import java.util.Scanner;
class PankkitiliMain {
    private static final Scanner lukija = new Scanner(System.in); //skanneri
    public static void main(String [] args){
        Pankkitili tili = new Pankkitili();
        String tilinumero;
        String omistaja;
        double saldo;
    
        //kyselyt ja tietojen käyttö olion luomiseen
        System.out.printf("Anna nimi: ");
        String nimi = lukija.nextLine();
        omistaja = nimi;
        tili.setOmistaja(nimi);
        
        System.out.printf("Anna tilinumero: ");
        String tilnum = lukija.nextLine();
        tilinumero = tilnum;
        tili.setTilinumero(tilnum);

        System.out.printf("Anna saldo: ");
        double raha = lukija.nextDouble();
        saldo = raha;   
        tili.setSaldo(raha);
        
        tulostaTiliote(tili); 
        
        //otaSaldo ja lisaaSaldo + niitten rajoitukset
        while(true) {
            lukija.nextLine();
            System.out.printf("Otto (o) vai talletus (t)? Vai lopeta(l)? %n");
            String juttu = lukija.nextLine();
            
            if(juttu.equals("t")) {
                while(true) {
                    System.out.printf("Anna talletettava summa: ");
                    double summa = lukija.nextDouble();
                    if(summa > 0) {
                        tili.lisaaSaldo(summa);
                        break;
                    }
                    else {
                        System.out.printf("Ei negatiivisia summia , kiitos. %n");     
                    }
                }
            }
            else if(juttu.equals("o")) {
                while(true) {
                    System.out.printf("Anna nostettava summa: ");
                    double summa = lukija.nextDouble();
                    if(summa < 0) {     //jos saldo on negatiivinen, et voi nostaa rahaa
                        System.out.printf("Et voi nostaa rahaa, kun olet miinuksella. %n");
                        break;
                    }
                    if(summa < saldo) {    
                        if(summa > 0) {
                            tili.otaSaldo(summa);
                            break;
                        }
                        else {
                            System.out.printf("Ei negatiivisia summia, kiitos. %n"); 
                        }
                    }
                    else {
                        System.out.printf("Tililla ei ole noin paljoa rahaa. %n");  
                    }
                }
            }
            else if(juttu.equals("l")) {
                break;
            }
            else {
                System.out.printf("Virheellinen syote! Paina enteria. %n");
            }
        }
              
        tulostaTiliote(tili);         
    }
    // tilitietojen tulostus
    public static void tulostaTiliote(final Pankkitili tili) {
        System.out.println("Tilinumero on: " + tili.getTilinumero() + ". Omistaja: " + tili.getOmistaja() + ". Saldo: " +tili.getSaldo() + " euroa.");
    }
}