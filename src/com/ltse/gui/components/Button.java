package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;

public class Button {
    private String idButton;

    public Button(String idButton) throws UIException {
        if (idButton != null) {
            this.idButton = idButton;
        } else {
            throw new UIException(
                    UIUtils.getText("exception.ui.invalidButtonId")
            );
        }
    }

    public String getIdButton () {
        return this.idButton;
    }

    public void setIdButton(String idButton) {
        this.idButton = idButton;
    }
}
