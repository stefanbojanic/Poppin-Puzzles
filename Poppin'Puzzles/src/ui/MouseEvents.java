package ui;


import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvents implements MouseListener, MouseMotionListener {

    private int x;
    private int y;

    public MouseEvents(Component... lbs) {
        for (Component label : lbs) {
            label.addMouseListener(this);
            label.addMouseMotionListener(this);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        e.getComponent().setLocation((e.getX()+e.getComponent().getX())-x,(e.getY()+e.getComponent().getY())-y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //no need
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //no need
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       //do nothing
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //do nothing
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //no need
    }
}
