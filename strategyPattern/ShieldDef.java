package strategyPattern;

public class ShieldDef implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Defending with shield!");
    }
}
