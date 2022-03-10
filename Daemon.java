class Daemon extends Thread {

  public void run() {
    if (Daemon.currentThread().isDaemon()) {
      System.out.println("This is Daemon Thread");
    } else {
      System.out.println("This is Non-Daemon Thread");
    }
  }

  public static void main(String[] args) {
    Daemon d1 = new Daemon();
    Daemon d2 = new Daemon();
    Daemon d3 = new Daemon();

    d1.setDaemon(true);

    d1.start();
    d2.start();
    d3.start();
  }

}
