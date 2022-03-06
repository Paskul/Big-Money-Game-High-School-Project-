import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.lang.Math;




public class GameGUI extends JFrame implements ActionListener
{

  // Globalizes all the variables so it can be used across multiple methods and constantly updated 

  JButton mainClick;

  JFrame gameFrame = new JFrame();
  JFrame instructionFrame = new JFrame();
  JFrame winFrame = new JFrame();

  JLabel reevesLabel = new JLabel();
  JLabel woodLabel = new JLabel();
  JLabel nailLabel = new JLabel();
  JLabel steelLabel = new JLabel();
  JLabel glueLabel = new JLabel();

  JLabel upgradeBuyHouse = new JLabel();
  JLabel upgradeLabel = new JLabel();
  JLabel upgradeLabelReevesBucks = new JLabel();
  JLabel upgradeLabelConvertWood = new JLabel();
  JLabel upgradeLabelConvertNails = new JLabel();
  JLabel upgradeLabelConvertSteel = new JLabel();
  JLabel upgradeLabelConvertGlue = new JLabel();
  JLabel upgradeLabelIncreaseRandom = new JLabel();

  JButton increaseRandomClick = new JButton();
  JButton reevesBucksClick = new JButton();
  JButton buyHouseClick = new JButton(); 
  JButton convertWoodClick = new JButton();
  JButton convertNailsClick = new JButton();
  JButton convertSteelClick = new JButton();
  JButton convertGlueClick = new JButton();

  int reevesBucks = 0;
  int woodDrop = 0;    
  int nailDrop = 0;
  int steelDrop = 0;
  int glueDrop = 0;

  int randomMax = 40;
  int randomMin = 0;
  int randomRange = randomMax - randomMin + 1;

  int reevesLevel = 0;
  int reevesMultiplier = 1;
  int reevesBucksUpgradePrice = 25;

  int dropsLevel = 0;
  int dropsUpgradePrice = 50;

  //Sets border colors as an object

  Border borderRed = BorderFactory.createLineBorder(Color.red, 2);
  Border borderGreen = BorderFactory.createLineBorder(Color.green, 2);


