public class Rakennus {
    
    private int asunto_lkm;
    private double neliot;
    private int huone_lkm;
    private Asukas a;
    
    //konstruktorit joista eka luottaa Asukas-kopiomuodostimeen
    public Rakennus(int asunnot, double nelio, int huone, Asukas aa) {
        asunto_lkm = asunnot;
        neliot = nelio;
        huone_lkm = huone;
        a = new Asukas(aa);
    }
    public Rakennus(int asunnot, double nelio, int huone, String nimi_par) {
        asunto_lkm = asunnot;
        neliot = nelio;
        huone_lkm = huone;
        a = new Asukas(nimi_par);
    }
    //setterit ja getterit
    
    public void setAsunnot(int asunnot) {
        asunto_lkm = asunnot;
    }
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

    public int getAsunnot() {
        return asunto_lkm;
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

    
    //tulostusmetodi
    /*public String toString() {
        return "Koko: " + asunto_lkm + " asuntoa, " + neliot + " m^2, " + huone_lkm + " huonetta, " + a.toString();
    }*/
    
    public void printTiedot() {
        System.out.println("Rakennus.");
    }

}