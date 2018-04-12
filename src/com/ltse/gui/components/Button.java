package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends Component {

    public Button(String idComponent,
                  int positionX,
                  int positionY,
                  int height,
                  int width
    ) throws UIException, ValueException {
        super(idComponent, "Button", positionX, positionY, height, width);
        JButton button = new JButton("Click here!");
        JPanel panel = new JPanel();

        // Add button to JPanel
        panel.add(button);
        //this.getContentPane().add(panel);
    }

}
