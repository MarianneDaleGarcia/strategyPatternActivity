public class gameApp {
    public static void main(String[] args) {
        
        character knight = new character("Knight", new swingSwordAttack(), new shieldDefense());
        character wizard = new character("Wizard", new castSpellAttack(), new createMagicDefense());
        character archer = new character("Archer", new shootArrowAttack(), new dodgeDefense());

    
        System.out.println("Knight's turn:");
        knight.performAttack();
        knight.performDefend();

        System.out.println("\nWizard's turn:");
        wizard.performAttack();
        wizard.performDefend();

        System.out.println("\nArcher's turn:");
        archer.performAttack();
        archer.performDefend();
    }
}