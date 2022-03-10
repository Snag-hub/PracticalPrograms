class Thread01 extends Thread{
  public void run() {
    System.out.println("This is thread extended run() method \t" +currentThread().getName());
  }
  public static void main(String[] args) {
    System.out.println("This is the main class method \t" +currentThread().getName());
    Thread01 t1 = new Thread01();
    t1.start();
  }
}