package strategyPattern;

public class ShootArrowAtt implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Shooting arrow!");
    }
}
