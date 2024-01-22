package main;

public class Animal {
    private String animalName;
    private String animalSpecie;
    private int animalAge;


public Animal (String name, String spec, int age ){
    this.animalName = name;
    this.animalSpecie = spec;
    this.animalAge = age;

}
public void printSpecs (){
    System.out.println(animalSpecie + ": " + animalName + ", " + animalAge + " vuotta");
}

public void run(){
    System.out.println(animalName + " juoksee kovaa vauhtia!");


}
}
