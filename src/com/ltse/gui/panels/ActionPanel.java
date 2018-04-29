package com.ltse.gui.panels;

import javax.swing.*;

/* Panel with a label "Action" and with 3 checkboxes:
 * Call Mode, Termination Mode and Enter/Exit Mode
 */
public class ActionPanel extends Panel {
	public ActionPanel() {}

	@Override
	public JPanel getPanel(int x, int y, JButton buttonPanel) {
		System.out.println("ActionPanel");
		JPanel contentPanel = new JPanel();

		return contentPanel;
	}
}
