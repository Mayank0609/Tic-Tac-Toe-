import javax.swing.*; 
import java.awt.*; 

import java.awt.event.*;

class Myclass {
    Myclass() {    
        ImageIcon cross = new ImageIcon("cross.jpg");
        ImageIcon circle = new ImageIcon("circle.jpg");

        
        JFrame jf = new JFrame();

        
        jf.setLayout(null);
       
        jf.setSize(310, 450);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null); 
        jf.setVisible(true);
        JButton jb1 = new JButton();
        JButton jb2 = new JButton();
        JButton jb3 = new JButton();
        JButton jb4 = new JButton();
        JButton jb5 = new JButton();
        JButton jb6 = new JButton();
        JButton jb7 = new JButton();
        JButton jb8 = new JButton();
        JButton jb9 = new JButton();
        JButton jb10 = new JButton("RESET");
        JLabel jl = new JLabel();  
        Font f = new Font("SansSerif", 1, 30);
        jl.setFont(f);
        jl.setText("Player :1");
        
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);
        jf.add(jb6);
        jf.add(jb7);
        jf.add(jb8);
        jf.add(jb9);
        jf.add(jl);
        jf.add(jb10);

        
        jb1.setBounds(0, 50, 100, 100);
        jb2.setBounds(100, 50, 100, 100);
        jb3.setBounds(200, 50, 100, 100);
        jb4.setBounds(0, 150, 100, 100);
        jb5.setBounds(100, 150, 100, 100);
        jb6.setBounds(200, 150, 100, 100);
        jb7.setBounds(0, 250, 100, 100);
        jb8.setBounds(100, 250, 100, 100);
        jb9.setBounds(200, 250, 100, 100);
        jl.setBounds(30, 0, 270, 50);
        jb10.setBounds(0, 370, 300, 30);

        class MyListener implements ActionListener {
            int flag = 0;  
            int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
            int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0, x8 = 0, x9 = 0;

            public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == jb1) {
                    if (flag == 0) {
                        jb1.setIcon(cross);
                        flag = 1;
                        x1 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb1.setIcon(circle);
                        flag = 0;
                        c1 = 1;
                        jl.setText("Player :1");
                    }

                }

                if (ae.getSource() == jb2) {
                    if (flag == 0) {
                        jb2.setIcon(cross);
                        flag = 1;
                        x2 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb2.setIcon(circle);
                        flag = 0;
                        c2 = 1;
                        jl.setText("Player :1");
                    }

                }

                if (ae.getSource() == jb3) {
                    if (flag == 0) {
                        jb3.setIcon(cross);
                        flag = 1;
                        x3 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb3.setIcon(circle);
                        flag = 0;
                        c3 = 1;
                        jl.setText("Player :1");
                    }

                }

                if (ae.getSource() == jb4) {
                    if (flag == 0) {
                        jb4.setIcon(cross);
                        flag = 1;
                        x4 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb4.setIcon(circle);
                        flag = 0;
                        c4 = 1;
                        jl.setText("Player :1");
                    }

                }

                if (ae.getSource() == jb5) {
                    if (flag == 0) {
                        jb5.setIcon(cross);
                        flag = 1;
                        x5 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb5.setIcon(circle);
                        flag = 0;
                        c5 = 1;
                        jl.setText("Player :1");
                    }

                }

                if (ae.getSource() == jb6) {
                    if (flag == 0) {
                        jb6.setIcon(cross);
                        flag = 1;
                        x6 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb6.setIcon(circle);
                        flag = 0;
                        c6 = 1;
                        jl.setText("Player :1");
                    }

                }

                if (ae.getSource() == jb7) {
                    if (flag == 0) {
                        jb7.setIcon(cross);
                        flag = 1;
                        x7 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb7.setIcon(circle);
                        flag = 0;
                        c7 = 1;
                        jl.setText("Player :1");
                    }

                }

                if (ae.getSource() == jb8) {
                    if (flag == 0) {
                        jb8.setIcon(cross);
                        flag = 1;
                        x8 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb8.setIcon(circle);
                        flag = 0;
                        c8 = 1;
                        jl.setText("Player :1");
                    }

                }

                if (ae.getSource() == jb9) {
                    if (flag == 0) {
                        jb9.setIcon(cross);
                        flag = 1;
                        x9 = 1;
                        jl.setText("Player :2");
                    } else {
                        jb9.setIcon(circle);
                        flag = 0;
                        c9 = 1;
                        jl.setText("Player :1");
                    }

                }
                if (ae.getSource() == jb10) {
                    jf.setVisible(false);
                    new Myclass();
                }

                if ((c1 == 1 && c2 == 1 & c3 == 1) || (x1 == 1 && x2 == 1 & x3 == 1)) {
                    jb1.setIcon(new ImageIcon("green.jpg"));
                    jb2.setIcon(new ImageIcon("green.jpg"));
                    jb3.setIcon(new ImageIcon("green.jpg"));
                    if (c1 == 1 && c2 == 1 & c3 == 1) {
                        jl.setText("Player :2  WON");
                    } else {
                        jl.setText("Player :1  WON");
                    }
                    jb7.setEnabled(false);
                    jb8.setEnabled(false);
                    jb9.setEnabled(false);
                    jb4.setEnabled(false);
                    jb5.setEnabled(false);
                    jb6.setEnabled(false);
                } else if ((c4 == 1 && c5 == 1 & c6 == 1) || (x4 == 1 && x5 == 1 & x6 == 1)) {
                    jb4.setIcon(new ImageIcon("green.jpg"));
                    jb5.setIcon(new ImageIcon("green.jpg"));
                    jb6.setIcon(new ImageIcon("green.jpg"));
                    if (c4 == 1 && c5 == 1 & c6 == 1) {
                        jl.setText("Player :2  WON");
                    } else {
                        jl.setText("Player :1  WON");
                    }
                    jb1.setEnabled(false);
                    jb2.setEnabled(false);
                    jb3.setEnabled(false);
                    jb7.setEnabled(false);
                    jb8.setEnabled(false);
                    jb9.setEnabled(false);
                } else if ((c7 == 1 && c8 == 1 & c9 == 1) || (x7 == 1 && x8 == 1 & x9 == 1)) {
                    jb7.setIcon(new ImageIcon("green.jpg"));
                    jb8.setIcon(new ImageIcon("green.jpg"));
                    jb9.setIcon(new ImageIcon("green.jpg"));
                    if (c7 == 1 && c8 == 1 & c9 == 1) {
                        jl.setText("Player :2  WON");
                    } else {
                        jl.setText("Player :1  WON");
                    }
                    jb1.setEnabled(false);
                    jb2.setEnabled(false);
                    jb3.setEnabled(false);
                    jb4.setEnabled(false);
                    jb5.setEnabled(false);
                    jb6.setEnabled(false);
                } else if ((c1 == 1 && c4 == 1 & c7 == 1) || (x1 == 1 && x4 == 1 & x7 == 1)) {
                    jb1.setIcon(new ImageIcon("green.jpg"));
                    jb4.setIcon(new ImageIcon("green.jpg"));
                    jb7.setIcon(new ImageIcon("green.jpg"));
                    if (c1 == 1 && c4 == 1 & c7 == 1) {
                        jl.setText("Player :2  WON");
                    } else {
                        jl.setText("Player :1  WON");
                    }
                    jb9.setEnabled(false);
                    jb2.setEnabled(false);
                    jb3.setEnabled(false);
                    jb8.setEnabled(false);
                    jb5.setEnabled(false);
                    jb6.setEnabled(false);
                } else if ((c2 == 1 && c5 == 1 & c8 == 1) || (x2 == 1 && x5 == 1 & x8 == 1)) {
                    jb2.setIcon(new ImageIcon("green.jpg"));
                    jb5.setIcon(new ImageIcon("green.jpg"));
                    jb8.setIcon(new ImageIcon("green.jpg"));
                    if (c2 == 1 && c5 == 1 & c8 == 1) {
                        jl.setText("Player :2  WON");
                    } else {
                        jl.setText("Player :1  WON");
                    }
                    jb1.setEnabled(false);
                    jb7.setEnabled(false);
                    jb3.setEnabled(false);
                    jb4.setEnabled(false);
                    jb9.setEnabled(false);
                    jb6.setEnabled(false);
                } else if ((c3 == 1 && c6 == 1 & c9 == 1) || (x3 == 1 && x6 == 1 & x9 == 1)) {
                    jb3.setIcon(new ImageIcon("green.jpg"));
                    jb6.setIcon(new ImageIcon("green.jpg"));
                    jb9.setIcon(new ImageIcon("green.jpg"));
                    if (c3 == 1 && c6 == 1 & c9 == 1) {
                        jl.setText("Player :2  WON");
                    } else {
                        jl.setText("Player :1  WON");
                    }
                    jb1.setEnabled(false);
                    jb2.setEnabled(false);
                    jb7.setEnabled(false);
                    jb4.setEnabled(false);
                    jb5.setEnabled(false);
                    jb8.setEnabled(false);
                } else if ((c1 == 1 && c5 == 1 & c9 == 1) || (x1 == 1 && x5 == 1 & x9 == 1)) {
                    jb1.setIcon(new ImageIcon("green.jpg"));
                    jb5.setIcon(new ImageIcon("green.jpg"));
                    jb9.setIcon(new ImageIcon("green.jpg"));
                    if (c1 == 1 && c5 == 1 & c9 == 1) {
                        jl.setText("Player :2  WON");
                    } else {
                        jl.setText("Player :1  WON");
                    }
                    jb7.setEnabled(false);
                    jb2.setEnabled(false);
                    jb3.setEnabled(false);
                    jb4.setEnabled(false);
                    jb8.setEnabled(false);
                    jb6.setEnabled(false);
                } else if ((c3 == 1 && c5 == 1 & c7 == 1) || (x3 == 1 && x5 == 1 & x7 == 1)) {
                    jb3.setIcon(new ImageIcon("green.jpg"));
                    jb5.setIcon(new ImageIcon("green.jpg"));
                    jb7.setIcon(new ImageIcon("green.jpg"));
                    if (c3 == 1 && c5 == 1 & c7 == 1) {
                        jl.setText("Player :2  WON");
                    } else {
                        jl.setText("Player :1  WON");
                    }
                    jb1.setEnabled(false);
                    jb2.setEnabled(false);
                    jb8.setEnabled(false);
                    jb4.setEnabled(false);
                    jb9.setEnabled(false);
                    jb6.setEnabled(false);
                } else if ((c1 == 1 || x1 == 1) && (c3 == 1 || x3 == 1) && (c4 == 1 || x4 == 1) && (c5 == 1 || x5 == 1)
                        && (c6 == 1 || x6 == 1) && (c7 == 1 || x7 == 1) && (c8 == 1 || x8 == 1) && (c9 == 1 || x9 == 1)
                        && (c2 == 1 || x2 == 1)) {
                    jl.setText("Draw :)");
                    jb1.setEnabled(false);
                    jb2.setEnabled(false);
                    jb3.setEnabled(false);
                    jb4.setEnabled(false);
                    jb5.setEnabled(false);
                    jb6.setEnabled(false);
                    jb7.setEnabled(false);
                    jb8.setEnabled(false);
                    jb9.setEnabled(false);
                }

            }
        }

        MyListener ml = new MyListener();
        
        jb1.addActionListener(ml);
        jb2.addActionListener(ml);
        jb3.addActionListener(ml);
        jb4.addActionListener(ml);
        jb5.addActionListener(ml);
        jb6.addActionListener(ml);
        jb7.addActionListener(ml);
        jb8.addActionListener(ml);
        jb9.addActionListener(ml);
        jb10.addActionListener(ml);
    }
}

class Game {
    public static void main(String arg[]) {
        new Myclass(); 
    }
}