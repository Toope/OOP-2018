public class Asukas {
    //tunnetaan vain nimi  -- done
    
    private String nimi;

    public Asukas(String nimi_par){
        nimi = nimi_par;
    }
    //kopiomuodostin
    public Asukas(Asukas a) {
        nimi = a.getNimi();
    }
    //setterit ja getterit
    public void setNimi(String nimi_par) {
        nimi = nimi_par;
    }

    public String getNimi() {
        return nimi; 
    }

    //tulostusmetodi
    public String toString() {
        return "Asukas: " + nimi + " .";
    }
   
}