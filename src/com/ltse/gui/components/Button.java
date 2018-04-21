package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.utils.UIUtils;

import javax.swing.*;

public class Button extends Component {
  private String text;
  //private Icon icon;

  public Button(
    String text,
    String idComponent,
    int positionX,
    int positionY,
    int height,
    int width
  ) throws UIException {
      super();
      if (text == null) {
        throw new UIException(UIUtils.getText("exception.ui.invalidText"));
      }
      /* else if (icon == null) {
          throw new UIException(UIUtils.getText("exception.ui.invalidIcon"));
      }*/
      this.text = text;
      //this.icon = icon;
      this.idComponent = idComponent;
      this.typeComponent = "Button";
	    this.positionX = positionX;
		  this.positionY = positionY;
		  this.width = width;
		  this.height = height;
  }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /*
    public Icon getIcon() {
      return icon;
    }

    public void setIcon(Icon icon) {
      this.icon = icon;
    }
    */

  public JButton getFrameComponent() {
    JButton jb = new JButton(getText());
    jb.setBounds(
      this.positionX,
      this.positionY,
		  this.height,
		  this.width
    );
    return jb;
  }
}
