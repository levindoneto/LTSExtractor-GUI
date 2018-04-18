package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.utils.UIUtils;
import javax.swing.JButton;

public class Button extends Component {
  private String text;
  private String icon;

  public Button(String text,
                String icon
  ) throws UIException, ValueException {
      super();
      if (text == null) {
        throw new UIException(UIUtils.getText("exception.ui.invalidText"));
      } else if (icon == null) {
          throw new UIException(UIUtils.getText("exception.ui.invalidIcon"));
      }
      this.text = text;
      this.icon = icon;
      this.idComponent = "test";
      this.typeComponent = "Button";
      this.positionX = 10;
      this.positionY = 10;
      this.height = 10;
      this.width = 10;

  }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
