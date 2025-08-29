public class Person {
    private String name;
    private int alter;
    private String beruf;
    
    // Konstruktor
    public Person(String name, int alter, String beruf) {
        this.name = name;
        this.alter = alter;
        this.beruf = beruf;
    }
    
    // Getter
    public String getName() { return name; }
    public int getAlter() { return alter; }
    public String getBeruf() { return beruf; }
    
    // Setter
    public void setName(String name) { this.name = name; }
    public void setAlter(int alter) { this.alter = alter; }
    public void setBeruf(String beruf) { this.beruf = beruf; }
    
    // Methoden
    public void vorstellen() {
        System.out.println("Hallo, ich bin " + name + ", " + alter + " Jahre alt und arbeite als " + beruf + ".");
    }
    
    public static void main(String[] args) {
        Person person1 = new Person("Max Mustermann", 25, "Entwickler");
        Person person2 = new Person("Anna Schmidt", 30, "Designerin");
        
        person1.vorstellen();
        person2.vorstellen();
    }
}
