package strategyPattern;

public class CastSpellAtt implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Casting spell!");
    }
}
