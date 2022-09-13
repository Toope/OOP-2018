
public class Rivitalo extends Rakennus {
    
    public Rivitalo(int asunnot, double nelio, int huone, Asukas aa) {
        super(asunnot, nelio, huone, aa);
    }

    public void printTiedot() {
        System.out.println("Rakennuksen tyyppi: rivitalo.");
        System.out.println("Asuntojen lkm: " + getAsunnot() + " kpl.");
        System.out.println("Neliot: " + getNeliot() + " m^2.");
        System.out.println("Huoneita: " + getHuonelkm() + " kpl.");
        System.out.println("Asukkaat: " + getAsukas());     //muokkaa jos tahdot useamman asukkaan
    }
    
}