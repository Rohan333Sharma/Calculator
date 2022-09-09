import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class calculator extends WindowAdapter implements ActionListener, KeyListener
{
    Frame f;
    JTextField t1;
    Color c;
    Font ft;
    MenuBar mb;
    Menu m1, m2, m3;
    MenuItem m11, m12, m13, m14, m15, m16, m17, m18, m19, m110, ml1, ml2, ml3;
    Button bmc, bmr, bms, bm1, bm2, bback, bce, bc, bsign, broot, bnum7, bnum8, bnum9, bdiv, bpercent;
    Button bnum4, bnum5, bnum6, bmul, bdivx, bnum1, bnum2, bnum3, bsubs, bequal, bnum0, bpoint, badd;
    String tf;
    char ch;
    float x,y;

    calculator()
    {
        f = new Frame("Calculator");
        t1 = new JTextField("0");
        ft = new Font("Segoe UI",1,18);
        tf = new String();

        c = new Color(240, 240, 240);
        mb = new MenuBar();
        m1 = new Menu("View");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        m11 = new MenuItem("Standard");
        m12 = new MenuItem("Scientific");
        m13 = new MenuItem("Programmer");
        m14 = new MenuItem("Statistics");
        ml1 = new MenuItem("-");
        m15 = new MenuItem("History");
        m16 = new MenuItem("Digit grouping");
        ml2 = new MenuItem("-");
        m17 = new MenuItem("Basic");
        m18 = new MenuItem("Unit conversion");
        m19 = new MenuItem("Date calcuation");
        m110 = new MenuItem("Worksheet");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(ml1);
        m1.add(m15);
        m1.add(m16);
        m1.add(ml2);
        m1.add(m17);
        m1.add(m18);
        m1.add(m19);
        m1.add(m110);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.addKeyListener(this);
        f.setLayout(null);
        f.setMenuBar(mb);
        t1.setBounds(15, 55, 210, 50);
        t1.setBackground(c);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setFont(ft);
        f.add(t1);

        bmc = new Button("MC");
        bmc.setBounds(15, 110, 35, 30);
        bmr = new Button("MR");
        bmr.setBounds(58, 110, 35, 30);
        bms = new Button("MS");
        bms.setBounds(101, 110, 35, 30);
        bm1 = new Button("M+");
        bm1.setBounds(144, 110, 35, 30);
        bm2 = new Button("M-");
        bm2.setBounds(187, 110, 35, 30);
        bback = new Button("<-");
        bback.setBounds(15, 148, 35, 30);
        bce = new Button("CE");
        bce.setBounds(58, 148, 35, 30);
        bc = new Button("C");
        bc.setBounds(101, 148, 35, 30);
        bsign = new Button("+/-");
        bsign.setBounds(144, 148, 35, 30);
        broot = new Button("\u221A");
        broot.setBounds(187, 148, 35, 30);
        bnum7 = new Button("7");
        bnum7.setBounds(15, 186, 35, 30);
        bnum8 = new Button("8");
        bnum8.setBounds(58, 186, 35, 30);
        bnum9 = new Button("9");
        bnum9.setBounds(101, 186, 35, 30);
        bdiv = new Button("/");
        bdiv.setBounds(144, 186, 35, 30);
        bpercent = new Button("%");
        bpercent.setBounds(187, 186, 35, 30);
        bnum4 = new Button("4");
        bnum4.setBounds(15, 224, 35, 30);
        bnum5 = new Button("5");
        bnum5.setBounds(58, 224, 35, 30);
        bnum6 = new Button("6");
        bnum6.setBounds(101, 224, 35, 30);
        bmul = new Button("*");
        bmul.setBounds(144, 224, 35, 30);
        bdivx = new Button("1/x");
        bdivx.setBounds(187, 224, 35, 30);
        bnum1 = new Button("1");
        bnum1.setBounds(15, 262, 35, 30);
        bnum2 = new Button("2");
        bnum2.setBounds(58, 262, 35, 30);
        bnum3 = new Button("3");
        bnum3.setBounds(101, 262, 35, 30);
        bsubs = new Button("-");
        bsubs.setBounds(144, 262, 35, 30);
        bequal = new Button("=");
        bequal.setBounds(187, 262, 35, 68);
        bnum0 = new Button("0");
        bnum0.setBounds(15, 300, 78, 30);
        bpoint = new Button(".");
        bpoint.setBounds(101, 300, 35, 30);
        badd = new Button("+");
        badd.setBounds(144, 300, 35, 30);

        bnum1.addActionListener(this);
        bnum2.addActionListener(this);
        bnum3.addActionListener(this);
        bnum4.addActionListener(this);
        bnum5.addActionListener(this);
        bnum6.addActionListener(this);
        bnum7.addActionListener(this);
        bnum8.addActionListener(this);
        bnum9.addActionListener(this);
        bnum0.addActionListener(this);
        badd.addActionListener(this);
        bsubs.addActionListener(this);
        bequal.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        broot.addActionListener(this);
        bsign.addActionListener(this);
        bpoint.addActionListener(this);
        bback.addActionListener(this);
        bc.addActionListener(this);

        f.add(bmc);
        f.add(bmr);
        f.add(bms);
        f.add(bm1);
        f.add(bm2);
        f.add(bback);
        f.add(bce);
        f.add(bc);
        f.add(bsign);
        f.add(broot);
        f.add(bnum7);
        f.add(bnum8);
        f.add(bnum9);
        f.add(bdiv);
        f.add(bpercent);
        f.add(bnum4);
        f.add(bnum5);
        f.add(bnum6);
        f.add(bmul);
        f.add(bdivx);
        f.add(bnum1);
        f.add(bnum2);
        f.add(bnum3);
        f.add(bsubs);
        f.add(bequal);
        f.add(bnum0);
        f.add(bpoint);
        f.add(badd);
        f.addWindowListener(this);
        f.setSize(240, 345);
        f.setVisible(true);

    }

    public static void main(String ar[])
    {
        calculator c = new calculator();
    }

    public void windowClosing(WindowEvent we)
    {
     f.dispose();
    }
    
    public void keyPressed(KeyEvent e)
   {
    t1.setText("" + e.getKeyCode());
   }
    
   public void keyTyped(KeyEvent e)
   {
    t1.setText("" + e.getKeyChar());
   }
   
   public void keyReleased(KeyEvent e)
   {
    t1.setText("" + e.getKeyCode());
   }

    public void actionPerformed(ActionEvent e)
    {
        
        float temp;
        Button b = (Button) e.getSource();
        temp = Float.parseFloat(t1.getText());

        if(b == badd)
        {
            x = temp;
            ch = '+';
            t1.setText("0");
        }

        else if(b == bsubs)
        {
            x = temp;
            ch = '-';
            t1.setText("0");
        }

        else if(b == bmul)
        {
            x = temp;
            ch = '*';
            t1.setText("0");
        }

        else if(b == bdiv)
        {
            x = temp;
            ch = '/';
            t1.setText("0");
        }

        else if(b == broot)
        {
            tf = t1.getText();
            double d = Double.parseDouble(tf);
            double result = Math.sqrt(d);
            tf = "" + result;
            t1.setText(tf);
        }

        else if(b == bsign)
        {
            tf = t1.getText();
            String sign = "-";
            if(!tf.equals("0") && !tf.contains(sign))
            {
                tf = "-" + t1.getText();
                t1.setText(tf);
            }
            else if(tf.contains(sign))
            {
                tf = tf.substring(1,tf.length());
                t1.setText(tf);
            }
        }

        else if(b == bpoint)
        {
            tf = t1.getText();
            String point = ".";
            if(!tf.contains(point))
            {
                tf = t1.getText() + point;
                t1.setText(tf);
            }
        }

        else if(b == bpercent)
        {
            x = temp;
            ch = '%';
            t1.setText("0");
        }

        else if(b == bequal)
        {
            if(ch == '+')
            {
                y = x + temp;
                tf = ""+y;
                t1.setText(tf);
            }
            else if(ch == '-')
            {
                y = x - temp;
                tf = ""+y;
                t1.setText(tf);
            }
            else if(ch == '*')
            {
                y = x * temp;
                tf = ""+y;
                t1.setText(tf);
            }
            else if(ch == '/')
            {
                y = x / temp;
                tf = ""+y;
                t1.setText(tf);
            }
            else if(ch == '%')
            {
                y = x * (temp/100);
                tf = ""+y;
                t1.setText(tf);
            }
        }

        else if(b == bback)
        {
            tf = t1.getText();
            int len = tf.length();
            if(len == 1)
            {
                tf = "0";
                t1.setText(tf);
            }
            else
                tf = tf.substring(0, len-1);
                t1.setText(tf);
        }

        else if(b == bc)
        {
            t1.setText("0");
            x=0;
            y=0;
            temp=0;
        }

        else
        {
            if (t1.getText().equals("0"))
            {
                tf = b.getLabel();
                t1.setText(tf);
            }
            else
            {
                tf = t1.getText() + b.getLabel();
                t1.setText(tf);
            }
        }
    }
}