  public GameGUI()
  {
    // Creates .png images set as an object that can be called under a varriale whenever desired

    ImageIcon image = new ImageIcon("wood-png-11553939275d7dasv9jlk_50x50-removebg-preview.png");
    ImageIcon woodPicture = new ImageIcon("wood-png-11553939275d7dasv9jlk_50x50-removebg-preview.png");
    ImageIcon nailPicture = new ImageIcon ("betternail_50x50-removebg-preview.png");
    ImageIcon steelPicture = new ImageIcon ("Steel_50x50-removebg-preview.png");
    ImageIcon gluePicture = new ImageIcon ("glue_50x50-removebg-preview.png");
    ImageIcon reevesBucksPicture = new ImageIcon 
    ("50x50dollar-removebg-preview.png");
    ImageIcon cookiePicture = new ImageIcon("cookie-removebg-preview.png");
    ImageIcon housePicture = new ImageIcon("house_50x50-removebg-preview.png");
    ImageIcon pascal = new ImageIcon("pascalHot_50x50-removebg-preview.png");
    
    // Creates the button object, then right away creates its traits and calls a method later down that will be used when clicked

    JButton mainClick = new JButton();
    mainClick.setBounds(195, 55, 225, 224);
    mainClick.addActionListener(e -> addReevesBucks());
    mainClick.setIcon(cookiePicture);
      
    // The next couple blocks are labels that take up space and can store + display data

    woodLabel.setText("Wood Stored: " + woodDrop);
    woodLabel.setIcon(woodPicture);
    woodLabel.setHorizontalTextPosition(woodLabel.RIGHT);
    woodLabel.setVerticalTextPosition(woodLabel.CENTER);
    woodLabel.setForeground(new Color (255, 0, 0)); // change color later on 
    woodLabel.setFont(new Font("Lucida Sans",  Font.PLAIN, 15));
    woodLabel.setIconTextGap(20);
    woodLabel.setBackground(Color.black);
    woodLabel.setOpaque(true);
    woodLabel.setBorder(borderRed);
    woodLabel.setVerticalAlignment(woodLabel.CENTER);
    woodLabel.setHorizontalAlignment(woodLabel.LEFT);
    woodLabel.setBounds(0, 0, 225, 65);


    nailLabel.setText("Nails Stored: " + nailDrop);
    nailLabel.setIcon(nailPicture);
    nailLabel.setHorizontalTextPosition(nailLabel.RIGHT);
    nailLabel.setVerticalTextPosition(nailLabel.CENTER);
    nailLabel.setForeground(new Color (255, 0, 0)); // change color later on 
    nailLabel.setFont(new Font("Lucida Sans",  Font.PLAIN, 15));
    nailLabel.setIconTextGap(20);
    nailLabel.setBackground(Color.black);
    nailLabel.setOpaque(true);
    nailLabel.setBorder(borderRed);
    nailLabel.setVerticalAlignment(nailLabel.CENTER);
    nailLabel.setHorizontalAlignment(nailLabel.LEFT);
    nailLabel.setBounds(0, 65, 225, 65);

    
    steelLabel.setText("Steel Stored: " + steelDrop);
    steelLabel.setIcon(steelPicture);
    steelLabel.setHorizontalTextPosition(steelLabel.RIGHT);
    steelLabel.setVerticalTextPosition(steelLabel.CENTER);
    steelLabel.setForeground(new Color (255, 0, 0)); // change color later on 
    steelLabel.setFont(new Font("Lucida Sans",  Font.PLAIN, 15));
    steelLabel.setIconTextGap(20);
    steelLabel.setBackground(Color.black);
    steelLabel.setOpaque(true);
    steelLabel.setBorder(borderRed);
    steelLabel.setVerticalAlignment(steelLabel.CENTER);
    steelLabel.setHorizontalAlignment(steelLabel.LEFT);
    steelLabel.setBounds(0, 130, 225, 65);

    
    glueLabel.setText("Glue Stored: " + glueDrop);
    glueLabel.setIcon(gluePicture);
    glueLabel.setHorizontalTextPosition(glueLabel.RIGHT);
    glueLabel.setVerticalTextPosition(glueLabel.CENTER);
    glueLabel.setForeground(new Color (255, 0, 0)); // change color later on 
    glueLabel.setFont(new Font("Lucida Sans",  Font.PLAIN, 15));
    glueLabel.setIconTextGap(20);
    glueLabel.setBackground(Color.black);
    glueLabel.setOpaque(true);
    glueLabel.setBorder(borderRed);
    glueLabel.setVerticalAlignment(glueLabel.CENTER);
    glueLabel.setHorizontalAlignment(glueLabel.LEFT);
    glueLabel.setBounds(0, 195, 225, 65);


    reevesLabel.setText("Reeve Bucks: " + reevesBucks);
    reevesLabel.setIcon(reevesBucksPicture);
    reevesLabel.setHorizontalTextPosition(reevesLabel.RIGHT);
    reevesLabel.setVerticalTextPosition(reevesLabel.CENTER);
    reevesLabel.setForeground(new Color (255, 0, 0)); // change color later on 
    reevesLabel.setFont(new Font("Lucida Sans",  Font.PLAIN, 15));
    reevesLabel.setIconTextGap(20);
    reevesLabel.setBackground(Color.black);
    reevesLabel.setOpaque(true);
    reevesLabel.setBorder(borderRed);
    reevesLabel.setVerticalAlignment(reevesLabel.CENTER);
    reevesLabel.setHorizontalAlignment(reevesLabel.LEFT);
    reevesLabel.setBounds(0, 260, 225, 95);
      
    // Next couple ones use the same logic as creating labels but with buttons and the label outside of the button

    upgradeBuyHouse.setForeground(new Color (255, 0, 0));
    upgradeBuyHouse.setBackground(Color.black);
    upgradeBuyHouse.setBorder(borderRed);
    upgradeBuyHouse.setVerticalAlignment(upgradeBuyHouse.BOTTOM);
    upgradeBuyHouse.setHorizontalAlignment(upgradeBuyHouse.CENTER);
    upgradeBuyHouse.setBounds(0, 355, 223, 63);
    upgradeBuyHouse.setOpaque(true);


    buyHouseClick.setBounds(0, 0, 225, 63);
    buyHouseClick.setFont(new Font("Lucida Sans", Font.PLAIN, 10));
    buyHouseClick.setText("Make the house! Materials = Green");
    buyHouseClick.setForeground(Color.red);
    buyHouseClick.setBorder(borderRed);
    buyHouseClick.addActionListener(e -> formHouse());
    upgradeBuyHouse.add(buyHouseClick);


    upgradeLabel.setForeground(new Color (255, 0, 0));
    upgradeLabel.setBackground(Color.black);
    upgradeLabel.setBorder(borderRed);
    upgradeLabel.setVerticalAlignment(upgradeLabel.BOTTOM);
    upgradeLabel.setHorizontalAlignment(upgradeLabel.CENTER);
    upgradeLabel.setBounds(225, 355, 618, 65);
    upgradeLabel.setOpaque(true);


    upgradeLabelReevesBucks.setForeground(new Color (255, 0, 0));
    upgradeLabelReevesBucks.setBackground(Color.black);
    upgradeLabelReevesBucks.setBorder(borderRed);
    upgradeLabelReevesBucks.setVerticalAlignment(upgradeLabelReevesBucks.BOTTOM);
    upgradeLabelReevesBucks.setHorizontalAlignment(upgradeLabelReevesBucks.CENTER);
    upgradeLabelReevesBucks.setOpaque(true);
    upgradeLabelReevesBucks.setBounds(0, 0, 103, 63);


    reevesBucksClick.setBounds(0, 0, 103, 63);
    reevesBucksClick.setFont(new Font("Lucida Sans", Font.PLAIN, 10));
    reevesBucksClick.setText("Reeve Bucks");
    reevesBucksClick.setForeground(Color.red);
    reevesBucksClick.addActionListener(e -> spendOnReevesBucksPlus());
    upgradeLabelReevesBucks.add(reevesBucksClick);

    
    upgradeLabelConvertWood.setForeground(new Color (255, 0, 0));
    upgradeLabelConvertWood.setBackground(Color.black);
    upgradeLabelConvertWood.setBorder(borderRed);
    upgradeLabelConvertWood.setVerticalAlignment(upgradeLabelConvertWood.BOTTOM);
    upgradeLabelConvertWood.setHorizontalAlignment(upgradeLabelConvertWood.CENTER);
    upgradeLabelConvertWood.setOpaque(true);
    upgradeLabelConvertWood.setBounds(103, 0, 103, 63);


    convertWoodClick.setBounds(0, 0, 103, 63);
    convertWoodClick.setFont(new Font("Lucida Sans", Font.PLAIN, 10));
    convertWoodClick.setText("Buy Wood");
    convertWoodClick.setForeground(Color.red);
    convertWoodClick.addActionListener(e -> spendOnWood());
    upgradeLabelConvertWood.add(convertWoodClick);

    
    upgradeLabelConvertNails.setForeground(new Color (255, 0, 0));
    upgradeLabelConvertNails.setBackground(Color.black);
    upgradeLabelConvertNails.setBorder(borderRed);
    upgradeLabelConvertNails.setVerticalAlignment(upgradeLabelConvertNails.BOTTOM);
    upgradeLabelConvertNails.setHorizontalAlignment(upgradeLabelConvertNails.CENTER);
    upgradeLabelConvertNails.setOpaque(true);
    upgradeLabelConvertNails.setBounds(206, 0, 103, 63);


    convertNailsClick.setBounds(0, 0, 103, 63);
    convertNailsClick.setFont(new Font("Lucida Sans", Font.PLAIN, 10));
    convertNailsClick.setText("Buy Nails");
    convertNailsClick.setForeground(Color.red);
    convertNailsClick.addActionListener(e -> spendOnNails());
    upgradeLabelConvertNails.add(convertNailsClick);

    
    upgradeLabelConvertSteel.setForeground(new Color (255, 0, 0));
    upgradeLabelConvertSteel.setBackground(Color.black);
    upgradeLabelConvertSteel.setBorder(borderRed);
    upgradeLabelConvertSteel.setVerticalAlignment(upgradeLabelConvertSteel.BOTTOM);
    upgradeLabelConvertSteel.setHorizontalAlignment(upgradeLabelConvertSteel.CENTER);
    upgradeLabelConvertSteel.setOpaque(true);
    upgradeLabelConvertSteel.setBounds(309, 0, 103, 63);

    
    convertSteelClick.setBounds(0, 0, 103, 63);
    convertSteelClick.setFont(new Font("Lucida Sans", Font.PLAIN, 10));
    convertSteelClick.setText("Buy Steel");
    convertSteelClick.setForeground(Color.red);
    convertSteelClick.addActionListener(e -> spendOnSteel());
    upgradeLabelConvertSteel.add(convertSteelClick);

    
    upgradeLabelConvertGlue.setForeground(new Color (255, 0, 0));
    upgradeLabelConvertGlue.setBackground(Color.black);
    upgradeLabelConvertGlue.setBorder(borderRed);
    upgradeLabelConvertGlue.setVerticalAlignment(upgradeLabelConvertGlue.BOTTOM);
    upgradeLabelConvertGlue.setHorizontalAlignment(upgradeLabelConvertGlue.CENTER);
    upgradeLabelConvertGlue.setOpaque(true);
    upgradeLabelConvertGlue.setBounds(412, 0, 103, 63);

    
    convertGlueClick.setBounds(0, 0, 103, 63);
    convertGlueClick.setFont(new Font("Lucida Sans", Font.PLAIN, 10));
    convertGlueClick.setText("Buy Glue");
    convertGlueClick.setForeground(Color.red);
    convertGlueClick.addActionListener(e -> spendOnGlue());
    upgradeLabelConvertGlue.add(convertGlueClick);

    
    upgradeLabelIncreaseRandom.setForeground(new Color (255, 0, 0));
    upgradeLabelIncreaseRandom.setBackground(Color.black);
    upgradeLabelIncreaseRandom.setBorder(borderRed);
    upgradeLabelIncreaseRandom.setVerticalAlignment(upgradeLabelIncreaseRandom.BOTTOM);
    upgradeLabelIncreaseRandom.setHorizontalAlignment(upgradeLabelIncreaseRandom.CENTER);
    upgradeLabelIncreaseRandom.setOpaque(true);
    upgradeLabelIncreaseRandom.setBounds(515, 0, 103, 63);

    
    increaseRandomClick.setBounds(0, 0, 103, 63);
    increaseRandomClick.setFont(new Font("Lucida Sans", Font.PLAIN, 10));
    increaseRandomClick.setText("More Drops");
    increaseRandomClick.setForeground(Color.red);
    increaseRandomClick.addActionListener(e -> spendOnMoreDrops());
    upgradeLabelIncreaseRandom.add(increaseRandomClick);


    upgradeLabel.add(upgradeLabelReevesBucks);
    upgradeLabel.add(upgradeLabelConvertWood);
    upgradeLabel.add(upgradeLabelConvertNails);
    upgradeLabel.add(upgradeLabelConvertSteel);
    upgradeLabel.add(upgradeLabelConvertGlue);
    upgradeLabel.add(upgradeLabelIncreaseRandom);


    JLabel gameScreenLabel = new JLabel();
    gameScreenLabel.setForeground(new Color (255, 0, 0));
    gameScreenLabel.setBackground(Color.black);
    gameScreenLabel.setBorder(borderRed);
    gameScreenLabel.setVerticalAlignment(gameScreenLabel.TOP);
    gameScreenLabel.setHorizontalAlignment(gameScreenLabel.CENTER);
    gameScreenLabel.setBounds(225, 0, 618, 355);
    gameScreenLabel.add(mainClick);

    // Creates the actual main game frame that holds the main labels and buttons (Just the real game)

    gameFrame.setTitle("Game"); // Frame name
    // gameFrame.setSize(843, 420);
    gameFrame.setSize(900, 460); // Sets frame dimension
    gameFrame.setVisible(true); // Maxes frame oppacity
    gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stops program when window close
    gameFrame.setResizable(false); // Prevent frame from resizing
    gameFrame.getContentPane().setBackground(new Color(255, 255, 230)); // Creates colored background
      
    // Putting labels and buttons into the main game frame
    
    gameFrame.add(woodLabel);
    gameFrame.add(nailLabel);
    gameFrame.add(steelLabel);
    gameFrame.add(glueLabel);
    gameFrame.add(reevesLabel);
    gameFrame.add(upgradeLabel);
    gameFrame.add(gameScreenLabel);
    gameFrame.add(upgradeBuyHouse);
    gameFrame.setLayout(null);

    // Creating the instuction label at the start that will go into a instruction frame created soon afterwards

    JLabel instructionLabel = new JLabel();
    instructionLabel.setIcon(pascal);
    instructionLabel.setText("Pascal says: \"Press the cookie and buy upgrades to buy a house!\"");
    instructionLabel.setHorizontalTextPosition(JLabel.CENTER); // Can use LEFT, CENTER, RIGHT
    instructionLabel.setVerticalTextPosition(JLabel.BOTTOM); // Can use TOP, CENTER, BOTTOM
    instructionLabel.setForeground(Color.black); // Set color of font
    instructionLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
    instructionLabel.setIconTextGap(10); // Gap between text and picture
    instructionLabel.setBackground(new Color(255, 255, 230));
    instructionLabel.setOpaque(true); // Displays background
    instructionLabel.setVerticalAlignment(JLabel.CENTER); // Set vertical position of icon+text within label, BOTTOM, CENTER, TOP
    instructionLabel.setHorizontalAlignment(JLabel.CENTER); // Set horizontal position of icon+text within label, LEFT, CENTER, RIGHT
    instructionLabel.setBounds(0, 0, 500, 200); // x, y, width, height

    // Label for win frame that displays the "You won!" text and data

    JLabel winLabel = new JLabel();
    winLabel.setText("You beat the game, and built the house!");
    winLabel.setIcon(housePicture);
    winLabel.setHorizontalTextPosition(JLabel.CENTER);
    winLabel.setVerticalTextPosition(JLabel.BOTTOM);
    winLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
    winLabel.setIconTextGap(10);
    winLabel.setBackground(Color.black);
    winLabel.setOpaque(false);
    winLabel.setBounds(0, 0, 300, 300);
    


  

    instructionFrame.setTitle("Instructions"); // Frame name
    instructionFrame.setSize(500, 200); // Sets frame dimension
    instructionFrame.setVisible(true); // Maxes frame oppacity
    instructionFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Stops program when window close
    instructionFrame.setResizable(false); // Prevent frame from resizing
    instructionFrame.getContentPane().setBackground(new Color(255, 255, 230)); // Creates colored background
    instructionFrame.setLayout(null);
    instructionFrame.add(instructionLabel);

    // Creating the win frame that was referenced before

    winFrame.setTitle("Congratulations!");
    winFrame.setSize(300, 300);
    winFrame.setVisible(false);
    winFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    winFrame.setResizable(false);
    winFrame.getContentPane().setBackground(new Color(255, 255, 230));
    winFrame.setLayout(null);
    winFrame.add(winLabel);


  }

