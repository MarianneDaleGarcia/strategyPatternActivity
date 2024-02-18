public class character {
    private String type;
    private attackStrategy actionAttack;
    private defenseStrategy actionDefense;

    public Character(String type, attackStrategy actionAttack, defenseStrategy actionDefense) {
        this.type = type;
        this.actionAttack = actionAttack;
        this.actionDefense = actionDefense;
    }

    public void performAttack() {
        actionAttack.attack();
    }

    public void performDefend() {
        actionDefense.defend();
    }
}