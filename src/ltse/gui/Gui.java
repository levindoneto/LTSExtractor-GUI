//package gui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


public class Gui {
    int height = 800;
    int width = 640;
    public Gui() {
        // Settings

        JFrame guiLtse = new JFrame();
        ImageIcon img = new ImageIcon("../../../Resources/icon.png");

        // Bar
        JMenuBar bar = new JMenuBar();

        // Menus
        JMenu fileBar = new JMenu("File");
        //menu.setMnemonic(KeyEvent.VK_A);
        fileBar.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        bar.add(fileBar);

        JMenu menu = new JMenu("File");
        //menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        bar.add(menu);

        guiLtse.setIconImage(img.getImage());
        guiLtse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiLtse.setTitle("LTS Extractor");
        guiLtse.setSize(width,height);
        guiLtse.setResizable(false); // fixed size
        guiLtse.setJMenuBar(bar);
        guiLtse.setVisible(true);
    }
    public static void main(String[] args) {
        try {
            Button n = new Button("UploadFilterFile");
        } catch(Exception e){
            e.printStackTrace();
        }
        Gui appGui = new Gui();
    }
}
