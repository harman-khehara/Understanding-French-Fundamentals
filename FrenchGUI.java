//FrenchGUI Class
//The main GUI View for a French Fundamentals Program
//Date Modified: 04/06/2019
//Created By: Hiba Bhutta and Harman Khehara
//Hiba - all code related to the fill in the blanks activity
//Harman - all code related to the mini game activity

import javax.swing.*; //Package which contains all java components
import java.awt.*; //Package for creating user interfaces

public class FrenchGUI extends JPanel
{
  //Instance Variables 
  private French frenchModel; //The program model
  private BorderPicture picture = new BorderPicture(); //The image for the border of the JFrame
  private BorderPicture pictureGame = new BorderPicture(); //The image for the border of the mini game 
  private BorderPicture pictureSentence = new BorderPicture(); //The image for the border of the fill in the blanks page
  private String[] experienceOptions = new String[]{"Beginner", "Intermediate", "Advanced"}; //The different experience options 
  private JComboBox userExperience = new JComboBox(experienceOptions); //The experience of the user
  private Color orchid = new Color(218,112,214); // Color orchid
  private Color lightBlue = new Color(175,225,235); // Color orchid
  
  private JLabel title = new JLabel("            Understanding French Fundamentals"); //The title of the program
  private JLabel description1 = new JLabel("                                                                                                                              “Understanding French Fundamentals” is a program which is designed to help grade nine students learn the basics of communicating in French."); //The brief description of the program
  private JLabel description2 = new JLabel("                                                                                                                                                This program focuses on helping students understand and identify the key differences between the verbs avoir and être."); //The brief description of the program
  private JLabel description3 = new JLabel("                                                                                                                                             “Understanding French Fundamentals” is a student friendly easy to use program which is made up of three different parts."); //The brief description of the program
  private JLabel description4 = new JLabel("                                                                                                                                       One feature of the program is to display the rules that follow along with the conjugation and identification of avoir and être verbs."); //The brief description of the program
  private JLabel description5 = new JLabel("                                                                                                                                     The program will also include conjugation practice as well as matching activities to help with further clarification of the key concepts."); //The brief description of the program
  private JLabel emptySpace1 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace2 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace3 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace4 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace5 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace10 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace18 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace16 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace11 = new JLabel("      "); //White space between text
  private JLabel emptySpace12 = new JLabel("          "); //White space between text
  private JLabel emptySpace13 = new JLabel("          "); //White space between text
  private JLabel emptySpace14 = new JLabel("           "); //White space between text
  private JLabel emptySpace15 = new JLabel("         "); //White space between text
  private JLabel emptySpace6 = new JLabel("                                                                                                                                           "); //White space between text
  private JLabel emptySpace7 = new JLabel("       "); //White space between text
  private JLabel emptySpace8 = new JLabel("       "); //White space between text
  private JLabel emptySpace9 = new JLabel("       "); //White space between text
  private JLabel emptySpace17 = new JLabel("       "); //White space between text
  private JLabel miniGameTitle = new JLabel("Mini Game"); //The title of the mini game
  private JLabel miniGameDescription = new JLabel("                                 Enter the number of the verb from the options list beside the verb from the questions list. The verb you choose must be the verb used to conjugate a verb in past tense. Every correct answer earns points!"); //The description explaining the mini game
  private JLabel gameQuestion1 = new JLabel("A:      se lever      "); //Mini game question one
  private JLabel gameQuestion2 = new JLabel("B:      arriver       "); //Mini game question two
  private JLabel gameQuestion3 = new JLabel("C:      parler        "); //Mini game question three
  private JLabel gameQuestion4 = new JLabel("D:      manger        "); //Mini game question four
  private JLabel gameQuestion5 = new JLabel("E:      partir        "); //Mini game question five
  private JLabel questionsTitle = new JLabel("  QUESTIONS"); //The questions title for the mini game
  private JLabel optionsTitle = new JLabel("         OPTIONS"); //The options title for the mini game
  private JLabel answersTitle = new JLabel("         ANSWERS"); //The answers title for the mini game
  private JLabel option1 = new JLabel("      1:      Être"); //Mini game option 1
  private JLabel option2 = new JLabel("      2:      Avoir"); //Mini game option 2
  private JLabel option3 = new JLabel("      3:      Réfléchis"); //Mini game option 3
  private JLabel gameScore = new JLabel("Points Earned: "); //Mini game score label
  private JLabel points = new JLabel("0"); //Points earned by user for every correct answer in the mini game
  private JLabel correctAnswer1 = new JLabel(""); //The correct answer for question 1 of the mini game
  private JLabel correctAnswer2 = new JLabel(""); //The correct answer for question 2 of the mini game
  private JLabel correctAnswer3 = new JLabel(""); //The correct answer for question 3 of the mini game
  private JLabel correctAnswer4 = new JLabel(""); //The correct answer for question 4 of the mini game
  private JLabel correctAnswer5 = new JLabel(""); //The correct answer for question 5 of the mini game
  private JLabel sentenceCorrectAnswer1 = new JLabel(""); //The correct answer for question 1 of the fill in the blanks
  private JLabel sentenceCorrectAnswer2 = new JLabel(""); //The correct answer for question 2 of the fill in the blanks
  private JLabel sentenceCorrectAnswer3 = new JLabel(""); //The correct answer for question 3 of the fill in the blanks
  private JLabel sentenceCorrectAnswer4 = new JLabel(""); //The correct answer for question 4 of the fill in the blanks
  private JLabel sentenceCorrectAnswer5 = new JLabel(""); //The correct answer for question 5 of the fill in the blanks
  private JLabel sentenceTitle = new JLabel("Fill in the Blanks"); //The title for fill in the blanks
  private JLabel sentenceDescription = new JLabel("       Fill in the blanks of the sentence by entering the correct congujation of the indicated verb in the box next to the sentence."); //The description for the fill in the blank activity
  private JLabel sentence1 = new JLabel("1.       Je _______  _______ une pizza hier avec mon ami. (manger) "); //Fill in the blank question 1
  private JLabel sentence2 = new JLabel("2.       Hier était une belle journée! Nous _______  _______ au centre commercial avec nos amis. (aller) "); //Fill in the blank question 2
  private JLabel sentence3 = new JLabel("3.       _______-tu _______ la vaisselle hier soir? (faire) "); //Fill in the blank question 3
  private JLabel sentence4 = new JLabel("4.       Mon chien se _______ _______!!! (s'enfuir) "); //Fill in the blank question 4
  private JLabel sentence5 = new JLabel("5.       Ils _______ _______ cinq chemises. (acheter) "); //Fill in the blank question 5
  private JLabel firstName = new JLabel("First Name:  "); //The text of the first name
  private JLabel lastName = new JLabel("Last Name:  "); //The text for the last name
  private JLabel experience = new JLabel("Experience:  "); //The text for the experience of the user
  private JLabel rulesTitle = new JLabel("Rules for Congujating verbs in Past Tense using Avoir or Être"); //The title of the rules page
  private JLabel avoirTitle = new JLabel("Conjugating verbs using Avoir"); //The title of avoir comjugation
  private JLabel etreTitle = new JLabel("Conjugating verbs using Être "); //The title of avoir comjugation
  private JLabel avoirDescription = new JLabel("Regular verbs are conjugated the following way: "); //Description for avoir
  private JLabel erVerbs = new JLabel("- Verbs ending in er: remove the er of the verb and add é "); //The rules for er verbs
  private JLabel irVerbs = new JLabel("- Verbs ending in ir: remove the ir of the verb and add i "); //The rules for ir verbs
  private JLabel reVerbs = new JLabel("- Verbs ending in re: remove the re of the verb and add u "); //The rules for re verbs
  private JLabel explanation = new JLabel("After conjugating the the verb, you also need to add the past tense form of avoir before the conjugated verb"); //The avoir explanation
  private JLabel avoirConjugation = new JLabel("- J'ai, Tu as, Il/Elle a, Nous allons, Vous avez, Ils/Elles ont"); //Avoir conjugation
  private JLabel etreExplanation = new JLabel("Just like with Avoir, Être verbs require the conjugated form of Être to be placed before the conjugated verb"); //The etre explanation
  private JLabel etreConjugation = new JLabel("- Je suis, Tu es, Il/Elle est, Nous sommes, Vous avez, Ils/Elles sont"); //Etre conjugation
  private JLabel etreRule = new JLabel("Remeber that when conjugating verbs in Être, you need to account for feminin and masculin singular and plural conjugations"); //Rules for etre
  private JLabel pluralRule = new JLabel("- Feminin singular, add e, Feminin plural, add es, Masculin plural, add s"); //The plural and singular forms
  private JLabel emptySpace19 = new JLabel("      "); //The white space between text
  private JLabel emptySpace20 = new JLabel("      "); //The white space between text
  private JLabel emptySpace21 = new JLabel("      "); //The white space between text
  private JLabel emptySpace22 = new JLabel("      "); //The white space between text
  private JLabel emptySpace23 = new JLabel("      "); //The white space between text
  private JLabel beginnerDescription = new JLabel("                                                                                                                               As you are a beginer with French past tense congujation, it is recommended that you start with reviewing the rules for conjugation page."); //The description for what activity the user should start with if the user is a beginner
  private JLabel intermidiateDescription = new JLabel("                                                                                                                                          As you are an intermidiate with French past tense congujation, it is recommended that you start with the mini game."); //The description for what activity the user should start with if the user is an intermidiate
  private JLabel advancedDescription = new JLabel("                                                                                                                                               As you are advanced in French past tense congujation, it is recommended that you start with the fill in the blanks activity."); //The description for what activity the user should start with if the user is advanced
  private JLabel nextDescription = new JLabel("                                                                                                                                                                                                   To continue using the program click on any of the buttons below."); //The description of the JButtons
  
