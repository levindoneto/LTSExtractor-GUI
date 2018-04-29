package com.ltse.gui.panels;

import javax.swing.*;
import java.awt.*;

import static com.ltse.gui.resources.Constants.WIDTH_PANEL_ACTION;
import static com.ltse.gui.resources.Constants.HEIGHT_PANEL_ACTION;
import static com.ltse.gui.resources.Constants.THICKNESS_BORDER_PANEL;

/* Panel with a label "Action" and with 3 checkboxes:
 * Call Mode, Termination Mode and Enter/Exit Mode
 */
public class ActionPanel extends Panel {
	public ActionPanel() {}

	@Override
	public JPanel getPanel(int x, int y) {
		System.out.println("ActionPanel");

		JPanel contentPanel = new JPanel();

		contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT, x, y));
		contentPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, THICKNESS_BORDER_PANEL));

		// Create panel
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, THICKNESS_BORDER_PANEL));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.setPreferredSize(new Dimension(WIDTH_PANEL_ACTION, HEIGHT_PANEL_ACTION));

		// Create label
		JPanel labelPanel = new JPanel();
		JLabel positionLabel = new JLabel();

		labelPanel.add(positionLabel);
		panel.add(labelPanel);

		contentPanel.add(panel);

		return contentPanel;
	}
}
