public class Sleep extends Thread {

  public void run() {
    try {

      for (int i = 1000; i < 1010; i++) {
        Thread.sleep(1000);
        System.out.println(i);
      }
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted." + e);
    }
  }

  public static void main(String[] args) throws Exception {
    Sleep s1 = new Sleep();
    s1.start();
  }
}
