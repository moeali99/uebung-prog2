import java.util.function.Predicate;

public class FunctionTest {
    public static void main(String[] args) {
        System.out.println("=== Lambda-Ausdrücke Test ===
");
        
        // Lambda-Ausdrücke für verschiedene Funktionen
        MyFunction quadrat = x -> x * x;
        MyFunction fakultaet = x -> {
            int result = 1;
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            return result;
        };
        
        // Test der Funktionen
        System.out.println("Quadrat von 5: " + quadrat.apply(5));
        System.out.println("Fakultät von 5: " + fakultaet.apply(5));
        
        // Predicate für gerade Zahlen
        Predicate<Integer> gerade = x -> x % 2 == 0;
        
        // Bedingte Eingabe
        MyFunction quadratGerade = quadrat.conditionateInput(gerade);
        System.out.println("Quadrat(4) mit gerader Eingabe: " + quadratGerade.apply(4));
        System.out.println("Quadrat(5) mit gerader Eingabe: " + quadratGerade.apply(5));
    }
}
