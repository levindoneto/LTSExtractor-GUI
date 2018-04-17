package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;

public class Label extends Component {
  public Label(String idComponent,
               int positionX,
               int positionY,
               int height,
               int width
  ) throws UIException, ValueException {
    super(idComponent, "Label", positionX, positionY, height, width);
  }
}
