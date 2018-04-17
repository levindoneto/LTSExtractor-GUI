package com.ltse.gui.components;
import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.utils.UIUtils;

public class Panel extends  Component {

  public Panel(String idComponent,
               int positionX,
               int positionY,
               int height,
               int width
  ) throws UIException, ValueException {
      super(idComponent, "Panel", text, icon, positionX, positionY, height, width);
  }
}
