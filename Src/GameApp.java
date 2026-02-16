public class GameApp {
    public static void main(String[] args) {

        GameCharacter knight = new Knight();
        knight.performAttack();
        knight.performDefense();

        // Change defense dynamically
        knight.setDefenseStrategy(new Dodge());
        knight.performDefense();

        GameCharacter wizard = new Wizard();
        wizard.performAttack();
        wizard.performDefense();

        GameCharacter archer = new Archer();
        archer.performAttack();
        archer.performDefense();
    }
}
