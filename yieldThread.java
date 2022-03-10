class yieldThread implements Runnable {
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
    yieldThread s = new yieldThread();
    Thread t = new Thread(s);
    t.start();
    try {
      Thread.yield();
      for (int i = 0; i < 10; i++) {
        System.out.println(i);
      }
    } catch (Exception e) {
      System.out.println("Thread interrupted." + e);
    }
  }
}
