class ThreadPriority1 extends Thread {
  public void run() {
    System.out.println("This is child Thread");
    System.out.println("Assigning Priority to the CHILD thread" + Thread.currentThread().getPriority());
  }

  public static void main(String args[]) throws Exception {
    System.out.println("This is Main Thread");
    System.out.println("The Default priority of Main Thread=" + Thread.currentThread().getPriority());

    Thread.currentThread().setPriority(MAX_PRIORITY);
    System.out.println("Assigning MaxiPriority to the main thread" + Thread.currentThread().getPriority());

    ThreadPriority1 t = new ThreadPriority1();
    t.setPriority(MIN_PRIORITY);
    t.start();

    ThreadPriority1 t1 = new ThreadPriority1();
    t1.setPriority(8);
    t1.start();

    ThreadPriority1 t2 = new ThreadPriority1();
    t2.setPriority(9);
    t2.start();

  }

}