  // The reevesBucks++ doesnt actually do anything, but we need to create this method in order for buttons to register a click as an actual thing

  public void actionPerformed(ActionEvent e)
  {
    reevesBucks++;
  }

  // Method for when the main cookie button is pressed, refreshes the display after each click and runs the math to adjust int values
  
  // Also hosts a randomizer that dictates what material drop will be given per click if there even is a drop avaliable

  public void addReevesBucks()
  {
    reevesBucks = reevesBucks + reevesMultiplier;
    reevesLabel.setText("Reeve Bucks: " + reevesBucks);
    int randomResult = (int)(Math.random() * randomMax) + randomMin;

    if (randomResult == 1)
    {
      woodDrop = woodDrop + 1;
      woodLabel.setText("Wood Stored: " + woodDrop);
    }
    if (randomResult == 2)
    {
      nailDrop = nailDrop + 1;
      nailLabel.setText("Nails Stored: " + nailDrop);
    }
    if (randomResult == 3)
    {
      steelDrop = steelDrop + 1;
      steelLabel.setText("Steel Stored: " + steelDrop);
    }
    if (randomResult == 4)
    {
      glueDrop = glueDrop + 1;
      glueLabel.setText("Glue Stored: " + glueDrop);
    }

    if (reevesBucks >= reevesBucksUpgradePrice)
    {
      reevesBucksClick.setForeground(Color.green);
    }
      else
      {
        reevesBucksClick.setForeground(Color.red);
      }

    if (reevesBucks >= dropsUpgradePrice)
    {
      increaseRandomClick.setForeground(Color.green);
    }
      else
      {
        increaseRandomClick.setForeground(Color.red);
      }

    if (reevesBucks >= 70)
    {
      convertWoodClick.setForeground(Color.green);
    }
      else
      {
        convertWoodClick.setForeground(Color.red);
      }
    
    if (reevesBucks >= 100)
    {
      convertNailsClick.setForeground(Color.green);
    }
      else
      {
        convertNailsClick.setForeground(Color.red);
      }

    if (reevesBucks >= 180)
    {
      convertSteelClick.setForeground(Color.green);
    }
      else
      {
        convertSteelClick.setForeground(Color.red);
      }

    if (reevesBucks >= 250)
    {
      convertGlueClick.setForeground(Color.green);
    }
      else
      {
        convertGlueClick.setForeground(Color.red);
      }


    if (woodDrop >= 150)
    {
      woodLabel.setForeground(new Color (0, 255, 0));
      woodLabel.setBorder(borderGreen);
    }
      else
      {
        woodLabel.setForeground(new Color (255, 0, 0));
        woodLabel.setBorder(borderRed);
      }
    if (nailDrop >= 125)
    {
      nailLabel.setForeground(new Color (0, 255, 0));
      nailLabel.setBorder(borderGreen);
    }
      else
      {
        nailLabel.setForeground(new Color (255, 0, 0));
        nailLabel.setBorder(borderRed);
      }
    if (steelDrop >= 100)
    {
      steelLabel.setForeground(new Color (0, 255, 0));
      steelLabel.setBorder(borderGreen);
    }
      else
      {
        steelLabel.setForeground(new Color (255, 0, 0));
        steelLabel.setBorder(borderRed);
      }

    if (glueDrop >= 75)
    {
      glueLabel.setForeground(new Color(0, 255, 0));
      glueLabel.setBorder(borderGreen);
    }
      else
      {
        glueLabel.setForeground(new Color(255, 0, 0));
        glueLabel.setBorder(borderRed);
      }
    colorClock();
  }

