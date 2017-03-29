package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 * Created by user on 07.03.2017.
 */
public class View extends JFrame implements ActionListener {
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    private Controller controller;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void init() {
        initGui();
        FrameListener frameListener = new FrameListener(this);
        addWindowListener(frameListener);
        setVisible(true);
    }

    public void exit() {
        controller.exit();
    }

    public void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();

    }

    public void initEditor() {
     htmlTextPane.setContentType("text/html");
     tabbedPane.addTab("HTML",new JScrollPane(htmlTextPane));
     tabbedPane.addTab("Текст",new JScrollPane(plainTextPane));
     tabbedPane.setPreferredSize(new Dimension(800,600));
     tabbedPane.addChangeListener(new TabbedPaneChangeListener(this));
     getContentPane().add(tabbedPane,BorderLayout.CENTER);
    }
       public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }
    public void selectedTabChanged(){

    }

}
