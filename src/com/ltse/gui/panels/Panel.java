package com.ltse.gui.panels;

import javax.swing.*;
import java.awt.*;
import static com.ltse.gui.resources.Constants.*;

/* Panel with a label "Filter" and with a button
 * called "Load File"
 */
public class Panel extends javax.swing.JPanel {
	public Panel() {}

	public JPanel getPanel(int x, int y, JButton buttonPanel) {
		// Create content panel
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT, x, y));
		contentPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, THICKNESS_BORDER_PANEL));

		// Create panel
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, THICKNESS_BORDER_PANEL));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.setPreferredSize(new Dimension(WIDTH_PANEL_FILTER, HEIGHT_PANEL_FILTER));

		// Create label
		JPanel labelPanel = new JPanel();
		JPanel buttonLeftPanel = new JPanel();
		JLabel positionLabel = new JLabel();

		// Add button with an event to the label

		buttonPanel.addActionListener(ae -> positionLabel.setText("A file has been loaded"));
		labelPanel.add(positionLabel);
		buttonLeftPanel.add(buttonPanel);
		panel.add(labelPanel);
		panel.add(buttonLeftPanel);

		contentPanel.add(panel);

		return contentPanel;
	}

}
