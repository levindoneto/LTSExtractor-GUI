
package com.ltse.gui;

import com.ltse.gui.components.*;
import com.ltse.gui.components.Button;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.panels.FilterPanel;
import com.ltse.gui.utils.UIUtils;
import static com.ltse.gui.resources.Constants.*;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.ltse.gui.resources.Constants.*;

public class Main extends JFrame {
	private JLabel positionLabel;
	private JButton resetButton;
  public Main() throws UIException {
    // Settings
    JFrame guiLtse = new JFrame();
    guiLtse.setLayout(null);
    ImageIcon img = new ImageIcon("../../../Resources/icon.png");

    // Main bar
    JMenuBar bar = new JMenuBar();
    JMenu fileBar = new JMenu(UIUtils.getText("bar.file"));
    fileBar.getAccessibleContext().setAccessibleDescription("File options of the LTS Extractor");
    JMenu editBar = new JMenu(UIUtils.getText("bar.edit"));
    JMenu helpBar = new JMenu(UIUtils.getText("bar.help"));
    JMenu aboutBar = new JMenu(UIUtils.getText("bar.about"));
    bar.add(fileBar);
    bar.add(editBar);
    bar.add(helpBar);
    bar.add(aboutBar);

    // Main window's buttons
    JButton loadFileFilterBtn = new Button(
      TEXT_LOAD_FILE,
      "loadFileFilterBtn",
      X_BUTTON_FILTER,
      Y_BUTTON_FILTER,
      WIDTH_BUTTON_LOAD_FILE,
      HEIGHT_BUTTON_LOAD_FILE
    ).getFrameComponent();
    JButton loadFileRefinementBtn = new Button(
      TEXT_LOAD_FILE,
      "loadFileRefinementBtn",
      X_BUTTON_REFINEMENT,
      Y_BUTTON_REFINEMENT,
      WIDTH_BUTTON_LOAD_FILE,
      HEIGHT_BUTTON_LOAD_FILE
    ).getFrameComponent();
    JButton loadFileListOfLogsBtn = new Button(
      TEXT_LOAD_FILE,
      "loadFileListOfLogsBtn",
      X_BUTTON_LIST_LOGS,
      Y_BUTTON_LIST_LOGS,
      WIDTH_BUTTON_LOAD_FILE,
      HEIGHT_BUTTON_LOAD_FILE
    ).getFrameComponent();
    JButton loadFileSpecificationBtn = new Button(
      TEXT_LOAD_FILE,
      "loadFileSpecificationBtn",
      X_BUTTON_SPECIFICATION,
      Y_BUTTON_SPECIFICATION,
      WIDTH_BUTTON_LOAD_FILE,
      HEIGHT_BUTTON_LOAD_FILE
    ).getFrameComponent();
    /*
    guiLtse.add(loadFileFilterBtn);
    guiLtse.add(loadFileRefinementBtn);
    guiLtse.add(loadFileListOfLogsBtn);
    guiLtse.add(loadFileSpecificationBtn);
*/
	  JPanel contentPane = new JPanel();
	  contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 150));
	  contentPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));

	  JPanel panelFilter = new JPanel();
	  panelFilter.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
	  panelFilter.setLayout(new BoxLayout(panelFilter, BoxLayout.Y_AXIS));
	  JPanel labelPanel = new JPanel();
	  positionLabel = new JLabel("No file has been loaded", JLabel.CENTER);
	  JPanel buttonLeftPanel = new JPanel();
	  loadFileFilterBtn.addActionListener(ae -> positionLabel.setText("A file has been loaded"));
	  labelPanel.add(positionLabel);
	  buttonLeftPanel.add(loadFileFilterBtn);
	  panelFilter.add(labelPanel);
	  panelFilter.add(buttonLeftPanel);

	  contentPane.add(panelFilter);
	  guiLtse.setContentPane(contentPane);
	  guiLtse.pack();

    // Frame's settings
    guiLtse.setIconImage(img.getImage());
    guiLtse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    guiLtse.setTitle(UIUtils.getText("frame.title"));
    guiLtse.setSize(WIDTH_MAIN_FRAME, HEIGHT_MAIN_FRAME);
    guiLtse.setResizable(false); // fixed size
    guiLtse.setJMenuBar(bar);
    guiLtse.setVisible(true);

    }
    public static void main(String[] args) throws UIException, ValueException {
      Main appGui = new Main();
    }
}
