package highmark;

//Shaun Dougherty

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Shaun{

public static int index;

  public static Container createContentPane() {
      
      //Call the contents for the contentpane

       String[] boxOptions = {"Select a Temperature", "Fahrenheit", "Celsius", "Kelvin"};

      JTextField txtFahr = new JTextField(8);
       JTextField txtCels = new JTextField(8);
        JTextField txtKelv = new JTextField(8);
        txtFahr.setText("0.00");
        txtCels.setText("0.00");
        txtKelv.setText("0.00");
        
      JLabel lblFahrSolve = new JLabel("0.00F ");
      JLabel lblCelsSolve = new JLabel("0.00C ");
      JLabel lblKelvSolve = new JLabel("0.00K ");
      
      JLabel lblFahr = new JLabel("Farenheit: ");
      JLabel lblCels = new JLabel("Celsius: ");
      JLabel lblKelv = new JLabel("Kelvin: ");  
      
      JComboBox CalcOptions = new JComboBox(boxOptions);
              
      
      JButton cmdCalc = new JButton("Calculate");
     cmdCalc.setEnabled(false);
     
     txtCels.setEnabled(false);
     txtKelv.setEnabled(false);
     txtFahr.setEnabled(false);
      
     JButton cmdExit = new JButton("Exit");
     JButton cmdClear = new JButton("Clear Fields");
     
     cmdClear.setEnabled(false);
     
     cmdClear.addActionListener(new ActionListener() {
     
     public void actionPerformed(ActionEvent e) {
      
      lblFahrSolve.setText("0.00F");
      lblCelsSolve.setText("0.00C");
      lblKelvSolve.setText("0.00K");
        txtFahr.setText("0.00");
        txtCels.setText("0.00");
        txtKelv.setText("0.00");
    }
  });
 
      
      CalcOptions.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
    int index = 0;
   
   
    
   index = CalcOptions.getSelectedIndex();
    
    if (index == 1 || index == 2 || index == 3) {
       cmdCalc.setEnabled(true);
       cmdClear.setEnabled(true);
   }
   
   else {
       
       cmdCalc.setEnabled(false);
       cmdClear.setEnabled(false);
    }
      switch (index) {
      case 1 :
          txtFahr.setEnabled(true);
       txtCels.setEnabled(false);
       txtKelv.setEnabled(false);
       break;
       case 2: 
          txtCels.setEnabled(true);
       txtFahr.setEnabled(false);
       txtKelv.setEnabled(false);
       break;
       
       case 3: 
          txtKelv.setEnabled(true); 
          txtCels.setEnabled(false);
          txtFahr.setEnabled(false);
          break;
       default:
       txtFahr.setEnabled(false);
       txtCels.setEnabled(false);
       txtKelv.setEnabled(false);
    }
   }
});

      
      cmdCalc.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
    /* Fahrenheit (F)	F	(F – 32) * 5/9	(F – 32) * 5/9 + 273.15
       Celsius (C or o)	(C * 9/5) + 32	C	C + 273.15
       Kelvin (K)	(K – 273.15) * 9/5 + 32	K – 273.15	K
    */
     //try
     //{
       
        double fahrValue = 32;
        double celsValue = 32;
        double kelvValue = 273.15;
        
        
         
     
       switch (index)
       {
         case 1:
             fahrValue = Double.parseDouble(txtFahr.getText());  
          break;
          
         case 2:
                celsValue = Double.parseDouble(txtCels.getText());
                celsValue = (fahrValue - 32) * 5 / 9;
          break;
       
          case 3: 
            kelvValue = Double.parseDouble(txtKelv.getText());   
            kelvValue = celsValue + 273.15;
            break;
       }
               
       lblFahrSolve.setText(String.valueOf(fahrValue) + "F");
       lblCelsSolve.setText(String.valueOf(celsValue) + "C");
       lblKelvSolve.setText(String.valueOf(kelvValue) + "K");
    
    
   }
  /* catch (Exception e) {
       JOptionPane.ShowOptionDialog(this, "Error: Invalid data entered!", "Error Occurred", JOPTIONPANE.INFORMATION_MESS
   }*/
});
      cmdExit.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
     System.exit(0);
   }
});

      //Create the contentpane
      JPanel contentPane = new JPanel(new FlowLayout());
      
      
      //Add the conents to the content pane.
     
      contentPane.add(lblFahr);
      contentPane.add(txtFahr);
    
      contentPane.add(lblCels);
      contentPane.add(txtCels);

      contentPane.add(lblKelv);
      contentPane.add(txtKelv);      
      
      contentPane.add(lblFahrSolve);
      contentPane.add(lblCelsSolve);
      contentPane.add(lblKelvSolve);

      contentPane.add(CalcOptions);
      
      contentPane.add(cmdCalc);
      contentPane.add(cmdClear);
      contentPane.add(cmdExit);

      return contentPane;
  }


  /**
   * Create the GUI and show it.  For thread safety,
   * this method should be invoked from the
   * event-dispatching thread.
   */
  private static void createAndShowGUI() {
      //Create and set up the window.
      JFrame frame = new JFrame("Temperature Converter");
      //frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //Create and set up the content pane.
      //MenuDemo demo = new MenuDemo();
      //frame.setJMenuBar(demo.createMenuBar());
      frame.setContentPane(Shaun.createContentPane());
       frame.pack();
      //Display the window.
     
      frame.setResizable(false);
      frame.setSize( 200, 350);
      frame.setVisible(true);
  }

  public static void main(String[] args) {
      //Schedule a job for the event-dispatching thread:
      //creating and showing this application's GUI.
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              createAndShowGUI();
          }
      });
  }
}
