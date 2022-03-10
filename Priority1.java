class Priority1 extends Thread{
  public void run() {
    System.out.println("under run() without setting proioryt" +currentThread().getPriority());
    currentThread().setPriority(Thread.MAX_PRIORITY);
    System.out.println("under run() with priority Set" +currentThread().getPriority());
  }
  
  public static void main(String[] args) throws Exception {
    System.out.println("Main thread" +currentThread().getPriority());
    currentThread().setPriority(MIN_PRIORITY);
    System.out.println("Main thread" +currentThread().getPriority());
    Priority1 p1 = new Priority1();
    p1.start();
  }
}