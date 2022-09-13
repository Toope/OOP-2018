import java.nio.charset.Charset;
import java.io.*;
import java.util.Scanner;

public class HirsiMain {
    
    private static final Scanner sc = new Scanner(System.in);
    public static void main( String [] args ){
        
        Sanalista sas = new Sanalista("sanat.txt");               //sanalistan luku
        Hirsipuu hih = new Hirsipuu(sas.annaSanat(), 5);         //sanan arpominen
        hih.setNakyvasana(hih.getSana());
        
        System.out.println(" ");
        System.out.println("Tervetuloa hirsipuu-peliin!");
        System.out.println("Arvaa sana: " +hih.getNakyvasana());
        System.out.println(" ");
        
        while(hih.onLoppu() == false) {
            System.out.println("Paina A - arvaa kirjain, N - nayta jo arvatut kirjaimet, J - nayta jaljella olevien arvausten maara tai Q - lopeta peli.");
            System.out.printf("Valintasi: ");
            String valinta;
            valinta = sc.nextLine();
            if(valinta.toUpperCase().charAt(0) == 'A') {
                String kirjain;
                Character kar;
                if(hih.arvauksiaOnJaljella() != 0) {
                    do{
                        System.out.printf("Anna yksi kirjain: ");
                        kirjain = sc.nextLine();
                        kar = kirjain.toLowerCase().charAt(0);
                    }while(kirjain.length() != 1 || Character.isLetter(kar) == false);  //tarkistimet
                    boolean arvaus = hih.arvaa(kar);
                    if(arvaus == true){
                        System.out.println("Oikein arvattu!");
                    }else{
                        System.out.println("Ohi meni!");
                    }
                }else{
                    System.out.println("Arvaukset ovat loppu!");
                    System.out.println("Sana olisi ollut: " + hih.getSana());
                    
                }
                System.out.println(" ");
                System.out.println("Sana: " +hih.getNakyvasana());
                System.out.println(" ");
            }
            else if(valinta.toUpperCase().charAt(0) == 'N') {
                
                System.out.println("Jo arvatut kirjaimet: ");
                System.out.println(hih.arvaukset());
                System.out.println(" ");
                System.out.println("Sana: " +hih.getNakyvasana());
                System.out.println(" ");
                
            }
            else if(valinta.toUpperCase().charAt(0) == 'J') {
                
                System.out.println("Jaljella olevien arvausten maara: " + hih.arvauksiaOnJaljella() + " kpl.");  
                System.out.println(" ");  
                System.out.println("Sana: " +hih.getNakyvasana());
                System.out.println(" ");                
                
            }
            else if(valinta.toUpperCase().charAt(0) == 'Q') {
                System.out.println("Hei hei!");
                break;
            }
            else{
                continue;
            }
        }
        if(hih.onLoppu() == true) {
            System.out.println("Voitit pelin!");
        }else{
            System.out.println("Parempi tuuri ensi kerralla!");
        }
            
    }
}



