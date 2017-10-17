import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame  extends JFrame {
    private JLabel jLabelID = new JLabel("ID:");
    private JLabel jLabelPW = new JLabel("Password:");
    private JTextField jtfID = new JTextField();
    private JTextField jtfPW = new JTextField();
    private  JButton jbtExit = new JButton("Exit");
    private  JButton jbtLogin = new JButton("Login");
    private Container cp;
    public LoginFrame(){
        initComp();

    }
    private  void initComp(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,100);
        cp = this.getContentPane();
        cp.setLayout( new GridLayout(3,2,3,3));
        jLabelID.setHorizontalAlignment(JLabel.RIGHT);
        jLabelPW.setHorizontalAlignment(JLabel.RIGHT);
        jbtExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cp.add(jLabelID);
        cp.add(jtfID);
        cp.add(jLabelPW);
        cp.add(jtfPW);
        cp.add(jbtExit);
        cp.add(jbtLogin);
    }
}
