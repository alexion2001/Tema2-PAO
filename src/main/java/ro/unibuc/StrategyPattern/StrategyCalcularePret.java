package ro.unibuc.StrategyPattern;

import java.util.Scanner;

public class StrategyCalcularePret {
    public static void main(String[] args)  {
        System.out.print("Pretul materialelor pentru produs: ");
        Scanner input= new Scanner(System.in);
        float pret_materiale = Float.parseFloat(input.nextLine());


        CalculPret pret_nou = new CalculPret(new PretProductie());
        float pretProductie = pret_nou.calculare(pret_materiale);
        System.out.println("Pretul de productie = " + pretProductie);

        pret_nou = new CalculPret(new PretVanzare());
        float pretVanzare = pret_nou.calculare(pretProductie);
        System.out.println("Pretul de vanzare = " + pretVanzare);


    }
}
