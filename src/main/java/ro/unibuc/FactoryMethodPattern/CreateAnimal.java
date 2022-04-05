package ro.unibuc.FactoryMethodPattern;
import java.util.*;
public class CreateAnimal {
    //clasa abstracta creaza obiecte dar in functie de decizia subclaselor
    public static void main(String args[]){
        GetAnimal animal = new GetAnimal();

        System.out.print("Ce animal ai vrea sa creezi (Caine sau Pisica): ");
        Scanner input= new Scanner(System.in);
        String tipAnimal =input.nextLine();
        Animal a = animal.getAnimal(tipAnimal);

        System.out.print("Animalul tau face ");
        a.Sunet();

    }
}
