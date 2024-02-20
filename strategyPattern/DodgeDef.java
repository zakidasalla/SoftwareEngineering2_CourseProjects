package strategyPattern;

public class DodgeDef implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Dodging attack!");
    }
}
