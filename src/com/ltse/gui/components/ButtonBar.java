package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;

public class ButtonBar {
    private String idButtonBar;

    public ButtonBar(String idButtonBar) throws UIException {
        if (idButtonBar != null) {
            this.idButtonBar = idButtonBar;
        } else {
            throw new UIException(
                    UIUtils.getText("exception.ui.invalidButtonId")
            );
        }
    }

    public String getButtonBarId () {
        return this.idButtonBar;
    }

    public void setButtonBarId (String idButtonBar) {
        this.idButtonBar = idButtonBar;
    }
}

