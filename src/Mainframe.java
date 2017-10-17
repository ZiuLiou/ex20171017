import javax.swing.*;

public class Mainframe extends JFrame {
    public  Mainframe(){
        initComp();

    }
    private void initComp(){
        this.setBounds(100 ,100,400,600);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
