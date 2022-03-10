public class Demo extends Thread {
  public void run() {
    System.out.println("This is thread extended run() method \t" + currentThread().getName());
    currentThread().setName("nadeem");
    System.out.println("This is thread after changing the name\t" + currentThread().getName());

  }

  public static void main(String[] args) {
    System.out.println("This is the main class method \t" + Thread.currentThread().getName());
    Demo d = new Demo();
    d.start();
  }
}
