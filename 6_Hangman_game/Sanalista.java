import java.nio.charset.Charset;
import java.io.*;
import java.util.Vector;
public class Sanalista {

    private Vector<String> lista;
    
    public Sanalista(String tiedosto) {
        Charset utf8 = Charset.forName("UTF-8"); 
        try (BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(tiedosto), utf8))) {      
            String rivi; 
            lista = new Vector<String>(1,1);
            while((rivi = file.readLine()) != null ){                
                //System.out.println(rivi);    
                lista.add(rivi); 
            }            
        }catch( IOException ioe ){            
            System.out.println("Virhe lukemisessa");            
            ioe.printStackTrace();        
        }
    }        
    
    public Vector<String> annaSanat() {
        return lista;
    }

}



