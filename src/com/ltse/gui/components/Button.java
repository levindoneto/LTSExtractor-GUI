package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;

public class Button {
    private String idBtn;

    public Button(String idBtn) throws UIException {
        if (idBtn != null) {
            this.idBtn = idBtn;
        } else {
            throw new UIException(
                    UIUtils.getText("exception.ui.invalidButtonId")
            );
        }
    }
}
