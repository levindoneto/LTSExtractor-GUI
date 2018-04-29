package com.ltse.gui.panels;

import javax.swing.*;

/* Panel with a label "Panel" and with a text box
 * which communicates with the LTSE backend
 */
public class InfoPanel extends Panel {
	public InfoPanel() {}

	@Override
	public JPanel getPanel(int x, int y, JButton buttonPanel) {
		System.out.println("InfoPanel");
		JPanel contentPanel = new JPanel();

		return contentPanel;
	}
}
