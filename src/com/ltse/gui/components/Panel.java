package com.ltse.gui.components;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;

public class Panel {
    private String idPanel;

    public Panel(String idPanel) throws UIException {
        if (idPanel != null) {
            this.idPanel = idPanel;
        } else {
            throw new UIException(
                    UIUtils.getText("exception.ui.invalidPanelId")
            );
        }
    }

    public String getIdPanel () {
        return this.idPanel;
    }

    public void setIdPanel(String idPanel) {
        this.idPanel = idPanel;
    }
}
