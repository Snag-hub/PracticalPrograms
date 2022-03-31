//Allow main thread to excute first
class JoinThread1 implements Runnable {
  static Thread mainthread;

  public void run() {
    try {
      for (int i = 6; i <= 10; i++) {
        mainthread.join();
        System.out.println("Child Thread");
        System.out.println(i);
        Thread.sleep(1000);

      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String args[]) {
    mainthread = Thread.currentThread();
    JoinThread1 d = new JoinThread1();
    Thread t = new Thread(d);
    t.start();

    try {
      for (int i = 1; i <= 5; i++) {

        System.out.println("Main Thread");
        System.out.println(i);
        Thread.sleep(1000);

      }
    } catch (Exception e) {
    }

  }

}