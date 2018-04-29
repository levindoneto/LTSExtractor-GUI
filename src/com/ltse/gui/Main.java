
package com.ltse.gui;

import com.ltse.gui.components.Button;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.panels.*;
import com.ltse.gui.utils.UIUtils;
import static com.ltse.gui.resources.Constants.*;

import javax.swing.*;

public class Main extends JFrame {
	private JLabel positionLabel = new JLabel("No file has been loaded", JLabel.CENTER);
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

		FilterPanel panelFilter = new FilterPanel();
    RefinementPanel panelRefinement = new RefinementPanel();
    ActionPanel panelAction = new ActionPanel();
    ListLogsPanel panelListLogs = new ListLogsPanel();
    SpecificationPanel panelSpecification = new SpecificationPanel();
    InfoPanel panelInfo = new InfoPanel();


	  guiLtse.setContentPane(panelFilter.getPanel(1,1, loadFileFilterBtn));
	  guiLtse.getContentPane().add(panelRefinement.getPanel(0,0, loadFileRefinementBtn));
    guiLtse.getContentPane().add(panelSpecification.getPanel(0,0, loadFileSpecificationBtn));
    guiLtse.getContentPane().add(panelListLogs.getPanel(-1,0, loadFileListOfLogsBtn));

	  guiLtse.pack();

    // Frame's settings
    guiLtse.setIconImage(img.getImage());
    guiLtse.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    guiLtse.setTitle(UIUtils.getText("frame.title"));
    guiLtse.setSize(WIDTH_MAIN_FRAME, HEIGHT_MAIN_FRAME);
    guiLtse.setResizable(false); // fixed size
    guiLtse.setJMenuBar(bar);
    guiLtse.setVisible(true);

    }
    public static void main(String[] args) throws UIException {
      Main appGui = new Main();
    }
}
