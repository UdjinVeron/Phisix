package com.physix.lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arch on 11/28/15.
 */
public class PhysixLabWindow extends JFrame implements ActionListener{

    public PhysixLabWindow() throws HeadlessException {
        super();
        setTitle(StaticInfo.info);
        setResizable(false);
        pack();

        setSize (StaticConfig.WINDOW_WIDTH + getInsets().left + getInsets ().right,
                StaticConfig.WINDOW_HEIGHT + getInsets().top + getInsets ().bottom);

        final BallsPhysix ballsPhysix = new BallsPhysix();
        setContentPane (ballsPhysix);
        getContentPane().setVisible(true);


        ConfigPanel configPanel = new ConfigPanel();
        setGlassPane(configPanel);
        getGlassPane().setVisible(true);



        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                WorldLoop.INSTANCE.Loop(ballsPhysix, ballsPhysix);
            }
        });
        thread.setDaemon(true);
        thread.start();

        //BallsPhysix ballsPhysix = new BallsPhysix();
        //WorldLoop.INSTANCE.Loop(ballsPhysix, ballsPhysix);

        //Timer timer = new Timer (20, this);
        //timer.start ();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