  // Method that updates values and display accoridng to if the upgrade to increase reeve bucks per turn is pressed

  public void spendOnReevesBucksPlus()
  {
    if (reevesBucks >= reevesBucksUpgradePrice)
    {
      reevesBucks = reevesBucks - reevesBucksUpgradePrice;
      reevesLevel = reevesLevel + 1;
      if (reevesLevel == 1)
      {
        reevesMultiplier = 2;
        reevesBucksUpgradePrice = 60;
      }

      if (reevesLevel == 2)
      {
        reevesMultiplier = 4;
        reevesBucksUpgradePrice = 125;
      }

      if (reevesLevel == 3)
      {
        reevesMultiplier = 9;
        reevesBucksUpgradePrice = 200;
      }

      if (reevesLevel == 4)
      {
        reevesMultiplier = 12;
        reevesBucksUpgradePrice = 300;
      }

      if (reevesLevel == 5)
      {
        reevesMultiplier = 18;
        reevesBucksUpgradePrice = 99999999;
        reevesBucksClick.setText("MAX");
      }
    }
    if (reevesBucks >= reevesBucksUpgradePrice)
    {
      reevesBucksClick.setForeground(Color.green);
    }
      else
      {
        reevesBucksClick.setForeground(Color.red);
      }
    reevesLabel.setText("Reeve Bucks: " + reevesBucks);
    colorClock();
  }

