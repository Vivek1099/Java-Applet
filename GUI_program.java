//GUI was proposed in 95
//applet has no main.
//applet class must be public
//Q>Life cycle function of an applet?
/*
<applet code="apple1" height="200" width="300"></applet>
*/
import java.applet.Applet;
import java.awt.*;
public class GUI_program extends Applet 
{
    public void init()
    {
        System.out.println("init");
    }
    public void start()
    {
        System.out.println("Start");
    }
  public void paint(Graphics g)  
  {
      g.drawString("Welcome to ranchi",200,290);
      setBackground(Color.blue);
  }
  public void stop()
  {
      System.out.println("Stop");
  }
  public void destroy()
  {
      System.out.println("Destroy");
  }
}
