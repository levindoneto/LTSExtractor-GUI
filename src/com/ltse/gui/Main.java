package com.ltse.gui;

import com.ltse.gui.components.Button;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.panels.*;
import com.ltse.gui.utils.UIUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.ltse.gui.resources.Constants.*;

public class Main extends JFrame {
  private JLabel positionLabel = new JLabel("No file has been loaded", JLabel.CENTER);
  public static void main(String[] args) throws UIException {
    ImageIcon img = new ImageIcon("../../../Resources/icon.png");
    final JFrame guiLtse = new JFrame();

    // Frame's settings
    guiLtse.setPreferredSize(new Dimension(WIDTH_MAIN_FRAME, HEIGHT_MAIN_FRAME));
    guiLtse.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    guiLtse.setTitle(UIUtils.getText("frame.title"));
    guiLtse.setIconImage(img.getImage());
    guiLtse.setLocationRelativeTo(null);
    final JToolBar toolBar = new JToolBar();

    // Main frame's buttons
    // Main window's buttons
    JButton loadFileFilterBtn = new Button(
        UIUtils.getText("button.loadFile"),
        "loadFileFilterBtn",
        X_BUTTON_FILTER,
        Y_BUTTON_FILTER,
        WIDTH_BUTTON_LOAD_FILE,
        HEIGHT_BUTTON_LOAD_FILE
    ).getFrameComponent();
    JButton loadFileRefinementBtn = new Button(
        UIUtils.getText("button.loadFile"),
        "loadFileRefinementBtn",
        X_BUTTON_REFINEMENT,
        Y_BUTTON_REFINEMENT,
        WIDTH_BUTTON_LOAD_FILE,
        HEIGHT_BUTTON_LOAD_FILE
    ).getFrameComponent();
    JButton loadFileListOfLogsBtn = new Button(
        UIUtils.getText("button.loadFile"),
        "loadFileListOfLogsBtn",
        X_BUTTON_LIST_LOGS,
        Y_BUTTON_LIST_LOGS,
        WIDTH_BUTTON_LOAD_FILE,
        HEIGHT_BUTTON_LOAD_FILE
    ).getFrameComponent();
    JButton loadFileSpecificationBtn = new Button(
        UIUtils.getText("button.loadFile"),
        "loadFileSpecificationBtn",
        X_BUTTON_SPECIFICATION,
        Y_BUTTON_SPECIFICATION,
        WIDTH_BUTTON_LOAD_FILE,
        HEIGHT_BUTTON_LOAD_FILE
    ).getFrameComponent();



    //Create the popup menu.
    final JPopupMenu popup = new JPopupMenu();
    popup.add(new JMenuItem(new AbstractAction("Option 1") {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(guiLtse, "Option 1 selected");
      }
    }));
    popup.add(new JMenuItem(new AbstractAction("Option 2") {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(guiLtse, "Option 2 selected");
      }
    }));

    final JButton button = new JButton("Options");
    button.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        popup.show(e.getComponent(), e.getX(), e.getY());
      }
    });
    toolBar.add(button);

    guiLtse.getContentPane().add(toolBar, BorderLayout.NORTH);
    guiLtse.pack();

    MainPanel mainPanel = new MainPanel();
    FilterPanel panelFilter = new FilterPanel();
    RefinementPanel panelRefinement = new RefinementPanel();
    ActionPanel panelAction = new ActionPanel();
    ListLogsPanel panelListLogs = new ListLogsPanel();
    SpecificationPanel panelSpecification = new SpecificationPanel();
    InfoPanel panelInfo = new InfoPanel();

    guiLtse.getContentPane().add(panelFilter.getPanel(0,0, loadFileFilterBtn, UIUtils.getText("label.filter")));
    guiLtse.pack();
    guiLtse.getContentPane().add(panelRefinement.getPanel(310,0, loadFileRefinementBtn, UIUtils.getText("label.refinement")));
    guiLtse.pack();
    guiLtse.getContentPane().add(panelAction.getPanel(250,0, UIUtils.getText("label.actionMode")));
    guiLtse.pack();
    guiLtse.getContentPane().add(panelListLogs.getPanel(250,310, loadFileListOfLogsBtn, UIUtils.getText("label.listOfLogs")));
    guiLtse.pack();
    guiLtse.getContentPane().add(panelSpecification.getPanel(400,0, loadFileSpecificationBtn, UIUtils.getText("label.specification")));
    guiLtse.pack();
    guiLtse.getContentPane().add(panelInfo.getPanel(400,310, UIUtils.getText("label.panel")));
    guiLtse.pack();

    guiLtse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    guiLtse.setLocationRelativeTo(null);
    guiLtse.setVisible(true);
  }
}