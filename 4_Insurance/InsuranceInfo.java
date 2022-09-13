public class InsuranceInfo {
    private Property kiinteisto;
    private double vakuutusarvo;
    
    public InsuranceInfo(Property prop, double arvo) {
        kiinteisto = new Property(prop);
        vakuutusarvo = arvo;
    }
    
    public InsuranceInfo(String tyyppi_par, String sij_par, double arvo) {
        kiinteisto = new Property(tyyppi_par, sij_par);
        vakuutusarvo = arvo;
    }
    
    public void setArvo(double arvo) {
        vakuutusarvo = arvo;
    }
    public void setKiinteisto(String tyyppi_par, String sij_par) {
        kiinteisto = new Property(tyyppi_par, sij_par);
    }
    
    public double getArvo() {
        return vakuutusarvo;
    }
    
    public Property getKiinteisto() {
        return new Property(kiinteisto);
    }
    
    public String toString() {
        return "Kiinteisto: " + kiinteisto.toString() + " Sen vakuutusarvo on " + vakuutusarvo + " euroa.";
    }
    
         







}