public class IfStatement {

  public static void main(String[] args) {

    var nilai = 80;
    var absen = 30;

    if (nilai >= 75 && absen >= 75) {
      System.out.println("Selamat Anda Lulus");
    } else {
      System.out.println("Maaf Anda Tidak Lulus");
    }

    if (nilai >= 80 && absen >= 80) {
      System.out.println("Nilai Anda Adalah A");
    } else if (nilai >= 70 && absen >= 70) {
      System.out.println("Nilai Anda Adalah B");
    } else if (nilai >= 60 && absen >= 60) {
      System.out.println("Nilai Anda Adalah C");
    } else if (nilai >= 50 && absen >= 50) {
      System.out.println("Nilai Anda Adalah D");
    } else {
      System.out.println("Nilai Anda Adalah E");
    }
  }
}
