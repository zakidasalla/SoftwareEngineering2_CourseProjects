package strategyPattern;

public class Archer implements Character {
    private AttackStrategy attackStrategy;

    public Archer() {
        this.attackStrategy = new ShootArrowAtt();
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
