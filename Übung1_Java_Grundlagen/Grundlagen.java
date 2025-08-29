public class Grundlagen {
    public static void main(String[] args) {
        System.out.println("=== Java Grundlagen ===");
        
        // Variablen
        int zahl = 42;
        String text = "Hallo Welt";
        double pi = 3.14159;
        
        System.out.println("Zahl: " + zahl);
        System.out.println("Text: " + text);
        System.out.println("Pi: " + pi);
        
        // Schleife
        for (int i = 1; i <= 5; i++) {
            System.out.println("Zähler: " + i);
        }
        
        // Funktion aufrufen
        int summe = addiere(10, 20);
        System.out.println("Summe: " + summe);
    }
    
    public static int addiere(int a, int b) {
        return a + b;
    }
}
