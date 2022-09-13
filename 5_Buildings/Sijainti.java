
public class Sijainti {
    private String leveys;
    private String pituus;    //7-merkkiset 
    
    public Sijainti(String lev_par, String pit_par) {
        leveys = lev_par;
        pituus = pit_par;
    }
    public void setLeveys(String lev_par) {
        leveys = lev_par;
    }
    public void setPituus(String pit_par) {
        pituus = pit_par;
    }
    public String getLeveys() {
        return leveys;
    }
    public String getPituus() {
        return pituus;
    }
    public String toString() {
        return "(" + leveys + "," + pituus + ")";
    }
}
    
    
    