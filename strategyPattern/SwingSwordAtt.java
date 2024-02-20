package strategyPattern;

public class SwingSwordAtt implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Swinging sword!");
    }
}
