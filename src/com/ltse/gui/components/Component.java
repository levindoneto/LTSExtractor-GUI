package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.utils.UIUtils;

public class Component {
    private String idComponent;
    private static String typeComponent; // It cannot change
    private int positionX;
    private int positionY;
    private int height;
    private int width;

    public Component(
            String idComponent,
            String typeComponent,
            String text,
            String icon,
            int positionX,
            int positionY,
            int height,
            int width
    ) throws UIException, ValueException {
        if (idComponent == null) {
            throw new UIException(UIUtils.getText("exception.ui.invalid" + typeComponent + "Id"));
        } else if (typeComponent == null){
            throw new UIException(UIUtils.getText("exception.ui.invalidType"));
        } else if (text == null){
            throw new UIException(UIUtils.getText("exception.ui.invalidText"));
        } else if (icon == null){
            throw new UIException(UIUtils.getText("exception.ui.invalidIcon"));
        } else if (positionX <= 0){
            throw new ValueException(UIUtils.getText("exception.ui.invalidPositionX"));
        } else if (positionY <= 0){
            throw new UIException(UIUtils.getText("exception.ui.invalidPositionY"));
        } else if (height <= 0){
            throw new UIException(UIUtils.getText("exception.ui.invalidHeight"));
        } else if (width <= 0){
            throw new UIException(UIUtils.getText("exception.ui.invalidWidth"));
        } else {
            this.idComponent = idComponent;
            this.typeComponent = typeComponent;
            this.positionX = positionX;
            this.positionY = positionY;
            this.height = height;
            this.width = width;
        }
    }

    public String getIdComponent () {
        return this.idComponent;
    }

    public void setIdComponent(String idPanel) {
        this.idComponent = idComponent;
    }

    public int getPositionX () {
        return this.positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY () {
        return this.positionY;
    }

    public void setPositionY(int positionX) {
        this.positionY = positionY;
    }

    public int getHeight () {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth () {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
