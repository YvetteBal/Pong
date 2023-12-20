import java.awt.Color;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Graphics2D;

   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;
   import java.awt.event.KeyEvent;
   import java.awt.event.KeyListener;
   import javax.swing.JPanel;
   
   public class PongPanel extends JPanel implements ActionListener, KeyListener {
       
	   public PongPanel() {
		   
		      setBackground(BACKGROUND_COLOUR);
		      Timer timer = new Timer(TIMER_DELAY, this);

		       timer.start();
		  }
      @Override
      public void keyPressed(KeyEvent event) {
      }
  
      @Override
      public void keyReleased(KeyEvent event) {
      }
  
      @Override
      public void keyTyped(KeyEvent event) {
      }
  
      @Override
      public void actionPerformed(ActionEvent event) {
    	  update();
      }
      @Override
      public void paintComponent(Graphics g) {
       super.paintComponent(g);
       g.setColor(Color.WHITE);
      g.fillRect(20, 20, 100, 100);
       }
  
      private final static Color BACKGROUND_COLOUR = Color.BLACK;
      private final static int TIMERDELAY = 5;
	

    }


