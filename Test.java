public class Test extends Thread {

  public void run() {
    System.out.println("This is thread extended run() method \t" + Thread.currentThread().getName());
    System.out.println("This is is Alive or not \t" + Thread.currentThread().isAlive());
    Thread.currentThread().setName("nadeem");
    System.out.println("This is thread after changing the name\t" + Thread.currentThread().getName());
    System.out.println("This is is Alive or not \t" + Thread.currentThread().isAlive());

  }

  public static void main(String[] args) {
    System.out.println("This is the main class method \t" + Thread.currentThread().getName());
    System.out.println("This is is Alive or not \t" + Thread.currentThread().isAlive());
    Test t = new Test();
    t.start();
  }
}