  // Method that updates values and display accoridng to if the upgrade to spend on wood is pressed

  public void spendOnWood()
  {
    if (reevesBucks >= 70)
    {
      reevesBucks = reevesBucks - 70;
      woodDrop = woodDrop + 1;
      reevesLabel.setText("Reeve Bucks: " + reevesBucks);
      woodLabel.setText("Wood Stored: " + woodDrop);
      if (reevesBucks >= 70)
      {
        convertWoodClick.setForeground(Color.green);
      }
        else
        {
          convertWoodClick.setForeground(Color.red);
        }
    }
    if (woodDrop >= 150)
    {
      woodLabel.setForeground(new Color (0, 255, 0));
      woodLabel.setBorder(borderGreen);
    }
      else
      {
        woodLabel.setForeground(new Color (255, 0, 0));
        woodLabel.setBorder(borderRed);
      }
    colorClock();
  }

  // Method that updates values and display accoridng to if the upgrade to spend on nails is pressed

  public void spendOnNails()
  {
    if (reevesBucks >= 100)
    {
      reevesBucks = reevesBucks - 100;
      nailDrop = nailDrop + 1;
      reevesLabel.setText("Reeve Bucks: " + reevesBucks);
      nailLabel.setText("Nails Stored: " + nailDrop);
      if (reevesBucks >= 100)
      {
        convertNailsClick.setForeground(Color.green);
      }
        else
        {
          convertNailsClick.setForeground(Color.red);
        }
    }
    if (nailDrop >= 125)
    {
      nailLabel.setForeground(new Color (0, 255, 0));
      nailLabel.setBorder(borderGreen);
    }
      else
      {
        nailLabel.setForeground(new Color (255, 0, 0));
        nailLabel.setBorder(borderRed);
      }
    colorClock();
  }

