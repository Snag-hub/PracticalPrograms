import java.awt.*;
import java.awt.event.*;

class ThreadClass extends Frame implements ActionListener, Runnable {
  Button b1, b2;
  TextField txt1, txt2;
  int cnt;
  Thread t1 = new Thread(this, "txt1");
  Thread t2 = new Thread(this, "txt12");

  public ThreadClass() {
    setLayout(null);
    txt1 = new TextField();
    txt2 = new TextField();
    b1 = new Button("Start");
    b2 = new Button("Stop");
    txt1.setBounds(50, 50, 100, 100);
    txt2.setBounds(160, 50, 100, 100);
    b1.setBounds(50, 170, 100, 30);
    b2.setBounds(160, 170, 100, 30);
    add(txt1);
    add(txt2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    add(b1);
    add(b2);
    setSize(400, 400);
    setVisible(true);
    cnt = 0;
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  public void actionPerformed(ActionEvent ae) {
    String str;
    str = ae.getActionCommand();
    if (str.equals("Start")) {
      t1.start();
      t2.start();
    } else if (str.equals("Stop")) {
      t1.stop();
      t2.stop();
    }
  }

  public void run() {
    try {
      for (int i = 1; i <= 100; i++) {
        txt1.setText("" + i);
        t1.sleep(150);
        txt2.setText("" + i);
        t2.sleep(150);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new ThreadClass().show();
  }
}