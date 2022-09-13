public class Tontti {
    //tontilla enintaan 1 rakennus
    private String t_nimi;
    private String osoite;
    private double pinta_ala;
    private Sijainti koordinaatit;
    
    public Tontti(String nimi_par, String osoite_par, double p_ala, Sijainti sij_par) {
        t_nimi = nimi_par;
        osoite = osoite_par;
        pinta_ala = p_ala;
        koordinaatit = sij_par;
    }   
    
    public void setNimi(String nimi_par) {
        t_nimi = nimi_par;
    }
    public void setAla(double ala) {
        pinta_ala = ala;
    }
    public void setOsoite(String osoite_par) {
        osoite = osoite_par;
    }
    public void setSijainti(Sijainti sij) {
        koordinaatit = sij;
    }
    
    
    public String getNimi() {
        return t_nimi;
    }
    public double getAla() {
        return pinta_ala;
    }
    public String getOsoite() {
        return osoite;
    }
    public String getSijainti() {
        return koordinaatit.toString();
    }
    
    
    public String toString() {
        return "Tontti: " + t_nimi + ", osoite: " + osoite + ", " + pinta_ala + " m^2, sijainti: " + koordinaatit.toString() + " .";
    }
   
}