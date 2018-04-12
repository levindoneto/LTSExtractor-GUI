package com.ltse.gui;

import com.ltse.gui.components.*;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.utils.UIUtils;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Main extends JFrame {
    private int height = 800;
    private int width = 640;
    public Main() throws UIException, ValueException {
        // Settings
        JFrame guiLtse = new JFrame();
        ImageIcon img = new ImageIcon("../../../Resources/icon.png");
        // Bar
        JMenuBar bar = new JMenuBar();
        // Menus
        JMenu fileBar = new JMenu(UIUtils.getText("bar.file"));

        fileBar.getAccessibleContext().setAccessibleDescription("File options of the LTS Extractor");
        JMenu editBar = new JMenu(UIUtils.getText("bar.edit"));
        JMenu helpBar = new JMenu(UIUtils.getText("bar.help"));
        JMenu aboutBar = new JMenu(UIUtils.getText("bar.about"));
        bar.add(fileBar);
        bar.add(editBar);
        bar.add(helpBar);
        bar.add(aboutBar);

        guiLtse.setIconImage(img.getImage());
        guiLtse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiLtse.setTitle(UIUtils.getText("frame.title"));
        guiLtse.setSize(width,height);
        guiLtse.setResizable(false); // fixed size
        guiLtse.setJMenuBar(bar);

        Button upFileFilter = new Button("upFileFilter", "Load File", "icon.png", 10, 20, 100, 400);

        guiLtse.setVisible(true);
    }
    public static void main(String[] args) throws UIException, ValueException {
        Main appGui = new Main();
    }
}
