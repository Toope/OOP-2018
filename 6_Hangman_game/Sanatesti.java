import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
import java.nio.charset.Charset;
import java.io.*;
import java.util.List;

public class Sanatesti {
    private static final Scanner sc = new Scanner(System.in).useLocale( new Locale("us", "US"));
    public static void main( String [] args ){
        
        Sanalista sas = new Sanalista("sanat.txt");
        System.out.println(sas.annaSanat());
        
        Hirsipuu hih = new Hirsipuu(sas.annaSanat(), 10); 
        System.out.println(hih.sana());
    }
}

//tiedoston lukeminen toimii, sanan arpominen toimii