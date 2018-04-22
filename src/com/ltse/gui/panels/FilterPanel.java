package com.ltse.gui.panels;

import javax.swing.*;

import java.awt.*;

import static com.ltse.gui.resources.Constants.*;

/* Panel with a label "Filter" and with a button
 * called "Load File"
 */
public class FilterPanel extends javax.swing.JPanel {
	private static int height = HEIGHT_PANEL_FILTER;
	private static int width = WIDTH_PANEL_FILTER;
	private JButton button;
	public FilterPanel(JButton loadFileFilterBtn) {
		this.button = loadFileFilterBtn;
	}

	public JPanel getPanel() {
		// Create panel
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, THICKNESS_BORDER_PANEL));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		// Create label
		JPanel labelPanel = new JPanel();
		JPanel buttonLeftPanel = new JPanel();
		JLabel positionLabel = new JLabel();

		// Add button with an event to the label
		this.button.addActionListener(ae -> positionLabel.setText("A file has been loaded"));
		labelPanel.add(positionLabel);
		buttonLeftPanel.add(this.button);
		panel.add(labelPanel);
		panel.add(buttonLeftPanel);

		return panel;
	}

	public JButton getPanelButton() {
		return this.button;
	}

	public void setPanelButton(JButton button) {
		this.button = button;
	}
}
