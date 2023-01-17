package oom_project;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.Timer;

public class ShowRandomShapes extends JPanel {
    
    JFrame f = new JFrame();
   private static Color col;
   private static int H, W, i;
   private static boolean show = false;
    
    Timer t;
    public ShowRandomShapes(){
        
       f.setSize(400, 400);
       show  = false;
       f.add(this);
       f.setBackground(Color.white);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       f.setTitle("Transition Displayer");
       f.setBounds(1000, 500, 850, 500);    
    }
    
    public void draw(Color c, int h, int w){
        col = c;
        H = h;
        W = w;
        show = true;
        t = new Timer();
        //display of random shapes will begin 100 ms after "START" button is pressed(delay)
        //and time interval between two distinct shapes is 100 ms.
        t.schedule(new Display(),100,100);
    }
    
    public void cancel(){
        t.cancel();
    }
  
    @Override
    public void paint(Graphics g) {
        
            
        if(show){
            
            g.setColor(col);
                i++;
                switch (i%3) {
                    case 0:
                        g.fillRect(155, 75, H, W);
                        break;
                    case 1:
                        g.fillOval(155, 75, H, W);
                        break;
                    case 2:
                        int x[] = {155,155+W,155+W/2};
                        int y[] = {75,75,75+H};
                        g.fillPolygon(x, y, 3);
                        break;
                    default:
                        break;
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
