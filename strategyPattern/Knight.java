package strategyPattern;

public class Knight implements Character {
    private AttackStrategy attackStrategy;
    public Knight() {
        this.attackStrategy = new SwingSwordAtt();
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
