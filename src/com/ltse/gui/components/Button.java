package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends Component {
  private String text;
  private String icon;

  public Button(String idComponent,
                String text,
                String icon,
                int positionX,
                int positionY,
                int height,
                int width
  ) throws UIException, ValueException {
      if (text == null) {
        throw new UIException(UIUtils.getText("exception.ui.invalidText"));
      } else if (icon == null) {
          throw new UIException(UIUtils.getText("exception.ui.invalidIcon"));
      }
      super(idComponent,
        "Button",
        text,
        icon,
        positionX,
        positionY,
        height,
        width
      );
      JButton button = new JButton(text, icon);
  }
}