  private JTextField firstNameInput = new JTextField(15); //The user's first name
  private JTextField lastNameInput = new JTextField(15); //The user's first name
  private JTextField gameAnswer1 = new JTextField(5); //The user's first mini game answer
  private JTextField gameAnswer2 = new JTextField(5); //The user's second mini game answer
  private JTextField gameAnswer3 = new JTextField(5); //The user's third mini game answer
  private JTextField gameAnswer4 = new JTextField(5); //The user's fourth mini game answer
  private JTextField gameAnswer5 = new JTextField(5); //The user's fifth mini game answer
  private JTextField sentenceAnswer1 = new JTextField(10); //The user's first sentence answer
  private JTextField sentenceAnswer2 = new JTextField(10); //The user's second sentence answer
  private JTextField sentenceAnswer3 = new JTextField(10); //The user's third sentence answer
  private JTextField sentenceAnswer4 = new JTextField(10); //The user's fourth sentence answer
  private JTextField sentenceAnswer5 = new JTextField(10); //The user's fifth sentence answer
  
  private JButton rules = new JButton("Conjugation Rules"); //The button for displaying the rules for avoir and etre
  private JButton miniGame = new JButton("Mini Game"); //The button for playing the mini game
  private JButton fillTheBlank = new JButton("Fill in the Blanks"); //The button for filling in the blanks in sentences
  private JButton  exit = new JButton("Exit"); //The button for exiting the program
  private JButton checkGameAnswers = new JButton("Check Game Answers"); //The button for checking all answers to the mini game
  private JButton backToHome = new JButton("Back to Home Page"); //The button which brings back the user to the intial starting/main frame from the mini game
  private JButton checkSentenceAnswers = new JButton("Check Sentences"); //The button for checking all answers to the sentences
  private JButton backToHomeSentence = new JButton("Back to Home Page"); //The button which brings back the user to the intial starting/main frame from fill in the blanks
  private JButton backToHomeRules = new JButton("Back to Home Page"); //The button which brings back the user to the intial starting/main frame from the rules page
 
