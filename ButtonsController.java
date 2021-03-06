//ButtonsController Class
//The main GUI View for a French Fundamentals Program
//Date Modified: 04/06/2019
//Created By: Hiba Bhutta and Harman Khehara

import javax.swing.*; //Package which contains all java components
import java.awt.event.*; //Package which provides classes for events fired by AWT components 
import java.awt.*; //Package for creating user interfaces

public class ButtonsController implements ActionListener
{
  //Instance Variables
  private French model; //The model
  private JTextField firstName; //The user's first name
  private JTextField lastName; //The user's last name
  private JComboBox experiences; //The experiences the user can choose from
  private JLabel beginnerDescription; //The description for a beginner level experience
  private JLabel intermidiateDescription; //The description for an intermidiate level experience
  private JLabel advancedDescription; //The description for an advanced level experience
  private JPanel contents; //The panel with all components of the main frame
  private JPanel miniGamePanel; //The panel with all components of the mini game
  private JTextField gameAnswer1; //The user's answer to the first game question
  private JTextField gameAnswer2; //The user's answer to the second game question
  private JTextField gameAnswer3; //The user's answer to the third game question
  private JTextField gameAnswer4; //The user's answer to the fourth game question
  private JTextField gameAnswer5; //The user's answer to the fifth game question
  private JLabel correctAnswer1; //The correct answer to the first question of the game
  private JLabel correctAnswer2; //The correct answer to the second question of the game
  private JLabel correctAnswer3; //The correct answer to the third question of the game
  private JLabel correctAnswer4; //The correct answer to the fourth question of the game
  private JLabel correctAnswer5; //The correct answer to the fifth question of the game
  private JTextField sentenceAnswer1; //The user's answer to sentence 1
  private JTextField sentenceAnswer2; //The user's answer to sentence 2
  private JTextField sentenceAnswer3; //The user's answer to sentence 3
  private JTextField sentenceAnswer4; //The user's answer to sentence 4
  private JTextField sentenceAnswer5; //The user's answer to sentence 5
  private JLabel sentenceCorrectAnswer1; //The correct answer to sentence 1
  private JLabel sentenceCorrectAnswer2; //The correct answer to sentence 2
  private JLabel sentenceCorrectAnswer3; //The correct answer to sentence 3
  private JLabel sentenceCorrectAnswer4; //The correct answer to sentence 4
  private JLabel sentenceCorrectAnswer5; //The correct answer to sentence 5
  private JLabel userPoints; //The label for the points for the mini game
  private int points = 0; //The total number of points earned by the user
  private JPanel fillTheBlankPanel; //The panel which contains all components of the mini game
  private JPanel rules; //The panel which contains all components of the mini game
  
