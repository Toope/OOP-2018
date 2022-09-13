import java.util.Random;
import java.nio.charset.Charset;
import java.io.*;
import java.util.Vector;

public class Hirsipuu {

    private Vector<Character> charlista;
    private int arvaukset;
    private String sana_peliin;
    private String nakyva_sana;
    
    public Hirsipuu(Vector<String> slista, int arvaus_lkm) {
        charlista = new Vector<Character>(1,1);
        arvaukset = arvaus_lkm;
        
        Random rand = new Random();            //arpoo sanan
        int  n = rand.nextInt(slista.size());
        sana_peliin = slista.get(n);
    }
    
    public void setArvaukset(int arv) {
        arvaukset = arv;
    }
    public int getArvaukset() {
        return arvaukset;
    }
    
    public void setSana(String sana_p) {
        sana_peliin = sana_p;
    }
    public String getSana() {          //sama kuin public String sana() jota vaadittiin, joten en tehnyt sita uusiksi
        return sana_peliin;
    }
    
    public void setNakyvasana(String sana_peliin_p) {
        int len = sana_peliin_p.length();              //luo sanasta pelaajalle nakyvan version jossa *-merkkeja
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++){
            sb.append('*');
        }
        nakyva_sana = sb.toString();
    }  
    public String getNakyvasana() {
        return nakyva_sana;
    }


    public boolean arvaa(Character merkki) {
        String sana_peliin = getSana();
        charlista.add(merkki);
        if(sana_peliin.indexOf(merkki)!=-1){  //merkki loytyy sanasta
        
            int index = sana_peliin.indexOf(merkki);      //katsotaan missa indekseissa merkki on
            while(index >= 0) {
                StringBuilder sb = new StringBuilder(nakyva_sana);
                sb.setCharAt(index, merkki);                     //asetetaan merkki indeksin kohdalle nakyva_sanaan
                nakyva_sana = sb.toString();
                index = sana_peliin.indexOf(merkki, index + 1);
            }
            return true;
        }else{                                  //jos merkkia ei loydy
            arvaukset = arvaukset - 1; 
            return false;
        }   
    }

    public Vector<Character> arvaukset() {
        return charlista;
    }
    
    public int arvauksiaOnJaljella() {
        return arvaukset;
    }


    public boolean onLoppu() {
        if(sana_peliin.equals(nakyva_sana)) {
            return true;
        }else{
            return false;
        }
    }


}