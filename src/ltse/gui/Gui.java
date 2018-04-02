import javax.swing.JFrame;
public class Gui {
    public Gui() {
        JFrame guiLtse = new JFrame();
        guiLtse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiLtse.setTitle("LTSE");
        guiLtse.setSize(640,800);
        guiLtse.setVisible(true);
    }
    public static void main(String[] args) {
        Gui appGui = new Gui();
    }
}
