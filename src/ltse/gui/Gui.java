import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class Gui {
    int height = 800;
    int width = 640;
    public Gui() {
        JFrame guiLtse = new JFrame();
        ImageIcon img = new ImageIcon("../../../Resources/icon.png");
        guiLtse.setIconImage(img.getImage());
        guiLtse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiLtse.setTitle("LTS Extractor");
        guiLtse.setSize(width,height);
        guiLtse.setResizable(false); // fixed size
        guiLtse.setVisible(true);
    }
    public static void main(String[] args) {
        Gui appGui = new Gui();
    }
}
