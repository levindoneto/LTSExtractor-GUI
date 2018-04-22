package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.utils.UIUtils;
import static com.ltse.gui.resources.Constants.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class Button extends Component {
  private String text;
  //private Icon icon;

  public Button(
    String text,
    String idComponent,
    int positionX,
    int positionY,
    int width,
    int height
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
    Icon buttonIcon = new ImageIcon("icon-upload-file-icon.png");
	  JButton jb = new JButton(getText());
	  jb.setBounds(
			  this.positionX,
			  this.positionY,
			  this.width,
			  this.height
	  );
	  jb.setBackground(Color.decode(COLOR_BACKGROUND_LOAD_BUTTON));
	  jb.setForeground(Color.decode(COLOR_TEXT_LOAD_BUTTON));

    return jb;
  }
}
