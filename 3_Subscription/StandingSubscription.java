public class StandingSubscription extends Subscription {
    
    private int alennusprosentti;
    
    public StandingSubscription(String l_nimi, String t_nimi, String osoite, double hinta, int ale) {
        super(l_nimi, t_nimi, osoite, hinta);
        alennusprosentti = ale;
    }    
    
    //setterit ja getterit
    public void setAlennusprosentti(int ale) {
        alennusprosentti = ale;
    }
    public int getAlennusprosentti() {
        return alennusprosentti;
    }
    
    public void printInvoice() {
        double hinta = 12 * getKuukausihinta() - ((alennusprosentti/100) * getKuukausihinta() * 12);
        System.out.println("Tilauksen tyyppi: kestotilaus.");
        System.out.println("Laskutettavat kuukaudet: 12.");
        System.out.println("Lehden nimi: " + getLehdennimi() + ".");
        System.out.println("Tilaaja: " + getTilaajannimi() + ".");
        System.out.println("Osoite: " + getToimitusosoite() + ".");
        System.out.println("Hinta: " + hinta + " euroa.");
    }
}