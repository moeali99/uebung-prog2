public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int zahl = Integer.parseInt("abc");
            System.out.println("Zahl: " + zahl);
        } catch (NumberFormatException e) {
            System.out.println("Fehler beim Parsen: " + e.getMessage());
        } finally {
            System.out.println("Finally-Block wird immer ausgeführt.");
        }
        
        try {
            int[] array = {1, 2, 3};
            System.out.println("Element: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array-Index-Fehler: " + e.getMessage());
        }
        
        System.out.println("Programm läuft weiter...");
    }
}
