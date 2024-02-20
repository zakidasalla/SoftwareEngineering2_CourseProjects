package strategyPattern;

public class MagicBarrierDef implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Defending with magic barrier!");
    }
}