  // Method that updates values and display accoridng to if the upgrade to spend on steel is pressed

  public void spendOnSteel()
  {
    if (reevesBucks >= 180)
    {
      reevesBucks = reevesBucks - 180;
      steelDrop = steelDrop + 1;
      reevesLabel.setText("Reeve Bucks: " + reevesBucks);
      steelLabel.setText("Steel Stored: " + steelDrop);
      if (reevesBucks >= 180)
      {
        convertSteelClick.setForeground(Color.green);
      }
        else
        {
          convertSteelClick.setForeground(Color.red);
        }
    }
    if (steelDrop >= 100)
    {
      steelLabel.setForeground(new Color (0, 255, 0));
      steelLabel.setBorder(borderGreen);
    }
      else
      {
        steelLabel.setForeground(new Color (255, 0, 0));
        steelLabel.setBorder(borderRed);
      }
    colorClock();
  }

  // Method that updates values and display accoridng to if the upgrade to spend on glue is pressed

  public void spendOnGlue()
  {
    if (reevesBucks >= 250)
    {
      reevesBucks = reevesBucks - 250;
      glueDrop = glueDrop + 1;
      reevesLabel.setText("Reeve Bucks: " + reevesBucks);
      glueLabel.setText("Glue Stored: " + glueDrop);
      if (reevesBucks >= 250)
      {
        convertGlueClick.setForeground(Color.green);
      }
        else
        {
          convertGlueClick.setForeground(Color.red);
        }
    }
    if (glueDrop >= 75)
    {
      glueLabel.setForeground(new Color(0, 255, 0));
      glueLabel.setBorder(borderGreen);
    }
      else
      {
        glueLabel.setForeground(new Color(255, 0, 0));
        glueLabel.setBorder(borderRed);
      }
    colorClock();
  }

