import java.math.BigDecimal;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args) {
        System.out.println("Hello world!");

        String uzivatel = "Karel";
        System.out.println(uzivatel);

        int pocetLekci = 10;
        System.out.println(pocetLekci);

        double cena = 10.0;
        System.out.println(cena);

        BigDecimal totalPriceBig = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            totalPriceBig = totalPriceBig.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(totalPriceBig);

        BigDecimal cena2 = BigDecimal.ZERO;
        cena2 = cena2.add(BigDecimal.valueOf(0.1));
        System.out.println(cena2);

        String vykonMotoru = "120";
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");

        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+ velikostKosile);

        System.out.println("Metoda skoro bez chybičky!");
    }
}