  //Default constructor which links component to the model
  /* model - the french model
   * first name - the user's first name
   * last name - the user's last name
   * experiences - the choices for all user experience levels
   * beginnerDescription - the description for a user with a beginner level experience
   * intermidiateDescription - the description for a user with an intermidate level experience
   * advancedDescription - the description for a user with an advanced level experience
   * contents - the panel with all components of the main frame
   * miniGamePanel - The panel with all components of the mini game
   * gameAnswer1 - the user's answer to the first game question
   * gameAnswer2 - the user's answer to the second game question
   * gameAnswer3 - the user's answer to the third game question
   * gameAnswer4 - the user's answer to the fourth game question
   * gameAnswer5 - the user's answer to the fifth game question
   * correctAnswer1 - the correct answer to the first question of the game
   * correctAnswer2 - the correct answer to the second question of the game
   * correctAnswer3 - the correct answer to the third question of the game
   * correctAnswer4 - the correct answer to the fourth question of the game
   * correctAnswer5 - the correct answer to the fifth question of the game
   * points - the number of points earned by the user for every correct answer
   * fillTheBlankPanel - the panel which contains all components of the fill in the blanks
   * sentenceAnswer1 - the user's answer to sentence 1
   * sentenceAnswer2 - the user's answer to sentence 2
   * sentenceAnswer3 - the user's answer to sentence 3
   * sentenceAnswer4 - the user's answer to sentence 4
   * sentenceAnswer5 - the user's answer to sentence 5
   * sentenceCorrectAnswer1 - the correct answer to sentence 1
   * sentenceCorrectAnswer2 - the correct answer to sentence 2
   * sentenceCorrectAnswer3 - the correct answer to sentence 3
   * sentenceCorrectAnswer4 - the correct answer to sentence 4
   * sentenceCorrectAnswer5 - the correct answer to sentence 5
   * rules - the panel which contains all components of the rules page
   */ 
  public ButtonsController(French model, JTextField firstName, JTextField lastName, JComboBox experiences, JLabel beginnerDescription, JLabel intermidiateDescription, JLabel advancedDescription, JPanel contents, JPanel miniGamePanel, JTextField gameAnswer1, JTextField gameAnswer2, JTextField gameAnswer3, JTextField gameAnswer4, JTextField gameAnswer5, JLabel correctAnswer1, JLabel correctAnswer2, JLabel correctAnswer3, JLabel correctAnswer4, JLabel correctAnswer5, JLabel points, JPanel fillTheBlankPanel, JTextField sentenceAnswer1, JTextField sentenceAnswer2, JTextField sentenceAnswer3, JTextField sentenceAnswer4, JTextField sentenceAnswer5, JLabel sentenceCorrectAnswer1, JLabel sentenceCorrectAnswer2, JLabel sentenceCorrectAnswer3, JLabel sentenceCorrectAnswer4, JLabel sentenceCorrectAnswer5, JPanel rules)
  {
    this.model = model;
    this.firstName = firstName;
    this.lastName = lastName;
    this.experiences = experiences;
    this.beginnerDescription = beginnerDescription;
    this.intermidiateDescription = intermidiateDescription;
    this.advancedDescription = advancedDescription;
    this.contents = contents;
    this.miniGamePanel = miniGamePanel;
    this.fillTheBlankPanel = fillTheBlankPanel;
    this.gameAnswer1 = gameAnswer1;
    this.gameAnswer2 = gameAnswer2;
    this.gameAnswer3 = gameAnswer3;
    this.gameAnswer4 = gameAnswer4;
    this.gameAnswer5 = gameAnswer5;
    this.correctAnswer1 = correctAnswer1;
    this.correctAnswer2 = correctAnswer2;
    this.correctAnswer3 = correctAnswer3;
    this.correctAnswer4 = correctAnswer4;
    this.correctAnswer5 = correctAnswer5;
    this.userPoints = points;
    this.sentenceAnswer1 = sentenceAnswer1;
    this.sentenceAnswer2 = sentenceAnswer2;
    this.sentenceAnswer3 = sentenceAnswer3;
    this.sentenceAnswer4 = sentenceAnswer4;
    this.sentenceAnswer5 = sentenceAnswer5;
    this.sentenceCorrectAnswer1 = sentenceCorrectAnswer1;
    this.sentenceCorrectAnswer2 = sentenceCorrectAnswer2;
    this.sentenceCorrectAnswer3 = sentenceCorrectAnswer3;
    this.sentenceCorrectAnswer4 = sentenceCorrectAnswer4;
    this.sentenceCorrectAnswer5 = sentenceCorrectAnswer5;
    this.rules = rules;
  }
  
