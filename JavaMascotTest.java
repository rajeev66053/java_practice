public abstract class JavaMascot {
    public abstract void executeAction();
}
public class Duke extends JavaMascot {
    @Override
    public void executeAction() {
        System.out.println("Punch!");
    }
}
public class Juggy extends JavaMascot {
    @Override
    public void executeAction() {
        System.out.println("Fly!");
    }
}
public class JavaMascotTest {
    public static void main(String... args) {
        JavaMascot dukeMascot = new Duke();
        JavaMascot juggyMascot = new Juggy();
        dukeMascot.executeAction();
        juggyMascot.executeAction();
    }
}