  private JPanel userInfo = new JPanel(); //The panel which contains all user information
  private JPanel buttons = new JPanel(); //The panel which contains all buttons 
  private JPanel programDescription = new JPanel(); //The panel which contains all program information
  private JPanel userDescription = new JPanel(); //The panel which contains all user experience information
  private JPanel contents = new JPanel(); //The panel which contains all components of the JFrame
  private JPanel picturePanel = new JPanel(); //The panel which contains all components of the JFrame
  private JPanel buttonsLayout2 = new JPanel(); //The panel which contains all buttons
  private JPanel titlePanel = new JPanel(); //The panel which contains the title layout 
  private JPanel gameTitle = new JPanel(); //The panel for the title of the mini game
  private JPanel gameDescription = new JPanel(); //The panel for the description of the mini game
  private JPanel gameQuestions = new JPanel(); //The panel for the questions of the mini game 
  private JPanel gameOptions = new JPanel(); //The panel for the options of the mini game
  private JPanel gameButtons = new JPanel(); //The panel for the buttons of the mini game
  private JPanel gameAnswers = new JPanel(); //The panel for the answers of the mini game
  private JPanel miniGamePanel = new JPanel(); //The panel which contains all components of the mini game
  private JPanel gameInteractions = new JPanel(); //The panel which contains all user interactions of the mini game
  private JPanel sentenceTitlePanel = new JPanel(); //The panel for the title of the fill in the blanks page
  private JPanel sentenceDescriptionPanel = new JPanel(); //The panel for the description of the fill in the blanks page
  private JPanel sentenceQuestions = new JPanel(); //The panel for the questions of the fill in the blanks page
  private JPanel sentenceAnswers = new JPanel(); //The panel for the answers of the fill in the blanks page
  private JPanel gamePicturePanel = new JPanel(); //The panel for the picture of the mini game
  private JPanel sentencePicturePanel = new JPanel(); //The panel for the picture of the fill in the blanks page
  private JPanel gameScorePanel = new JPanel(); //The panel for the score of the mini game
  private JPanel gameCorrectAnswers = new JPanel(); //The panel for the correct answers of the mini game 
  private JPanel sentenceButtons = new JPanel(); //The panel for the buttons of the fill in the blanks page
  private JPanel sentenceInteractions = new JPanel(); //The panel for the interactions of the user for the fill in the blanks page
  private JPanel fillTheBlankPanel = new JPanel(); //The panel which contains all components of the fill in the blanks page
  private JPanel sentenceCorrectAnswers = new JPanel(); //The panel for the correcr answers of the fill in the blank sentences
  private JPanel rulesPanel = new JPanel(); //The panel which contains all components of the rules page
  private JPanel rulesTitlePanel = new JPanel(); //The panel for the title of the rules page
  private JPanel rulesButtons = new JPanel(); //The panel for the buttons of the rules page
  
