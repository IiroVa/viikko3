package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {   Scanner sc = new Scanner(System.in);
        String elaintarha;
        boolean exit = false;
        int age;
        String name;
        String spec;
        int rounds;
        

        System.out.println( "Anna eläintarhalle nimi: " );
        elaintarha  = sc.nextLine();
        Zoo zoo = new Zoo(elaintarha);
        while(exit == false){
            System.out.println("Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
        
        
        if(sc.hasNext()){
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);
        
            switch(i){
                case 1:
                    System.out.println("Mikä laji?");
                    spec = sc.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    name = sc.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    String stringInput2 = sc.nextLine();
                    age = Integer.parseInt(stringInput2);
                    zoo.addAnimal(name, spec, age);
                    
                    
                    break;

                case 2:
                    zoo.listAnimals();

                    break;
                case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    rounds = Integer.parseInt(sc.nextLine());
                    System.out.println(rounds);
                    zoo.runAnimals(rounds);
                    break;

                 case 0:
                 System.out.println("Kiitos ohjelman käytöstä.");
                 exit = true;
                 break;

                 default:
                 System.out.println("Syöte oli väärä");
                 
                 break;
           }
        
            
        }
        }
        
    }
    
}