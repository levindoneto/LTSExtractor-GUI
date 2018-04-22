package com.ltse.gui.panels;

import javax.swing.*;

import java.awt.*;

import static com.ltse.gui.resources.Constants.*;

/* Panel with a label "Filter" and with a button
 * called "Load File"
 */
public class FilterPanel extends javax.swing.JPanel {
	private JButton button;
	public FilterPanel(JButton loadFileFilterBtn) {
		this.button = loadFileFilterBtn;
	}

	public JPanel getPanel() {
		// Create content panel
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
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
		this.button.addActionListener(ae -> positionLabel.setText("A file has been loaded"));
		labelPanel.add(positionLabel);
		buttonLeftPanel.add(this.button);
		panel.add(labelPanel);
		panel.add(buttonLeftPanel);

		contentPanel.add(panel);

		return contentPanel;
	}

	public JButton getPanelButton() {
		return this.button;
	}

	public void setPanelButton(JButton button) {
		this.button = button;
	}
}
