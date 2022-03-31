import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ThreadGUI extends JFrame implements ActionListener, Runnable {
  Thread th = new Thread(this);
  JTextField text;
  JButton b1, b2;
  JPanel P;

  ThreadGUI() {
    P = new JPanel();
    P.setSize(300, 300);
    P.setLayout(new BorderLayout());
    P.setVisible(true);
    text = new JTextField(20);
    text.setBounds(100, 100, 100, 30);
    P.add(text, BorderLayout.CENTER);
    b1 = new JButton("Start");
    b1.setBounds(100, 10, 100, 30);
    P.add(b1, BorderLayout.CENTER);
    b1.addActionListener(this);
  }

  public void run() {
    try {
      for (int i = 1; i <= 50; i++) {
        text.setText(String.valueOf(i));
        Thread.sleep(1000);
      }
    } catch (Exception e) {
    }
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      th.start();
    }
  }

  public static void main(String[] args) {
    ThreadGUI gui = new ThreadGUI();
  }
}
