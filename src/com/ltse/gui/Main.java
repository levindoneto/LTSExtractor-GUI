package com.ltse.gui;

import com.ltse.gui.components.Bar;
import com.ltse.gui.components.Button;
import com.ltse.gui.components.Panel;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
public class Main {
    private int height = 800;
    private int width = 640;
    public Main() {
        // Settings
        JFrame guiLtse = new JFrame();
        ImageIcon img = new ImageIcon("../../../Resources/icon.png");

        // Bar
        JMenuBar bar = new JMenuBar();

        // Menus
        JMenu fileBar = new JMenu(UIUtils.getText("bar.file"));
        //menu.setMnemonic(KeyEvent.VK_A);
        fileBar.getAccessibleContext().setAccessibleDescription(
                "File options of the LTS Extractor"
        );
        bar.add(fileBar);

        JMenu editBar = new JMenu(UIUtils.getText("bar.edit"));
        //menu.setMnemonic(KeyEvent.VK_A);
        editBar.getAccessibleContext().setAccessibleDescription(
                "Edit a model from the LTS Extractor platform"
        );
        bar.add(editBar);

        JMenu helpBar = new JMenu(UIUtils.getText("bar.help"));
        //menu.setMnemonic(KeyEvent.VK_A);
        helpBar.getAccessibleContext().setAccessibleDescription(
                "Help page of the LTSE"
        );
        bar.add(helpBar);

        JMenu aboutBar = new JMenu(UIUtils.getText("bar.about"));
        //menu.setMnemonic(KeyEvent.VK_A);
        aboutBar.getAccessibleContext().setAccessibleDescription(
                "About page of the LTSE"
        );
        bar.add(aboutBar);

        guiLtse.setIconImage(img.getImage());
        guiLtse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiLtse.setTitle("LTS Extractor");
        guiLtse.setSize(width,height);
        guiLtse.setResizable(false); // fixed size
        guiLtse.setJMenuBar(bar);
        guiLtse.setVisible(true);
    }
    public static void main(String[] args) throws UIException {
        Main appGui = new Main();
        Button loadFile = new Button("load_file");
        Panel panel = new Panel("panel_info");
        Bar windowBar = new Bar("window_bar");

    }
}
