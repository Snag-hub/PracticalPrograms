public class MainThread implements Runnable {

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.print(i + "\t");
    }
  }

  public static void main(String[] args) {
    MainThread t1 = new MainThread();
    Thread t = new Thread(t1);
    t.start();
  }
}
