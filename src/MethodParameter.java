public class MethodParameter {

  public static void main(String[] args) {

      sayHello("Yusuf", "Nur Wahid");
      sayHello("Ucup", "Ganteng");
  }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}