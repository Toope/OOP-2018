import java.util.Vector;
//laita ... tilalle mita tyyppia tiedot tulevat olemaan
public class InfoContainer {
    
    private Vector<Rakennus> vektori;
    
    public InfoContainer() {
        vektori = new Vector<Rakennus>(1,1);
    }
    
    public void lisaaTieto(Rakennus info) {    //lisaa olion 
        vektori.add(info);
    }
    
    public void tulostaSailio() {    //tulostaa koko sisallon
        for(int i=0;i < vektori.size(); i++) {
            Rakennus joku;
            joku = vektori.get(i);
            System.out.println("Asunto " + (i+1));
            joku.printTiedot();
            System.out.println(" ");
        }
    }    
}