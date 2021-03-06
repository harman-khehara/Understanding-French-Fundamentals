//French Class
//Creates a French language based program desinged to help students understand basic French grammar
//Date Modified: 04/06/2019
//Created By: Hiba Bhutta and Harman Khehara

public class French extends Object
{
  //Variable Declarations
  private FrenchGUI frenchView; //The view for the model
  
  //Defualt Constructor
  public French()
  {
    super();
  }
 
  //Sets the view for the French Program
  //frenchView - The view to display the french program
  public void setGUI(FrenchGUI frenchView)
  {
    this.frenchView = frenchView;
  }

  //Updates the view in the GUI
  public void updateView()
  {
    frenchView.update();
  }

}//ssalc