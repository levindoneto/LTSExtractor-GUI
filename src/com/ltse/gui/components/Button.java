package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.utils.UIUtils;

import javax.swing.JButton;

public class Button extends Component {
  private final ThreadLocal<String> text;
  private final ThreadLocal<String> icon;

  public Button(String text,
                String icon
  ) throws UIException, ValueException {
      //super();
      if (text == null) {
        throw new UIException(UIUtils.getText("exception.ui.invalidText"));
      } else if (icon == null) {
          throw new UIException(UIUtils.getText("exception.ui.invalidIcon"));
      }
      this.text = new ThreadLocal<>();
      this.text.set(text);
      this.icon = new ThreadLocal<>();
      this.icon.set(icon);

      System.out.println(this.text.get());
      System.out.println(this.icon.get());

      //JButton button = new JButton("aa", "aaa");
  }
}
