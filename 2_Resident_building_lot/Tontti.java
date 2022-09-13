public class Tontti {
    
    private String t_nimi;
    private Sijainti koordinaatit;
    private double pinta_ala;
    
    public Tontti(String nimi_par, Sijainti sij_par, double p_ala) {
        t_nimi = nimi_par;
        koordinaatit = sij_par;
        pinta_ala = p_ala;
    }   
    
    public void setNimi(String nimi_par) {
        t_nimi = nimi_par;
    }
    public void setAla(double ala) {
        pinta_ala = ala;
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
    
    public String getSijainti() {
        return koordinaatit.toString();
    }
    
    public String toString() {
        return "Tontti: " + t_nimi + ", sijainti: " + koordinaatit.toString() + ", " + pinta_ala + " m^2.";
    }
   
}