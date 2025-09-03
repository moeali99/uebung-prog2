public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("=== LinkedList Test ===");
        
        LinkedList<String> stringList = new LinkedList<>();
        stringList.addLast("Hallo");
        stringList.addLast("Welt");
        stringList.addLast("Java");
        
        System.out.println("String-Liste:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Index " + i + ": " + stringList.get(i));
        }
        
        LinkedList<Integer> intList = new LinkedList<>();
        intList.addLast(1);
        intList.addLast(2);
        intList.addLast(3);
        
        System.out.println("
Integer-Liste:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("Index " + i + ": " + intList.get(i));
        }
        
        System.out.println("
Entferne erstes Element: " + intList.removeFirst());
        System.out.println("Liste nach removeFirst:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("Index " + i + ": " + intList.get(i));
        }
    }
}
