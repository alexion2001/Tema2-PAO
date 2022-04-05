package ro.unibuc.FactoryMethodPattern;


public class GetAnimal {

    // construieste un obiect de tipul pe care-l primeste ca parametru
    public Animal getAnimal(String tipAnimal){
        if(tipAnimal == null){
            return null;
        }
        if(tipAnimal.equalsIgnoreCase("CAINE")) {
            return new Caine();
        }
        else if(tipAnimal.equalsIgnoreCase("PISICA")) {
            return new Pisica();
        }
        return null;
    }
}
