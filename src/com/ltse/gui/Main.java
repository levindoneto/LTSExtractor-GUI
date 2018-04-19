
package com.ltse.gui;

import com.ltse.gui.components.*;
import com.ltse.gui.components.Button;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.utils.UIUtils;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


import javax.swing.*;
import java.awt.*;
import java.awt.Component;

public class Main extends JFrame {
  private int height = 800;
  private int width = 640;
  public Main() throws UIException, ValueException {
    // Settings
    JFrame guiLtse = new JFrame();
    guiLtse.setLayout(null);
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

    JButton loadFileFilterBtn = new Button("Load File", "", 10,10,200,50).getFrameComponent();
    JButton loadFileRefinementBtn = new Button("Load File", "loadFileRefinementBtn", 10,10,200,50).getFrameComponent();
    JButton loadFileListOfLogsBtn = new Button("Load File", "loadFileListOfLogsBtn", 10,10,200,50).getFrameComponent();
    JButton loadFileSpecificationBtn = new Button("Load File", "loadFileSpecificationBtn", 10,10,200,50).getFrameComponent();

    //x, y, width, height
    loadFileFilterBtn.setBounds       (80,175,150,50);
    loadFileRefinementBtn.setBounds   (330,175,150,50);
    loadFileListOfLogsBtn.setBounds   (80,400,150,50);
    loadFileSpecificationBtn.setBounds(330,400,150,50);

    guiLtse.add(loadFileFilterBtn);
    guiLtse.add(loadFileRefinementBtn);
    guiLtse.add(loadFileListOfLogsBtn);
    guiLtse.add(loadFileSpecificationBtn);

    guiLtse.setVisible(true);

    }
    public static void main(String[] args) throws UIException, ValueException {
      Main appGui = new Main();
    }
}
