import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Recursion {
	
	//declare global variables
	String dispString = "";
	//get the sentence from the text box
	private void ReverseString (String theSentence)
	{
		//declare local variables
		String theSentenceSubString;
		char lastChar;
		
		//if the user entered anything or there are characters in the sentence left
		if (theSentence.length() > 0)
		{
			//then create a new string that has the same as the previous sentence except for the last character
			theSentenceSubString = theSentence.substring(0, theSentence.length()-1);
			
			
			//write out the current last letter
			lastChar = theSentence.charAt(theSentence.length()-1);
			dispString = dispString + lastChar; 
			//recall the reverse function but send the new
			ReverseString(theSentenceSubString);
		}
		//when the program reached the end of the word, display the reversed word
		else if (theSentence.length() == 0)
		{
			//add the answer to the list 
			JOptionPane.showMessageDialog(null,dispString,"Stacks Warning",JOptionPane.WARNING_MESSAGE);
		}
		
	}

	private JFrame frame;
	private JTextField txtSentence;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recursion window = new Recursion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Recursion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 182);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtSentence = new JTextField();
		txtSentence.setBounds(10, 42, 414, 36);
		frame.getContentPane().add(txtSentence);
		txtSentence.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter a sentence");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(152, 12, 135, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSend = new JButton("REVERSE");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get the string from the text box
				String sentence = txtSentence.getText();
				//call ReverseString function and pass sentence as a parameter
				ReverseString(sentence);
			}
		});
		btnSend.setBounds(172, 93, 89, 23);
		frame.getContentPane().add(btnSend);
	}
}
