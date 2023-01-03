import java.awt.*;
    import java.awt.event.*;
    import java.applet.*;
    
    
    public class TextCounterApplet extends Applet implements ActionListener {
       TextArea textInput;     // For the user's input text.
       Label lineCountLabel;   // For displaying the number of lines.
       public void init() {
          
          setBackground(Color.darkGray);
          textInput = new TextArea();
          textInput.setBackground(Color.white);
          
          Panel south = new Panel();
          south.setLayout( new GridLayout(4,1,2,2) );
          
          /* Create the button, set the applet to listen for
             clicks on the button, and add it to the panel. */
          
          Button countButton = new Button("Process the Text");
          countButton.setBackground(Color.lightGray);
          countButton.addActionListener(this);
          south.add(countButton);
          
          /* Create each of the labels, set their colors, and
             add them to the panel. */
          
          lineCountLabel = new Label("  Number of lines:");
          lineCountLabel.setBackground(Color.white);
          lineCountLabel.setForeground(Color.blue);
          south.add(lineCountLabel);
   
          setLayout( new BorderLayout(2,2) );
          add(textInput, BorderLayout.CENTER);
          add(south, BorderLayout.SOUTH);
          
       } // end init();
       
       
       public Insets getInsets() {
             // Leave a 2-pixel border around the edges of the applet.
          return new Insets(2,2,2,2);
       }
       
    
       public void actionPerformed(ActionEvent evt) {
           
           String text;  // The user's input from the text area.
           int lineCt,charCt; 
           text = textInput.getText();
           charCt = text.length();       
           lineCt = 1;
           for (int i = 0; i < charCt; i++) {
              if (text.charAt(i) == '\n')
                 lineCt++;
           }
           lineCountLabel.setText("  Number of Lines:  " + lineCt);
    
       }  // end actionPerformed()
    
       
    } // end class TextCounterApplet
/*
<applet code="TextCounterApplet" width="800" height=500>
</applet> */
