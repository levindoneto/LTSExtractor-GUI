package com.ltse.gui.components;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;

public class Bar {
    private String idBar;

    public Bar(String idBar) throws UIException {
        if (idBar != null) {
            this.idBar = idBar;
        } else {
            throw new UIException(
                    UIUtils.getText("exception.ui.invalidButtonId")
            );
        }
    }
}
