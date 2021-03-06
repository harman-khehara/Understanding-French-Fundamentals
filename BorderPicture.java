//BorderPicture Class
//Created By: Harman Khehara
//Date Modified: 04/06/2019
//BorderPicture for French Program inherits from JComponent

import javax.swing.*; //Package which contains all java components
import java.awt.*; //Package for creating user interfaces

public class BorderPicture extends JComponent
{
  //Default Constructor
  public BorderPicture()
  {
    super(); //Utilizing default constructor from JComponent
    this.setPreferredSize(new Dimension (1600,70));
  }
  
  //Draws green flowers
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    
    int spacing = 0; //The amount of spacing between each picture from the (0,0) position
    
    //Draws 12 green flowers
    for(int x=0; x<14; x++)
    {
      this.paintPicture(g, spacing + 0, 0);
      spacing = spacing + 86;
    }
  }
  
  //Draws one green flower
  public void paintPicture(Graphics g, int x, int y)
  {
    g.setColor(Color.MAGENTA.darker());
    g.fillOval(x+0,y+12,50,20);
    g.setColor(Color.GREEN);
    g.fillOval(x+14,y+0,20,50);
    g.setColor(Color.WHITE);
    g.fillOval(x+14,y+12,20,20);
  }
  
}//ssalc