package strategyPattern;

public interface Character {
    public void attack();
    public void defend(DefenseStrategy strategy);
}
