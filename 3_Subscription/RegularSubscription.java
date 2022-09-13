public class RegularSubscription extends Subscription {
    
    private int tilauksen_kesto;
    
    public RegularSubscription(String l_nimi, String t_nimi, String osoite, double hinta, int kesto) {
        super(l_nimi, t_nimi, osoite, hinta);
        tilauksen_kesto = kesto;
    }
    
    //setterit ja getterit
    public void setTilauksenkesto(int kesto) {
        tilauksen_kesto = kesto;
    }
    public int getTilauksenkesto() {
        return tilauksen_kesto;
    }
    
    public void printInvoice() {
        double hinta = tilauksen_kesto * getKuukausihinta();
        System.out.println("Tilauksen tyyppi: normaalitilaus.");
        System.out.println("Laskutettavat kuukaudet:" + tilauksen_kesto + ".");
        System.out.println("Lehden nimi: " + getLehdennimi() + ".");
        System.out.println("Tilaaja: " + getTilaajannimi() + ".");
        System.out.println("Osoite: " + getToimitusosoite() + ".");
        System.out.println("Hinta: " + hinta + " euroa.");
    }
}