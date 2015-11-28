package com.physix.lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by arch on 11/28/15.
 */
public class BallsPhysix extends JPanel implements Phisix, Display {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public static final int BALLS_NUMBER = 2;
    public static java.util.List<PhysixObject> balls = new ArrayList<PhysixObject>();
    int i = 0;

    public BallsPhysix() {
        //WorldLoop.INSTANCE.Loop(this, this);
        super();

        balls.add(new Ball());
    }

    public void paintComponent (Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint (RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
        g2d.setRenderingHint (RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_SPEED);
        super.paintComponent (g);



        for(PhysixObject physixObject : balls) {
            g2d.drawOval((int)physixObject.getPosition().getX(), (int)physixObject.getPosition().getY(), 10, 10);
        }


        //System.out.println("    displyPhisix " + i);
//
//        if (!paused) {
//            double passed = 0.0;
//            while (passed + next_collision < 1.0) {
//                for (int i = 0; i < BALLS; i++) {
//                    if (ball[i] == first) {
//                        ball[i].collide (second, next_collision);
//                    }
//                    else if (ball[i] != second) {
//                        ball[i].move (next_collision);
//                    }
//                }
//                passed += next_collision;
//                collision_update ();
//            }
//            next_collision += passed;
//            next_collision -= 1.0;
//            for (int i = 0; i < BALLS; i++) {
//                ball[i].move (1.0 - passed);
//            }
//        }
//
//        for (int i = 0; i < BALLS; i++) {
//            ball[i].paint (g2d);
//        }
//
//		/*
//		g2d.setColor (new Color (0, 0, 0));
//		if (next_collision < 1000 && first != null && second != null)
//			g2d.drawLine ((int)(first.getX() + first.getSpeed().getX() * next_collision),
//			              (int)(first.getY() + first.getSpeed().getY() * next_collision),
//			              (int)(second.getX() + second.getSpeed().getX() * next_collision),
//			              (int)(second.getY() + second.getSpeed().getY() * next_collision));
//		*/
//
//        if (queued_collision_update)
//            collision_update ();
    }

    public void displyPhisix() {
        repaint();
        //System.out.println("    displyPhisix");
        //paintComponent(getGraphics());
    }

    public void updatePhysix() {
        //System.out.println("==================updatePhysix==================");
        for(PhysixObject physixObject : balls) {
            //physixObject.setPosition(new Vector2D(physixObject.getPosition().getX(), physixObject.getPosition().getY());
            physixObject.getPosition().setX(physixObject.getPosition().getX() + 10);
            physixObject.getPosition().setY(physixObject.getPosition().getY() + 10);
        }
        //repaint();
    }


}
