
public class Paritalo extends Rakennus {
    
    public Paritalo(int asunnot, double nelio, int huone, Asukas aa) {
        super(2, nelio, huone, aa);
    }
 
    public void printTiedot() {
        System.out.println("Rakennuksen tyyppi: kerrostalo.");
        System.out.println("Asuntojen lkm: 2 kpl.");
        System.out.println("Neliot: " + getNeliot() + " m^2.");
        System.out.println("Huoneita: " + getHuonelkm() + " kpl.");
        System.out.println("Asukkaat: " + getAsukas());     //muokkaa jos tahdot useamman asukkaan
    } 
}