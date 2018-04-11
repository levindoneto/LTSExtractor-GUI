package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;

public class Component {
    private String idComponent;

    public Component(String idComponent, String typeComponent) throws UIException {
        if (idComponent != null) {
            this.idComponent = idComponent;
        } else {
            throw new UIException(
                    UIUtils.getText("exception.ui.invalid" + typeComponent + "Id")
            );
        }
    }

    public String getIdComponent () {
        return this.idComponent;
    }

    public void setIdComponent(String idPanel) {
        this.idComponent = idComponent;
    }
}
