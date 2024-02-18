public interface attackStrategy {
    void attack();
}

public class swingSwordAttack implements attackStrategy {
    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword!");
    }
}


public class castSpellAttack implements attackStrategy {
    @Override
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }
}


public class shootArrowAttack implements attackStrategy {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}