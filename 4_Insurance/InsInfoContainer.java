import java.util.Vector;

public class InsInfoContainer {
    
    private Vector<InsuranceInfo> vektori;
    
    public InsInfoContainer() {
        vektori = new Vector<InsuranceInfo>(1,1);
    }
    
    public void lisaaVakuutustieto(InsuranceInfo info) {    //lisaa olion 
        vektori.add(info);
    }
    
    public void tulostaSailio() {    //tulostaa koko sisallon
        for(int i=0;i < vektori.size(); i++) {
            InsuranceInfo joku;
            joku = vektori.get(i);
            System.out.println(joku);
        }
    }
    
    public void tulostaIsommat(double raja) {    //tulostaa rajaa isommat
        for(int i=0;i < vektori.size(); i++) {
            InsuranceInfo joku;
            joku = vektori.get(i);
            if(joku.getArvo() > raja) {
                System.out.println(joku);
            }else{
                continue;
            }
        }
    }

    public void tulostaPienemmat(double raja) {    //tulostaa rajaa pienemmat
        for(int i=0;i < vektori.size(); i++) {
            InsuranceInfo joku;
            joku = vektori.get(i);
            if(joku.getArvo() < raja) {
                System.out.println(joku);
            }else{
                continue;
            }
        }
    }    
}