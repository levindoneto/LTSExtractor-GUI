package com.ltse.gui.panels;

import javax.swing.*;
import java.awt.*;

import static com.ltse.gui.resources.Constants.*;

/* Panel with a label "Filter" and with a button
 * called "Load File"
 */
public class Panel extends javax.swing.JPanel {
	public Panel() {}

	public JPanel getPanel(int x, int y, JButton buttonPanel, String fixedLabel) {
		// Create content panel
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT, x, y));
		contentPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, THICKNESS_BORDER_PANEL));

		// Create panel
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, THICKNESS_BORDER_PANEL));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.setPreferredSize(new Dimension(WIDTH_PANEL_FILTER, HEIGHT_PANEL_FILTER));

		// Fixed top label
		JLabel topLabel = new JLabel("<html><span style='font-size:" + FONT_LABEL + "'>" + fixedLabel + "</span></html>");
		topLabel.setForeground(Color.decode(COLOR_TEXT_INNER_LABEL));
		topLabel.setBackground(Color.decode(COLOR_INNER_LABEL));
		topLabel.setOpaque(true);
		//topLabel.setMinimumSize(width, height);

		topLabel.setPreferredSize(new Dimension(2000, 34));

		panel.add(topLabel);

		// Create label for when a file is loaded
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

	public JPanel getPanel(int x, int y, String fixedLabel) {
		JPanel contentPanel = new JPanel();
		return contentPanel;
	}
}

