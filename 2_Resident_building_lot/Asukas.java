public class Asukas {
    
    private String nimi;
    private String synt_aika;

    public Asukas(String nimi_par, String synt_par){
        nimi = nimi_par;
        synt_aika = synt_par;
    }
    //kopiomuodostin
    public Asukas(Asukas a) {
        nimi = a.getNimi();
        synt_aika = a.getSyntaika();
    }
    //setterit ja getterit
    public void setNimi(String nimi_par) {
        nimi = nimi_par;
    }
    public void setSyntaika(String synt_par) {
        synt_aika = synt_par;
    }
    public String getNimi() {
        return nimi; 
    }
    public String getSyntaika() {
        return synt_aika;
    }

    //tulostusmetodi
    public String toString() {
        return "Asukas: " + nimi + ", syntynyt " + synt_aika + " .";
    }
   
}