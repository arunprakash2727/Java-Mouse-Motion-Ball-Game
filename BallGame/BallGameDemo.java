package BallGame;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.*;

class BallGame extends Frame implements MouseMotionListener{
    int circleX=200,circleY=200;
    int circleRadious=20;

    public BallGame(){

        setTitle("Ball Game");
        setVisible(true);
        setLayout(null);
        setSize(1000,600);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        addMouseMotionListener(this);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(circleX,circleY,5*circleRadious,5*circleRadious);
    }

    public void mouseDragged(MouseEvent e){

    }

    public void mouseMoved(MouseEvent e){
        int x=e.getX();
        int y=e.getY();

        if(x < circleX+circleRadious){
            circleX++;
        }

        if(x > circleX+circleRadious){
            circleX--;
        }

        if(y < circleY+circleRadious){
            circleY++;
        }

        if(y > circleY+circleRadious){
            circleY--;
        }
        repaint();
    }
}
public class BallGameDemo{
    public static void main(String[]args){
        new BallGame();
    }
}