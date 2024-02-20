package strategyPattern;

public class Wizard implements Character {
    private AttackStrategy attackStrategy;

    public Wizard() {
        this.attackStrategy = new CastSpellAtt();
    }

    @Override
    public void attack() {
        attackStrategy.attack();
    }

    @Override
    public void defend(DefenseStrategy strategy) {
        strategy.defend();
    }
}
