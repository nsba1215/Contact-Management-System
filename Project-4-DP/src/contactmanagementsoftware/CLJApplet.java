package contactmanagementsoftware;

import javax.swing.JApplet;

public class CLJApplet extends JApplet {
    
    @Override
    public void init() {
        MUI mg = MUI.getInstance();
        this.add(mg.getContentPane());
        this.setSize(mg.getContentPane().getSize());
        this.setMinimumSize(mg.getContentPane().getSize());
    }
}
