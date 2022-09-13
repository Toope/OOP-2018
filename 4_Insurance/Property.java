public class Property {
    
    private String tyyppi;
    private String sijainti;
    
    public Property(String tyyppi_par, String sij_par) {
        tyyppi = tyyppi_par;
        sijainti = sij_par;
    }
    
    public Property(Property prop) {
        tyyppi = prop.getTyyppi();
        sijainti = prop.getSijainti();
    }
    
    public void setTyyppi(String tyyppi_par) {
        tyyppi = tyyppi_par;
    }
    
    public void setSijainti(String sij_par) {
        sijainti = sij_par;
    }
    
    public String getTyyppi() {
        return tyyppi;
    }
    
    public String getSijainti() {
        return sijainti;
    }
    
    public String toString() {
     return "Tyyppi on " + tyyppi + " ja sijainti " + sijainti + ".";
    }
}