  //Default constructor instantiates the model and identifies controllers 
  //model - The model for the french program
  public FrenchGUI(French model)
  {
    super();
    this.frenchModel = model;
    this.frenchModel.setGUI(this);
    this.layoutView();
    this.registerControllers();
    this.update();
  }
  
  //Draws the initial layout for the program
  private void layoutView()
  {
    //Set Background Color
    this.programDescription.setBackground(Color.WHITE);
    this.userInfo.setBackground(orchid);
    this.buttons.setBackground(orchid);
    this.userDescription.setBackground(Color.WHITE);
    this.picturePanel.setBackground(Color.WHITE);
    this.contents.setBackground(Color.WHITE);
    this.titlePanel.setBackground(orchid);
    this.gameTitle.setBackground(orchid);
    this.gameInteractions.setBackground(Color.WHITE);
    this.gameQuestions.setBackground(Color.WHITE);
    this.gameOptions.setBackground(Color.WHITE);
    this.gameAnswers.setBackground(Color.WHITE);
    this.gameButtons.setBackground(orchid);
    this.gamePicturePanel.setBackground(Color.WHITE);
    this.gameDescription.setBackground(Color.WHITE);
    this.gameScorePanel.setBackground(Color.WHITE);
    this.gameCorrectAnswers.setBackground(Color.WHITE);
    this.sentenceTitlePanel.setBackground(orchid);
    this.sentenceInteractions.setBackground(Color.WHITE);
    this.sentenceButtons.setBackground(orchid);
    this.sentenceDescriptionPanel.setBackground(Color.WHITE);
    this.sentenceAnswers.setBackground(Color.WHITE);
    this.sentenceQuestions.setBackground(Color.WHITE);
    this.sentencePicturePanel.setBackground(Color.WHITE);
    this.sentenceCorrectAnswers.setBackground(Color.WHITE);
    this.rulesPanel.setBackground(Color.WHITE);
    this.rulesTitlePanel.setBackground(orchid);
    this.rulesButtons.setBackground(orchid);
    
    //Set Buttons Color
    rules.setBackground(orchid);
    miniGame.setBackground(orchid);
    fillTheBlank.setBackground(orchid);
    exit.setBackground(orchid);
    checkGameAnswers.setBackground(orchid);
    checkSentenceAnswers.setBackground(orchid);
    backToHome.setBackground(orchid);
    backToHomeSentence.setBackground(orchid);
    gameAnswer1.setBackground(lightBlue);
    gameAnswer2.setBackground(lightBlue);
    gameAnswer3.setBackground(lightBlue);
    gameAnswer4.setBackground(lightBlue);
    gameAnswer5.setBackground(lightBlue);
    sentenceAnswer1.setBackground(lightBlue);
    sentenceAnswer2.setBackground(lightBlue);
    sentenceAnswer3.setBackground(lightBlue);
    sentenceAnswer4.setBackground(lightBlue);
    sentenceAnswer5.setBackground(lightBlue);
    backToHomeRules.setBackground(orchid);
    
    //Set Buttons Border and Size
    rules.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    rules.setPreferredSize(new Dimension(150, 40));
    miniGame.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    miniGame.setPreferredSize(new Dimension(150, 40));
    fillTheBlank.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    fillTheBlank.setPreferredSize(new Dimension(150, 40));
    exit.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    exit.setPreferredSize(new Dimension(150, 40));
    checkGameAnswers.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    checkGameAnswers.setPreferredSize(new Dimension(150, 40));
    backToHome.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    backToHome.setPreferredSize(new Dimension(150, 40));    
    checkSentenceAnswers.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    checkSentenceAnswers.setPreferredSize(new Dimension(150, 40));
    backToHomeSentence.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    backToHomeSentence.setPreferredSize(new Dimension(150, 40));     
    backToHomeRules.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
    backToHomeRules.setPreferredSize(new Dimension(150, 40));  
    
    //Set color and font for JLabels
    firstName.setFont(new Font("Serif", Font.BOLD, 14));
    firstName.setForeground(Color.WHITE);
    lastName.setFont(new Font("Serif", Font.BOLD, 14));
    lastName.setForeground(Color.WHITE);
    experience.setFont(new Font("Serif", Font.BOLD, 14));
    experience.setForeground(Color.WHITE);
    title.setFont(new Font("Serif", Font.BOLD, 14));
    title.setForeground(Color.WHITE);
    miniGameTitle.setFont(new Font("Serif", Font.BOLD, 14));
    miniGameTitle.setForeground(Color.WHITE);
    gameScore.setFont(new Font("Serif", Font.BOLD, 14));   
    points.setFont(new Font("Serif", Font.BOLD, 14));  
    correctAnswer1.setFont(new Font("Serif", Font.BOLD, 14));   
    correctAnswer1.setForeground(Color.RED);
    correctAnswer2.setFont(new Font("Serif", Font.BOLD, 14));   
    correctAnswer2.setForeground(Color.RED);    
    correctAnswer3.setFont(new Font("Serif", Font.BOLD, 14));   
    correctAnswer3.setForeground(Color.RED);    
    correctAnswer4.setFont(new Font("Serif", Font.BOLD, 14));   
    correctAnswer4.setForeground(Color.RED);    
    correctAnswer5.setFont(new Font("Serif", Font.BOLD, 14));   
    correctAnswer5.setForeground(Color.RED);    
    sentenceCorrectAnswer1.setFont(new Font("Serif", Font.BOLD, 14));   
    sentenceCorrectAnswer1.setForeground(Color.RED);
    sentenceCorrectAnswer2.setFont(new Font("Serif", Font.BOLD, 14));   
    sentenceCorrectAnswer2.setForeground(Color.RED);    
    sentenceCorrectAnswer3.setFont(new Font("Serif", Font.BOLD, 14));   
    sentenceCorrectAnswer3.setForeground(Color.RED);    
    sentenceCorrectAnswer4.setFont(new Font("Serif", Font.BOLD, 14));   
    sentenceCorrectAnswer4.setForeground(Color.RED);    
    sentenceCorrectAnswer5.setFont(new Font("Serif", Font.BOLD, 14));   
    sentenceCorrectAnswer5.setForeground(Color.RED);  
    rulesTitle.setFont(new Font("Serif", Font.BOLD, 14));   
    rulesTitle.setForeground(Color.WHITE);  
    sentenceTitle.setFont(new Font("Serif", Font.BOLD, 14));   
    sentenceTitle.setForeground(Color.WHITE);   
    answersTitle.setForeground(Color.BLUE); 
    questionsTitle.setForeground(Color.BLUE); 
    optionsTitle.setForeground(Color.BLUE); 
    avoirTitle.setForeground(Color.BLUE);
    etreTitle.setForeground(Color.BLUE);
    erVerbs.setForeground(Color.RED); 
    irVerbs.setForeground(Color.RED); 
    reVerbs.setForeground(Color.RED); 
    avoirConjugation.setForeground(Color.RED); 
    etreConjugation.setForeground(Color.RED); 
    pluralRule.setForeground(Color.RED); 
    
    //Set visibility of user experience descriptions
    advancedDescription.setVisible(false);
    beginnerDescription.setVisible(true);
    intermidiateDescription.setVisible(false);
    
    //The title of the rules page
    rulesTitlePanel.add(this.rulesTitle);
    
    //The buttons of the rules page
    rulesButtons.add(this.backToHomeRules);
    
    //The rules page
    rulesPanel.setLayout(new BoxLayout(rulesPanel, BoxLayout.Y_AXIS));
    rulesPanel.add(this.rulesTitlePanel);
    rulesPanel.add(this.emptySpace22);
    rulesPanel.add(this.avoirTitle);
    rulesPanel.add(this.emptySpace20);
    rulesPanel.add(this.avoirDescription);
    rulesPanel.add(this.erVerbs);
    rulesPanel.add(this.irVerbs);
    rulesPanel.add(this.reVerbs);
    rulesPanel.add(this.explanation);
    rulesPanel.add(this.avoirConjugation);
    rulesPanel.add(this.emptySpace19);
    rulesPanel.add(this.etreTitle);
    rulesPanel.add(this.emptySpace21);
    rulesPanel.add(this.etreExplanation);
    rulesPanel.add(this.etreConjugation);
    rulesPanel.add(this.etreRule);
    rulesPanel.add(this.pluralRule);
    rulesPanel.add(this.emptySpace23);
    rulesPanel.add(this.rulesButtons);
    this.add(this.rulesPanel);
    this.rulesPanel.setVisible(false);
    
    //Fill in the blanks title
    sentenceTitlePanel.add(this.sentenceTitle);
    
    //Fill in the banks description
    sentenceDescriptionPanel.add(this.sentenceDescription);
    
    //Fill in the blanks questions
    sentenceQuestions.setLayout(new BoxLayout(sentenceQuestions, BoxLayout.Y_AXIS));
    sentenceQuestions.add(this.sentence1);
    sentenceQuestions.add(this.sentence2);
    sentenceQuestions.add(this.sentence3);
    sentenceQuestions.add(this.sentence4);
    sentenceQuestions.add(this.sentence5);
    
    //Fill in the blank user answers
    sentenceAnswers.setLayout(new BoxLayout(sentenceAnswers, BoxLayout.Y_AXIS));
    sentenceAnswers.add(this.sentenceAnswer1);
    sentenceAnswers.add(this.sentenceAnswer2);
    sentenceAnswers.add(this.sentenceAnswer3);
    sentenceAnswers.add(this.sentenceAnswer4);
    sentenceAnswers.add(this.sentenceAnswer5);
    
    //The border picture for the fill in the blanks page
    sentencePicturePanel.add(this.emptySpace18);
    sentencePicturePanel.add(this.pictureSentence);
    
    //The buttons on the fill in the blanks page
    sentenceButtons.add(this.checkSentenceAnswers);
    sentenceButtons.add(this.backToHomeSentence);
    
    //The correct answers to the fill in the blank sentences
    sentenceCorrectAnswers.setLayout(new BoxLayout(sentenceCorrectAnswers, BoxLayout.Y_AXIS));
    sentenceCorrectAnswers.add(this.sentenceCorrectAnswer1);
    sentenceCorrectAnswers.add(this.sentenceCorrectAnswer2);
    sentenceCorrectAnswers.add(this.sentenceCorrectAnswer3);
    sentenceCorrectAnswers.add(this.sentenceCorrectAnswer4);
    sentenceCorrectAnswers.add(this.sentenceCorrectAnswer5);
    
    //All user interactions on the fill in the blanks page
    sentenceInteractions.add(this.sentenceQuestions);
    sentenceInteractions.add(this.sentenceAnswers);
    sentenceInteractions.add(this.sentenceCorrectAnswers);
    
    //The complete layout for the fill in the blanks page
    fillTheBlankPanel.setLayout(new BoxLayout(fillTheBlankPanel, BoxLayout.Y_AXIS));
    fillTheBlankPanel.add(this.sentenceTitlePanel);
    fillTheBlankPanel.add(this.sentenceDescriptionPanel);
    fillTheBlankPanel.add(this.sentenceInteractions);
    fillTheBlankPanel.add(this.sentenceButtons);
    fillTheBlankPanel.add(this.sentencePicturePanel);
    this.add(this.fillTheBlankPanel);
    this.fillTheBlankPanel.setVisible(false);
    
    //Mini game title
    gameTitle.add(this.emptySpace11);
    gameTitle.add(this.miniGameTitle);
    gameTitle.add(this.emptySpace12);
    
    //Mini game description
    gameDescription.add(miniGameDescription);
    gameDescription.add(this.emptySpace13);
    gameDescription.add(this.emptySpace14);
    
    //Mini game questions
    gameQuestions.setLayout(new BoxLayout(gameQuestions, BoxLayout.Y_AXIS));
    gameDescription.add(this.emptySpace15);
    gameQuestions.add(questionsTitle);
    gameQuestions.add(this.gameQuestion1);
    gameQuestions.add(this.gameQuestion2);
    gameQuestions.add(this.gameQuestion3);
    gameQuestions.add(this.gameQuestion4);
    gameQuestions.add(this.gameQuestion5);
    
    //Mini game options
    gameOptions.setLayout(new BoxLayout(gameOptions, BoxLayout.Y_AXIS));
    gameOptions.add(this.optionsTitle);
    gameOptions.add(this.option1);
    gameOptions.add(this.option2);
    gameOptions.add(this.option3);
    
    //Mini game buttons
    gameButtons.add(this.checkGameAnswers);
    gameButtons.add(this.backToHome);
    
    //Mini game answers
    gameAnswers.setLayout(new BoxLayout(gameAnswers, BoxLayout.Y_AXIS));
    gameAnswers.add(this.answersTitle);
    gameAnswers.add(this.gameAnswer1);
    gameAnswers.add(this.gameAnswer2);
    gameAnswers.add(this.gameAnswer3);
    gameAnswers.add(this.gameAnswer4);
    gameAnswers.add(this.gameAnswer5);
    
    //The correct answers to the mini game questions
    gameCorrectAnswers.setLayout(new BoxLayout(gameCorrectAnswers, BoxLayout.Y_AXIS));
    gameCorrectAnswers.add(this.emptySpace17);
    gameCorrectAnswers.add(this.correctAnswer1);
    gameCorrectAnswers.add(this.correctAnswer2);
    gameCorrectAnswers.add(this.correctAnswer3);
    gameCorrectAnswers.add(this.correctAnswer4);
    gameCorrectAnswers.add(this.correctAnswer5);
    
    //All user interactions in mini game
    gameInteractions.add(gameQuestions);
    gameInteractions.add(gameAnswers);
    gameInteractions.add(gameCorrectAnswers);
    gameInteractions.add(gameOptions);
    
    //Mini game border picture
    gamePicturePanel.add(this.emptySpace16);
    gamePicturePanel.add(this.pictureGame);
    
    //Mini game border picture
    gameScorePanel.add(this.gameScore);
    gameScorePanel.add(this.points);
    
    //The complete layout for the mini game
    miniGamePanel.setLayout(new BoxLayout(miniGamePanel, BoxLayout.Y_AXIS));
    miniGamePanel.add(gameTitle);
    miniGamePanel.add(gameDescription);
    miniGamePanel.add(gameInteractions);
    miniGamePanel.add(gameButtons);
    miniGamePanel.add(gameScorePanel);
    miniGamePanel.add(gamePicturePanel);
    this.add(this.miniGamePanel);
    this.miniGamePanel.setVisible(false);
    
    //The Title and Surrounding Designs
    titlePanel.add(this.title);
    
    //Program Information
    programDescription.setLayout(new BoxLayout(programDescription, BoxLayout.Y_AXIS));
    programDescription.add(this.emptySpace1);
    programDescription.add(this.description1);
    programDescription.add(this.description2);
    programDescription.add(this.description3);
    programDescription.add(this.description4);
    programDescription.add(this.description5);
    programDescription.add(this.emptySpace2);
    programDescription.add(this.emptySpace3);
    
    //User Informations
    userInfo.add(this.firstName);
    userInfo.add(this.firstNameInput);
    userInfo.add(this.emptySpace7);
    userInfo.add(this.lastName);
    userInfo.add(this.lastNameInput);
    userInfo.add(this.emptySpace8);
    userInfo.add(this.experience);
    userInfo.add(this.userExperience);
    userInfo.add(this.emptySpace9);
    
    //User Descriptions
    userDescription.setLayout(new BoxLayout(userDescription, BoxLayout.Y_AXIS));
    userDescription.add(this.emptySpace4);
    userDescription.add(this.beginnerDescription);
    userDescription.add(this.intermidiateDescription);
    userDescription.add(this.advancedDescription);
    userDescription.add(this.emptySpace6);
    userDescription.add(this.nextDescription);
    userDescription.add(this.emptySpace5);

    //The Buttons
    buttons.add(this.rules);
    buttons.add(this.miniGame);
    buttons.add(this.fillTheBlank);
    buttons.add(this.exit);
    buttonsLayout2.setLayout(new BorderLayout());
    buttonsLayout2.add(this.buttons, BorderLayout.SOUTH);
    
    //The Border Picture
    picturePanel.add(this.emptySpace10);
    picturePanel.add(this.picture);
   
    //The Complete Layout
    contents.setLayout(new BoxLayout(contents, BoxLayout.Y_AXIS));
    contents.add(this.titlePanel);
    contents.add(this.programDescription);
    contents.add(this.userInfo);
    contents.add(this.userDescription);
    contents.add(this.buttonsLayout2);
    contents.add(this.picturePanel);
    this.add(this.contents);
  }
  
