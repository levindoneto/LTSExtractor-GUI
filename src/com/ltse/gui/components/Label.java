package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;

public class Label {
    private String idLabel;

    public Label(String idLabel) throws UIException {
        if (idLabel != null) {
            this.idLabel = idLabel;
        } else {
            throw new UIException(
                    UIUtils.getText("exception.ui.invalidPanelId")
            );
        }
    }

    public String getIdLabel () {
        return this.idLabel;
    }

    public void setIdPanel(String idPanel) {
        this.idLabel = idLabel;
    }
}