  //Performs the requested operation
  //e - The event sent from the buton that was clicked
  public void actionPerformed(ActionEvent e)
  {    
    //Harman
    //The "exit" button was clicked
    if (e.getActionCommand().equals("Exit"))
    {
      System.exit(1);
    }
    
    //Harman
    //The "mini game" button was clicked
    else if (e.getActionCommand().equals("Mini Game"))
    {
      this.contents.setVisible(false);
      this.miniGamePanel.setVisible(true);
      this.miniGamePanel.setBackground(Color.WHITE);
    }
    
    //Harman
    //The "back to home" button was clicked
    else if (e.getActionCommand().equals("Back to Home Page"))
    {
      this.contents.setVisible(true);
      this.miniGamePanel.setVisible(false);
      this.fillTheBlankPanel.setVisible(false);
      this.rules.setVisible(false);
      this.model.updateView();
    } 
    
    //Harman
    //The "Fill in the Blanks" button was clicked
    else if (e.getActionCommand().equals("Fill in the Blanks"))
    {
      this.contents.setVisible(false);
      this.fillTheBlankPanel.setVisible(true);
      this.model.updateView();
    } 
    
    //Harman
    //The "Rules" button was clicked
    else if (e.getActionCommand().equals("Conjugation Rules"))
    {
      this.contents.setVisible(false);
      this.rules.setVisible(true);
      this.model.updateView();
    } 
    
    //Hiba
    //The "Check Sentences" button was clicked
    else if (e.getActionCommand().equals("Check Sentences"))
    {
      if (sentenceAnswer1.getText().equals("ai mang�"))
      {
        sentenceCorrectAnswer1.setText("     Correct Answer");
      }
      
      if (!sentenceAnswer1.getText().equals("ai mang�"))
      {
        sentenceCorrectAnswer1.setText("     INCORRECT ANSWER, the correct answer is ai mang�");
      }      
      
      if (sentenceAnswer2.getText().equals("sommes all�s"))
      {
        sentenceCorrectAnswer2.setText("     Correct Answer");
      }
      
      if (!sentenceAnswer2.getText().equals("sommes all�s"))
      {
        sentenceCorrectAnswer2.setText("     INCORRECT ANSWER, the correct answer is sommes all�s");
      }     
      
      if (sentenceAnswer3.getText().equals("as fait"))
      {
        sentenceCorrectAnswer3.setText("     Correct Answer");
      }
      
      if (!sentenceAnswer3.getText().equals("as fait"))
      {
        sentenceCorrectAnswer3.setText("     INCORRECT ANSWER, the correct answer is as fait");
      }   
      
      if (sentenceAnswer4.getText().equals("est enfui"))
      {
        sentenceCorrectAnswer4.setText("     Correct Answer");
      }
      
      if (!sentenceAnswer4.getText().equals("est enfui"))
      {
        sentenceCorrectAnswer4.setText("     INCORRECT ANSWER, the correct answer is est enfui");
      } 
      
      if (sentenceAnswer5.getText().equals("ont achet�"))
      {
        sentenceCorrectAnswer5.setText("     Correct Answer");
      }
      
      if (!sentenceAnswer5.getText().equals("ont achet�"))
      {
        sentenceCorrectAnswer5.setText("     INCORRECT ANSWER, the correct answer is ont achet�");
      }   
    } 
    
    //Harman
    //The "check game answers" button was clicked
    else if (e.getActionCommand().equals("Check Game Answers"))
    {
     if (Integer.parseInt(gameAnswer1.getText()) == 1)
     {
       this.correctAnswer1.setText("     Correct Answer");
       points = points + 1;
     }
     
     if (Integer.parseInt(gameAnswer2.getText()) == 1)
     {
       this.correctAnswer2.setText("     Correct Answer");
       points = points + 1;
     }
     
     if (Integer.parseInt(gameAnswer3.getText()) == 2)
     {
       this.correctAnswer3.setText("     Correct Answer");
       points = points + 1;
     }     
     
     if (Integer.parseInt(gameAnswer4.getText()) == 2)
     {
       this.correctAnswer4.setText("     Correct Answer");
       points = points + 1;
     }     
     
     if (Integer.parseInt(gameAnswer5.getText()) == 1)
     {
       this.correctAnswer5.setText("     Correct Answer");
       points = points + 1;
     }    
     
     if (Integer.parseInt(gameAnswer1.getText()) != 1)
     {
       this.correctAnswer1.setText("     INCORRECT ANSWER, the correct answer is option 1");
     }
     
     if (Integer.parseInt(gameAnswer2.getText()) != 1)
     {
       this.correctAnswer2.setText("     INCORRECT ANSWER, the correct answer is option 1");
     }
     
     if (Integer.parseInt(gameAnswer3.getText()) != 2)
     {
       this.correctAnswer3.setText("     INCORRECT ANSWER, the correct answer is option 2");
     }     
     
     if (Integer.parseInt(gameAnswer4.getText()) != 2)
     {
       this.correctAnswer4.setText("     INCORRECT ANSWER, the correct answer is option 2");
     }     
     
     if (Integer.parseInt(gameAnswer5.getText()) != 1)
     {
       this.correctAnswer5.setText("     INCORRECT ANSWER, the correct answer is option 1");
     }  
     
     this.userPoints.setText(Integer.toString(points));
    } 
    
    //Harman
    //The "advanced" experience was selected
    else if (experiences.getSelectedItem().equals("Advanced"))
    {
      this.beginnerDescription.setVisible(false);
      this.intermidiateDescription.setVisible(false);
      this.advancedDescription.setVisible(true);
    }
    
    //Harman
    //The "intermidiate" experience was selected
    else if (experiences.getSelectedItem().equals("Intermediate"))
    {    
      this.beginnerDescription.setVisible(false);
      this.advancedDescription.setVisible(false);
      this.intermidiateDescription.setVisible(true);
    }
    
    //Harman
    //The "beginner" experience was selected
    else if (experiences.getSelectedItem().equals("Beginner"))
    {
      this.advancedDescription.setVisible(false);
      this.intermidiateDescription.setVisible(false);
      this.beginnerDescription.setVisible(true);
    }
  } 
  
}//ssalc