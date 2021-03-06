import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeScreen {

	// Frame + Container 
	JFrame window;
	Container container;

	// Panels
	JPanel titleBox;
	JPanel startBox;

	// Labels
	JLabel startText;
	JLabel titleText;

	// Buttons 
	JButton startButton ; 
	
	// Fonts
	Font titleFont = new Font("Times New Roman", Font.BOLD, 50);
	Font buttonFont = new Font("Time New Roman", Font.BOLD, 15) ;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler() ; 

	public static void main(String[] args) {
		/*
		 * THINGS TO FIX Center the title
		 */

		new HomeScreen();
	}

	// The constructor
	HomeScreen() {

		/*
		 * 3 main layers to the GUI -> First we have the actual frame -> Then we
		 * have a container -> Lastly we have the different panels on the
		 * container
		 * 
		 * (The Logic) -> The container is located on the frame -> The JPanel
		 * would then be located onto the container -> Then the text (JLabel)
		 * would be located onto the JPanel
		 */

		// First Layer
		window = new JFrame();
		window.setSize(600, 400);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		// Second Layer
		container = window.getContentPane();

		// Third Layer
		// Title Panel + Text
		titleBox = new JPanel();
		titleBox.setBounds(50, 50, 485, 100); // Sets the bounds of the Title
		titleBox.setBackground(Color.black);
		
		titleText = new JLabel("ROAD TO RICHES"); // Actual text of the JLabel
		titleText.setForeground(Color.yellow); // color of the text
		titleText.setFont(titleFont);

		// Start Panel + Button 
		startBox = new JPanel();
		startBox.setBounds(180, 130, 200, 65); // Sets the bounds of the Title
		startBox.setBackground(Color.black);
		startBox.setFont(titleFont);
		
		
		startButton = new JButton("START") ; 
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(buttonFont) ; 
		startButton.addActionListener(tsHandler);
		
		

		// Adding text to the panels
		titleBox.add(titleText);
		startBox.add(startButton) ; 

		// Adding panels to the container
		container.add(titleBox);
		container.add(startBox);

	}
	
	public void createGameScreen() {
		startBox.setVisible(false);
		titleBox.setVisible(false);
		
	}
	
	public class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			createGameScreen() ; 
		}
	}

}