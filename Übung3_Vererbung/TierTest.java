// Basisklasse
abstract class Tier {
    protected String name;
    protected int alter;
    
    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }
    
    public abstract void macheGeraeusch();
    
    public void vorstellen() {
        System.out.println("Ich bin " + name + " und bin " + alter + " Jahre alt.");
    }
}

// Unterklasse Hund
class Hund extends Tier {
    public Hund(String name, int alter) {
        super(name, alter);
    }
    
    @Override
    public void macheGeraeusch() {
        System.out.println("Wuff! Wuff!");
    }
}

// Unterklasse Katze
class Katze extends Tier {
    public Katze(String name, int alter) {
        super(name, alter);
    }
    
    @Override
    public void macheGeraeusch() {
        System.out.println("Miau!");
    }
}

// Hauptklasse
public class TierTest {
    public static void main(String[] args) {
        Hund hund = new Hund("Bello", 3);
        Katze katze = new Katze("Mieze", 2);
        
        hund.vorstellen();
        hund.macheGeraeusch();
        
        katze.vorstellen();
        katze.macheGeraeusch();
    }
}
