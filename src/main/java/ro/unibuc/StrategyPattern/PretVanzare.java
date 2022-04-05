package ro.unibuc.StrategyPattern;

public class PretVanzare implements Pret {
    @Override
    public float calculPret(float pret) {
        return pret * 1.5f;
    }
}
