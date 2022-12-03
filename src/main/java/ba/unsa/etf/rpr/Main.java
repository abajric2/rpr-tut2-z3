package ba.unsa.etf.rpr;

public class Main {
    public static void main( String[] args ) {
        ListaBrojeva l = new ListaBrojeva();
        l.unosBrojeva();
        System.out.printf("Najmanji element je %g\n", l.nadjiMinimalniElement());
        System.out.printf("Najveci element je %g\n", l.nadjiMaksimalniElement());
        System.out.printf("Srednja vrijednost elemenata je %g\n", l.nadjiSrednjuVrijednost());
        System.out.printf("Standardna devijacija je %g\n", l.nadjiStandardnuDevijaciju());
    }
}
