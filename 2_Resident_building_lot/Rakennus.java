public class Rakennus {
    
    private double neliot;
    private int huone_lkm;
    private Asukas a;
    
    //konstruktorit joista eka luottaa Asukas-kopiomuodostimeen
    public Rakennus(double nelio, int huone, Asukas aa) {
        neliot = nelio;
        huone_lkm = huone;
        a = new Asukas(aa);
    }
    public Rakennus(double nelio, int huone, String nimi_par, String synt_par) {
        neliot = nelio;
        huone_lkm = huone;
        a = new Asukas(nimi_par, synt_par);
    }
    //setterit ja getterit
    public void setNeliot(double nelio) {
        neliot = nelio;
    }
    public void setHuonelkm(int huone) {
        huone_lkm = huone; 
    }
    public void setAsukas(Asukas aa) {
        a = new Asukas(aa);
    }
    public void setAsukasNimi(String nimi_par) {                  
        a.setNimi(nimi_par);  
    }
    public void setAsukasSyntaika(String synt_par) {
        a.setSyntaika(synt_par);   
    }
    
    
    public double getNeliot() {
        return neliot;
    }
    public int getHuonelkm() {
        return huone_lkm; 
    }
    public Asukas getAsukas() {
        return new Asukas(a);
    }
    public String getAsukasNimi() {                              
        return a.getNimi();
    }
    public String getAsukasSyntaika() {
        return a.getSyntaika();
    }
    
    //tulostusmetodi
    public String toString() {
        return "Rakennus: " + neliot + " m^2, " + huone_lkm + " huonetta, " + a.toString();
    }

}