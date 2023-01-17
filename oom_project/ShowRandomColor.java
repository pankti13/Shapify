
package oom_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Timer;

public class ShowRandomColor extends JPanel{
    
    JFrame f = new JFrame();
    private String shape;
    private static int H, W;
    private static boolean show = false;
    
    Timer t;
    public ShowRandomColor(){
        
       f.setSize(400, 400);
       show = false;
       f.add(this);
       f.setBackground(Color.white);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       f.setTitle("Transition Displayer");
       f.setBounds(1000, 500, 850, 500);    
    }
    
    public void draw(String shape, int h, int w){
        this.shape= shape;
        H = h;
        W = w;
        show = true;
        t = new Timer();
        //display of random colors will begin 100 ms after "START" button is pressed(delay)
        //and time interval between two distinct colors is 100 ms.
        t.schedule(new Display(),100,100); 
    }
    
    public void cancel(){
        t.cancel();
    }
  
    @Override
    public void paint(Graphics g) {
        
        if(show){
            int rval=(int)(Math.floor(Math.random()*256));
	    int gval=(int)(Math.floor(Math.random()*256));
	    int bval=(int)(Math.floor(Math.random()*256));
	    g.setColor(new Color(rval, gval, bval));
            
                    if(shape.equals("RECTANGLE"))
                        g.fillRect(155, 75, H, W);
       
                    else if(shape.equals("OVAL"))
                        g.fillOval(155, 75, H, W);
            
                    else if(shape.equals("TRIANGLE")){
                        int x[] = {155,155+W,155+W/2};
                        int y[] = {75,75,75+H};
                        g.fillPolygon(x, y, 3);
                    }
                    
                }
        }
    
    class Display extends TimerTask{
        @Override
        public void run(){
            f.repaint();
        }
    }   
}