  //Assigns the controllers to the buttons 
  private void registerControllers()
  {
    ButtonsController controller = new ButtonsController(frenchModel, firstNameInput, lastNameInput, userExperience, beginnerDescription, intermidiateDescription, advancedDescription, contents, miniGamePanel, gameAnswer1, gameAnswer2, gameAnswer3, gameAnswer4, gameAnswer5, correctAnswer1, correctAnswer2, correctAnswer3, correctAnswer4, correctAnswer5, points, fillTheBlankPanel, sentenceAnswer1, sentenceAnswer2, sentenceAnswer3, sentenceAnswer4, sentenceAnswer5, sentenceCorrectAnswer1, sentenceCorrectAnswer2, sentenceCorrectAnswer3, sentenceCorrectAnswer4, sentenceCorrectAnswer5, rulesPanel );
    this.rules.addActionListener(controller);
    this.miniGame.addActionListener(controller);
    this.fillTheBlank.addActionListener(controller);
    this.exit.addActionListener(controller);
    this.userExperience.addActionListener(controller);
    this.backToHome.addActionListener(controller);
    this.backToHomeSentence.addActionListener(controller);
    this.checkGameAnswers.addActionListener(controller);
    this.checkSentenceAnswers.addActionListener(controller);
    this.backToHomeRules.addActionListener(controller);
  }
  
  //Redraws the main frame based on data provded by the user
  public void update()
  {
    this.repaint();
  }
  
}//ssalc