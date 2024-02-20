package strategyPattern;

public class GameApp {
    public static void main(String[] args){
        Knight knight = new Knight();
        knight.attack();

        knight.defend(new ShieldDef());

        Wizard wizard = new Wizard();
        wizard.attack();

        wizard.defend(new MagicBarrierDef());

        Archer archer = new Archer();
        archer.attack();

        archer.defend(new DodgeDef());
    }
}
