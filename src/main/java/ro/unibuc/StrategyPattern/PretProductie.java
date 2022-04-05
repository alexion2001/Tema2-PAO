package ro.unibuc.StrategyPattern;

public class PretProductie implements Pret {
    @Override
    public float calculPret(float pret_materiale) {
        int pret_manopera = 10;
        return pret_materiale + pret_manopera;
    }
}
