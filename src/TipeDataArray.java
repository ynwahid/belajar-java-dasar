public class TipeDataArray {

  public static void main(String[] args) {
    String[] stringArray;
    stringArray = new String[3];
    stringArray[0] = "Yusuf";
    stringArray[1] = "Nur";
    stringArray[2] = "Wahid";

    for (int i = 0; i < stringArray.length; i++) {
      System.out.println(stringArray[i]);
    }

    String[] stringArray2 = new String[3];

    String[] namaName = {"Yusuf", "Nur", "Wahid"};

    int[] arrayInt = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    long[] arrayLong = {10L, 20L, 30L};

    System.out.println(arrayLong.length);

    String[][] members = {{"Yusuf", "Nur", "Wahid"}, {"Ucup", "Ganteng"}, {"Cakcup"}};

    System.out.println(members[0][1]);
    System.out.println(members[1][0]);
  }
}
