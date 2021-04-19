public class JavaMascot {
  void executeAction() {
    System.out.println("The Java Mascot is about to execute an action!");
  }
}
public class Duke extends JavaMascot {
  @Override
  void executeAction() {
    super.executeAction();
    System.out.println("Duke is going to punch!");
  }
  public static void main(String... superReservedWord) {
    new Duke().executeAction();
  }
}