package com.javarush.task.task32.task3209.actions;

import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

/**
 * Created by user on 07.03.2017.
 */
public class SubscriptAction extends StyledEditorKit.StyledTextAction {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public SubscriptAction()
    {
        super(StyleConstants.Subscript.toString());
    }
}
