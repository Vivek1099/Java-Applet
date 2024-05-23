import java.applet.Applet;
import java.awt.*;
//<applet code="Applet1" height="200" width="300"></applet>
public class Applet1 extends Applet
{
  public void paint(Graphics g)
  {
    setBackground(Color.red);
    g.drawLine(10,20,60,120);
    g.setColor(Color.green);
    g.drawRect(120,120,80,120);
    g.setColor(Color.magenta);
    g.fillRect(120,120,80,60);
    g.setColor(Color.CYAN);
    g.drawOval(200,180,80,160);
  }
}
