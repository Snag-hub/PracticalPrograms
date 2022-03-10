class JoinThread implements Runnable {

  public void run() {
    try {
      for (int i = 1000; i < 1010; i++) {
        Thread.sleep(1000);
        Thread.yield();
        System.out.println(i);
      }
    } catch (Exception e) {
      System.out.println("Thread interrupted." + e);
    }
  }

  public static void main(String[] args) {
    System.out.println("Main Thread");
    JoinThread s = new JoinThread();
    Thread t = new Thread(s);
    t.start();
    try {
      t.join();
      for (int i = 0; i < 10; i++) {
        Thread.sleep(1000);
        System.out.println(i);
      }
    } catch (Exception e) {
      System.out.println("Thread interrupted." + e);
    }
  }
}
