package main;

import java.util.ArrayList;

public class Zoo {
    private String zooname;
    ArrayList<Animal> animals = new ArrayList<>();
    int x;
public Zoo(String name){
    this.zooname = name;
} 

public void printname(){
    System.out.println(zooname);
}
public void addAnimal(String name, String spec, int age){
    animals.add(new Animal(name, spec, age));
}
public void listAnimals(){
    System.out.println(zooname + " pitää sisällään seuraavat eläimet:");
    for (Animal animal : animals) {
        animal.printSpecs();
    }
}
public void runAnimals(int rounds){
    for (Animal animal : animals) {
        for(x=0; x <= rounds; x++){
            animal.run();
        }
    } 
    
}
}
