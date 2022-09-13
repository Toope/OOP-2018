class Pankkitili {
    //jäsenmuuttujat
    private String tilinumero;            
    private String omistaja;
    private double saldo;               
    
    // muodostimet
    public Pankkitili() {   //muodostaa tyhjän 
        tilinumero = null;
        omistaja = null;
        saldo = 0;
    }
    public Pankkitili(final String tilnum, final String henkilo, final double raha) {   //muodostaa "valmiin"
        tilinumero = tilnum;
        omistaja = henkilo;
        saldo = raha;
    }
    //getterit
    public String getTilinumero() {
        return tilinumero;
    }
    public String getOmistaja() {
        return omistaja;
    }
    public double getSaldo() {
        return saldo;
    }
    //setterit
    public void setTilinumero(String tilnum) {
        tilinumero = tilnum;
    }
    public void setOmistaja(String nimi) {
        omistaja = nimi;
    }
    public void setSaldo(double raha) {       
        saldo = raha;
    }  
    //tililtä otto
    public void otaSaldo(double summa) {
        saldo = saldo - summa;
    }
    // tilille talletus
    public void lisaaSaldo(double summa) {
        saldo = saldo + summa;
    }          
}  
    