  // Method that updates values and display accoridng to if the upgrade to increase drop rate is pressed

  public void spendOnMoreDrops()
  {
    if (reevesBucks >= dropsUpgradePrice)
    {
      reevesBucks = reevesBucks - dropsUpgradePrice;
      dropsLevel = dropsLevel + 1;
      if (dropsLevel == 1)
      {
        randomMax = 21;
        dropsUpgradePrice = 100;
      }
      if (dropsLevel == 2)
      {
        randomMax = 11;
        dropsUpgradePrice = 200;
      }
      if (dropsLevel == 3)
      {
        randomMax = 5;
        dropsUpgradePrice = 9999999;
        increaseRandomClick.setText("MAX");
      }

      if (reevesBucks >= dropsUpgradePrice)
      {
        increaseRandomClick.setForeground(Color.green);
      }
        else
        {
          increaseRandomClick.setForeground(Color.red);
        }
    }
    reevesLabel.setText("Reeve Bucks: " + reevesBucks);
    colorClock();
  }

  // Method that will call frames to change their visibility, only displaying the win frame, and completing the game

  public void formHouse()
  {
    if (woodDrop >= 150)
    {
      if (nailDrop >= 125)
      {
        if (steelDrop >= 100) 
        {
          if (glueDrop >= 75)
          {
              gameFrame.setVisible(false);
              instructionFrame.setVisible(false);
              winFrame.setVisible(true);
          }
        }
      }  
    }
  }

