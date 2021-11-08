public class ForEach {

  public static void main(String[] args) {

    String[] names = {"Yusuf", "Nur", "Wahid", "Ucup", "Ganteng"};

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    System.out.println("FOR EACH");

    for (var value : names) {
      System.out.println(value);
    }
  }
}
