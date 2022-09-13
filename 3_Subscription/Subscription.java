public class Subscription {
    
    private String lehden_nimi;
    private String tilaajan_nimi;
    private String toimitusosoite;
    private double kuukausihinta;
    
    public Subscription( String l_nimi, String t_nimi, String osoite, double hinta) {
        lehden_nimi = l_nimi;
        tilaajan_nimi = t_nimi;
        toimitusosoite = osoite;
        kuukausihinta = hinta;
    }
    
    //setterit ja getterit
    public void setLehdennimi(String l_nimi) {
        lehden_nimi = l_nimi;
    }     
    public void setTilaajannimi(String t_nimi) {
        tilaajan_nimi = t_nimi;
    }
    public void setToimitusosoite(String osoite) {
        toimitusosoite = osoite;
    }    
    public void setKuukausihinta(double hinta) {
        kuukausihinta = hinta;
    }
    
    public String getLehdennimi() {
        return lehden_nimi;
    }
    public String getTilaajannimi() {
        return tilaajan_nimi;
    }
    public String getToimitusosoite() {
        return toimitusosoite;
    }
    public double getKuukausihinta() {
        return kuukausihinta;
    }
    
    public void printInvoice() {
        System.out.println("Lehden nimi: " + lehden_nimi + ". Tilaaja: " + tilaajan_nimi + ". Osoite: " + toimitusosoite + ". Hinta: " + kuukausihinta + ".");
        //periaatteessa turha
    }


}