  // This is what I like to think of it as the clock that refreshes color values after every click, in a way we just implemented a time method that updates after any click or "event" in our game

  // This method is also called at the end of every other method, which those methods are called for their specific button press, so pretty much this method is running all the time

  public void colorClock()
  {
    if (reevesBucks >= 70)
    {
      convertWoodClick.setForeground(Color.green);
    }
      else
      {
        convertWoodClick.setForeground(Color.red);
      }
    if (reevesBucks >= 100)
    {
      convertNailsClick.setForeground(Color.green);
    }
      else
      {
        convertNailsClick.setForeground(Color.red);
      }
    if (reevesBucks >= 180)
    {
      convertSteelClick.setForeground(Color.green);
    }
      else
      {
        convertSteelClick.setForeground(Color.red);
      }
    if (reevesBucks >= 250)
    {
      convertGlueClick.setForeground(Color.green);
    }
      else
      {
        convertGlueClick.setForeground(Color.red);
      }
    if (reevesBucks >= reevesBucksUpgradePrice)
    {
      reevesBucksClick.setForeground(Color.green);
    }
      else
      {
        reevesBucksClick.setForeground(Color.red);
      }
    if (reevesBucks >= dropsUpgradePrice)
    {
      increaseRandomClick.setForeground(Color.green);
    }
      else
      {
        increaseRandomClick.setForeground(Color.red);
      }
    if (woodDrop >= 150)
    {
      if (nailDrop >= 125)
      {
        if (steelDrop >= 100) 
        {
          if (glueDrop >= 75)
          {
            buyHouseClick.setForeground(Color.green);
            buyHouseClick.setBorder(borderGreen);
          }
        }
      }
    }
  }
}