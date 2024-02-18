public interface defenseStrategy {
    void defend();
}


public class shieldDefense implements defenseStrategy {
    @Override
    public void defend() {
        System.out.println("Using a shield to defend!");
    }
}


public class dodgeDefense implements defenseStrategy {
    @Override
    public void defend() {
        System.out.println("Dodging to avoid attack!");
    }
}


public class createMagicDefense implements defenseStrategy {
    @Override
    public void defend() {
        System.out.println("Creating a magic barrier for defense!");
    }
}