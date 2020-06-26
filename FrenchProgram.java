//FrenchProgram Class
//Creates a French language based program desinged to help students understand basic French grammar
//Date Modified: 04/06/2019
//Created By: Hiba Bhutta and Harman Khehara

import javax.swing.*; //Package which contains all java components

public class FrenchProgram
{
  //The Main Method
  public static void main(String[] args)
  {
    French model = new French(); //The model for the french program
    FrenchGUI main = new FrenchGUI(model); //The french program view   
    
    //Initializae the frame
    JFrame frame = new JFrame("Understanding French Fundamentals");
    frame.setSize(1200,425);
    frame.setLocation(50,50);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(main);
    frame.setVisible(true);
    
  }//niam
}//ssalc