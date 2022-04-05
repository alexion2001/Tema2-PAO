package ro.unibuc.StrategyPattern;

public class CalculPret {
    private Pret pret;

    public CalculPret( Pret pret){
        this.pret = pret;
    }

    public float calculare(float p){
        return pret.calculPret(p);
    }
}
